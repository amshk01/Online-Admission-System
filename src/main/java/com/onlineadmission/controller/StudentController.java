package com.onlineadmission.controller;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.onlineadmission.dao.MobileVerificationDao;
import com.onlineadmission.dao.StudentDao;
import com.onlineadmission.model.MobileVerification;
import com.onlineadmission.model.Student;
import com.onlineadmission.utility.DBContants;
import com.onlineadmission.utility.GenerateOTP;
import com.onlineadmission.utility.SendOTP;
import com.onlineadmission.utility.DBContants.IsMobileVerified;

@Controller
public class StudentController {
	
	private static Logger LOG = LogManager.getLogger(StudentController.class);
	
	@Autowired
	private StudentDao studentDao;
	
	@Autowired
	private MobileVerificationDao mobileVerificationDao;
	
	@GetMapping("/studentlogin")
	public String goToStudentLoginPage() {
		LOG.info("Redirecting to Student Login Page.");
		return "studentlogin";
	}
	
	@GetMapping("/studentregister")
	public String goToStudentRegisterPage() {
		LOG.info("Redirecting to Student Register Page.");
		return "studentregister";
	}
	
	@GetMapping("/verifymobileno")
	public String verifyMobileNumberPage() {
	    return "verifymobileno";  // This should be the name of your JSP file for OTP verification
	}

	
	@PostMapping("/studentregister")
	@ResponseBody
	public Map<String, Object> registerStudent(@ModelAttribute Student student, HttpServletRequest request) {
	    Map<String, Object> response = new HashMap<>();
	    
	    if(studentDao.existsByUsername(student.getUsername())) {
	        response.put("success", false);
	        response.put("message", "Username already exists. Please choose a different one.");
	        return response;
	    }

	    if(studentDao.existsByEmailid(student.getEmailid())) {
	        response.put("success", false);
	        response.put("message", "Email already exists. Please choose a different one.");
	        return response;
	    }

	    if(studentDao.existsByMobileno(student.getMobileno())) {
	        response.put("success", false);
	        response.put("message", "Mobile number already exists. Please choose a different one.");
	        return response;
	    }

	    
	    
				
	    HttpSession session = request.getSession();
	    session.setAttribute("registering-student", student);

	    String otp = GenerateOTP.generateOTP(6);
	    System.out.println(otp);
	    SendOTP.sendOTP("Use this OTP for Student Registration  \n OTP : "+otp, student.getMobileno(), DBContants.apiKey);

	    MobileVerification mobileV = new MobileVerification();
	    mobileV.setMobile(student.getMobileno());
	    mobileV.setOtp(otp);
	    mobileVerificationDao.save(mobileV);

	    response.put("success", true);
	    response.put("message", "Please verify OTP");
	    return response;
	}
	
	@PostMapping("/verify-and-register-student")
	public ModelAndView verifyAndRegisterStudent(HttpSession session, @RequestParam("otp") String otp) {
		ModelAndView mv = new ModelAndView();
		
		Student student = (Student)session.getAttribute("registering-student");
		
		session.removeAttribute("registering-student");
        
		
		
		List<MobileVerification> mobileVerificationList = mobileVerificationDao.findAllByMobile(student.getMobileno());
		
	    MobileVerification mobileV = null;

	    // Handling based on the size of the returned list
	    if (mobileVerificationList.size() > 1) {
	        LOG.warn("Multiple OTP entries found for mobile number: " + student.getMobileno());
	        // Decide what to do: maybe throw an exception or take the latest entry based on timestamp
	        // For now, let's take the first entry, but ideally, you'd handle this more gracefully.
	        mobileV = mobileVerificationList.get(0);
	    } else if (mobileVerificationList.isEmpty()) {
	        // Handle case where no OTP entries are found. Return an appropriate message or view.
	        mv.addObject("status", "OTP not found or expired. Please request a new OTP.");
	        mv.setViewName("studentregister");
	        return mv;
	    } else {
	        mobileV = mobileVerificationList.get(0);
	    }

		
		if(mobileV.getOtp().equals(otp)) {
			
			student.setIsVerified(IsMobileVerified.YES.value());
			student.setRegisterDate(LocalDateTime.now().toString());
			
			if(studentDao.save(student) != null) {
				
				mobileVerificationDao.delete(mobileV);
				
				mv.addObject("status", student.getFirstname()+" registered successfully as Student");
				mv.setViewName("studentlogin");
				return mv;
			}
			
			else {
				mv.addObject("status", "Failed to register Student");
				mv.setViewName("studentregister");
				return mv;
			}
			
		}
		
		else {
			mv.addObject("status", "Failed to Register Student, OTP Verification failed!");
			mv.setViewName("studentregister");
			return mv;
		}
		
	}
	
	@PostMapping("/studentlogin")
	public ModelAndView loginStudent(HttpServletRequest request, @RequestParam String username, @RequestParam String password ) {
		ModelAndView mv = new ModelAndView();
		Student student =this.studentDao.findByUsernameAndPassword(username, password);
		if(student != null) {
			HttpSession session = request.getSession();
			session.setAttribute("active-user", student);
			session.setAttribute("user-login","student");
			mv.addObject("status", username+" Successfully Logged in as STUDENT");
			mv.setViewName("index");
		}
		
		else {
			mv.addObject("status"," Failed to Login as STUDENT");
			mv.setViewName("studentlogin");
		}
		
		return mv;
	}
	
	@GetMapping("/myprofile")
	public String goToShowProfilePage() {
		LOG.info("Redirecting to Show Profile Page.");
		return "showprofile";
	}
	
	@GetMapping("/forgetpassword")
	public String goToForgetPasswordPage() {
		LOG.info("Redirecting to forget password page");
		return "forgetpassword";
	}
	
	@PostMapping("/forgetpassword")
	public ModelAndView forgetPassword(HttpServletRequest request, @RequestParam("username") String username, @RequestParam("mobile") String mobile) {
		ModelAndView mv = new ModelAndView();
		Student student =this.studentDao.findByUsernameAndMobileno(username, mobile);
		if(student != null) {
			
			String otp = GenerateOTP.generateOTP(6);
			System.out.println(otp);
			SendOTP.sendOTP("Use this OTP for Verification for Forget Password \n OTP : "+otp,student.getMobileno(),DBContants.apiKey);
			
			MobileVerification mobileV = new MobileVerification();
			mobileV.setMobile(student.getMobileno());
			mobileV.setOtp(otp);
			
			mobileVerificationDao.save(mobileV);
			
			HttpSession session = request.getSession();
			session.setAttribute("forget-pass-student", student);
			mv.addObject("status", "Enter the Recieved OTP & And Set Password");
			mv.setViewName("setpassword");
		}
		
		else {
			mv.addObject("status","This Student is not found, Please Register");
			mv.setViewName("studentregister");
		}
		
		return mv;
	}
	
	@PostMapping("/setpassword")
	public ModelAndView verifyAndSetPassword(HttpSession session, @RequestParam("otp") String otp, @RequestParam("password") String password) {
		ModelAndView mv = new ModelAndView();
		
        Student student = (Student)session.getAttribute("forget-pass-student");
		
		session.removeAttribute("forget-pass-student");
        
		MobileVerification mobileV = new MobileVerification();
		
		List<MobileVerification> mobileVerificationList = mobileVerificationDao.findAllByMobile(student.getMobileno());

		
		if(mobileV.getOtp().equals(otp)) {
			
			mobileVerificationDao.delete(mobileV);

			student.setPassword(password);
			studentDao.save(student);
			
			mv.addObject("status","Student password changed successfully.");
			mv.setViewName("studentlogin");
			return mv;
		}
		
		else {
			mv.addObject("status","OTP verification failed");
			mobileVerificationDao.delete(mobileV);
			mv.setViewName("studentregister");
			return mv;
		}
	
	}
	
	@GetMapping("/changepassword")
	public String goToChangePasswordPage() {
		LOG.info("Redirecting to change password page");
		return "changepassword";
	}
	
	@PostMapping("/changepassword")
	public ModelAndView changePassword(HttpSession session, @RequestParam("password") String password) {
		ModelAndView mv = new ModelAndView();
		
        Student student = (Student)session.getAttribute("active-user");
		
		student.setPassword(password);
		
		studentDao.save(student);
		
		session.removeAttribute("active-user");
		session.removeAttribute("user-login");
		mv.addObject("status","Password Changed successfully, Please Login again");
		mv.setViewName("index");
		
		return mv;
	
	}
	
	@GetMapping("/logout")
	public ModelAndView logout(HttpSession session) {
		ModelAndView mv = new ModelAndView();
		
		session.removeAttribute("active-user");
		session.removeAttribute("user-login");
		mv.addObject("status","Logged out Successfully");
		mv.setViewName("index");
		
		return mv;
	}
	

}

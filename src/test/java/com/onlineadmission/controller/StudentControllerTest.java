package com.onlineadmission.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.onlineadmission.dao.MobileVerificationDao;
import com.onlineadmission.dao.StudentDao;
import com.onlineadmission.model.MobileVerification;
import com.onlineadmission.model.Student;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {StudentController.class})
@ExtendWith(SpringExtension.class)
class StudentControllerTest {
    @MockBean
    private MobileVerificationDao mobileVerificationDao;

    @Autowired
    private StudentController studentController;

    @MockBean(name = "studentDao")
    private StudentDao studentDao;

    /**
     * Method under test: {@link StudentController#goToStudentLoginPage()}
     */
    @Test
    void testGoToStudentLoginPage() {

        assertEquals("studentlogin", (new StudentController()).goToStudentLoginPage());
    }

    /**
     * Method under test: {@link StudentController#goToStudentRegisterPage()}
     */
    @Test
    void testGoToStudentRegisterPage() {

        assertEquals("studentregister", (new StudentController()).goToStudentRegisterPage());
    }

    /**
     * Method under test: {@link StudentController#registerStudent(Student, HttpServletRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRegisterStudent() {

        StudentController studentController = new StudentController();

        Student student = new Student();
        student.setCity("Oxford");
        student.setEmailid("jane.doe@example.org");
        student.setFirstname("Jane");
        student.setId(1);
        student.setIsVerified(1);
        student.setLastname("Doe");
        student.setMobileno("Mobileno");
        student.setPassword("university");
        student.setPincode("Pincode");
        student.setRegisterDate("2020-03-01");
        student.setStreet("Street");
        student.setUsername("janedoe");
        studentController.registerStudent(student, new MockHttpServletRequest());
    }

    /**
     * Method under test: {@link StudentController#registerStudent(Student, HttpServletRequest)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRegisterStudent2() {

        StudentController studentController = new StudentController();
        Student student = mock(Student.class);
        when(student.getUsername()).thenReturn("janedoe");
        doNothing().when(student).setCity(Mockito.<String>any());
        doNothing().when(student).setEmailid(Mockito.<String>any());
        doNothing().when(student).setFirstname(Mockito.<String>any());
        doNothing().when(student).setId(anyInt());
        doNothing().when(student).setIsVerified(anyInt());
        doNothing().when(student).setLastname(Mockito.<String>any());
        doNothing().when(student).setMobileno(Mockito.<String>any());
        doNothing().when(student).setPassword(Mockito.<String>any());
        doNothing().when(student).setPincode(Mockito.<String>any());
        doNothing().when(student).setRegisterDate(Mockito.<String>any());
        doNothing().when(student).setStreet(Mockito.<String>any());
        doNothing().when(student).setUsername(Mockito.<String>any());
        student.setCity("Oxford");
        student.setEmailid("jane.doe@example.org");
        student.setFirstname("Jane");
        student.setId(1);
        student.setIsVerified(1);
        student.setLastname("Doe");
        student.setMobileno("Mobileno");
        student.setPassword("university");
        student.setPincode("Pincode");
        student.setRegisterDate("2020-03-01");
        student.setStreet("Street");
        student.setUsername("janedoe");
        studentController.registerStudent(student, new MockHttpServletRequest());
    }

    /**
     * Method under test: {@link StudentController#verifyAndRegisterStudent(HttpSession, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testVerifyAndRegisterStudent() {

        StudentController studentController = new StudentController();
        studentController.verifyAndRegisterStudent(new MockHttpSession(), "Otp");
    }

    /**
     * Method under test: {@link StudentController#verifyAndRegisterStudent(HttpSession, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testVerifyAndRegisterStudent2() {

        (new StudentController()).verifyAndRegisterStudent(null, "Otp");
    }

    /**
     * Method under test: {@link StudentController#verifyAndRegisterStudent(HttpSession, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testVerifyAndRegisterStudent3() {

        StudentController studentController = new StudentController();

        Student student = new Student();
        student.setCity("Oxford");
        student.setEmailid("jane.doe@example.org");
        student.setFirstname("Jane");
        student.setId(1);
        student.setIsVerified(1);
        student.setLastname("Doe");
        student.setMobileno("registering-student");
        student.setPassword("university");
        student.setPincode("registering-student");
        student.setRegisterDate("2020-03-01");
        student.setStreet("registering-student");
        student.setUsername("janedoe");
        MockHttpSession session = mock(MockHttpSession.class);
        when(session.getAttribute(Mockito.<String>any())).thenReturn(student);
        doNothing().when(session).putValue(Mockito.<String>any(), Mockito.<Object>any());
        doNothing().when(session).removeAttribute(Mockito.<String>any());
        session.putValue("Name", "Value");
        studentController.verifyAndRegisterStudent(session, "Otp");
    }

    /**
     * Method under test: {@link StudentController#goToForgetPasswordPage()}
     */
    @Test
    void testGoToForgetPasswordPage() {

        assertEquals("forgetpassword", (new StudentController()).goToForgetPasswordPage());
    }

    /**
     * Method under test: {@link StudentController#verifyAndSetPassword(HttpSession, String, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testVerifyAndSetPassword() {

        StudentController studentController = new StudentController();
        studentController.verifyAndSetPassword(new MockHttpSession(), "Otp", "university");
    }

    /**
     * Method under test: {@link StudentController#verifyAndSetPassword(HttpSession, String, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testVerifyAndSetPassword2() {


        (new StudentController()).verifyAndSetPassword(null, "Otp", "university");
    }

    /**
     * Method under test: {@link StudentController#verifyAndSetPassword(HttpSession, String, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testVerifyAndSetPassword3() {

        StudentController studentController = new StudentController();

        Student student = new Student();
        student.setCity("Oxford");
        student.setEmailid("jane.doe@example.org");
        student.setFirstname("Jane");
        student.setId(1);
        student.setIsVerified(1);
        student.setLastname("Doe");
        student.setMobileno("forget-pass-student");
        student.setPassword("university");
        student.setPincode("forget-pass-student");
        student.setRegisterDate("2020-03-01");
        student.setStreet("forget-pass-student");
        student.setUsername("janedoe");
        MockHttpSession session = mock(MockHttpSession.class);
        when(session.getAttribute(Mockito.<String>any())).thenReturn(student);
        doNothing().when(session).putValue(Mockito.<String>any(), Mockito.<Object>any());
        doNothing().when(session).removeAttribute(Mockito.<String>any());
        session.putValue("Name", "Value");
        studentController.verifyAndSetPassword(session, "Otp", "university");
    }

    /**
     * Method under test: {@link StudentController#goToChangePasswordPage()}
     */
    @Test
    void testGoToChangePasswordPage() {

        assertEquals("changepassword", (new StudentController()).goToChangePasswordPage());
    }

    /**
     * Method under test: {@link StudentController#changePassword(HttpSession, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testChangePassword() {

        StudentController studentController = new StudentController();
        studentController.changePassword(new MockHttpSession(), "university");
    }

    /**
     * Method under test: {@link StudentController#changePassword(HttpSession, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testChangePassword2() {

        (new StudentController()).changePassword(null, "university");
    }

    /**
     * Method under test: {@link StudentController#changePassword(HttpSession, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testChangePassword3() {

        StudentController studentController = new StudentController();

        Student student = new Student();
        student.setCity("Oxford");
        student.setEmailid("jane.doe@example.org");
        student.setFirstname("Jane");
        student.setId(1);
        student.setIsVerified(1);
        student.setLastname("Doe");
        student.setMobileno("active-user");
        student.setPassword("university");
        student.setPincode("active-user");
        student.setRegisterDate("2020-03-01");
        student.setStreet("active-user");
        student.setUsername("janedoe");
        MockHttpSession session = mock(MockHttpSession.class);
        when(session.getAttribute(Mockito.<String>any())).thenReturn(student);
        doNothing().when(session).putValue(Mockito.<String>any(), Mockito.<Object>any());
        session.putValue("Name", "Value");
        studentController.changePassword(session, "university");
    }

    /**
     * Method under test: {@link StudentController#forgetPassword(HttpServletRequest, String, String)}
     */
    @Test
    void testForgetPassword() throws Exception {
        MobileVerification mobileVerification = new MobileVerification();
        mobileVerification.setId(1);
        mobileVerification.setMobile("Mobile");
        mobileVerification.setOtp("Otp");
        when(mobileVerificationDao.save(Mockito.<MobileVerification>any())).thenReturn(mobileVerification);

        Student student = new Student();
        student.setCity("Oxford");
        student.setEmailid("jane.doe@example.org");
        student.setFirstname("Jane");
        student.setId(1);
        student.setIsVerified(1);
        student.setLastname("Doe");
        student.setMobileno("Mobileno");
        student.setPassword("university");
        student.setPincode("Pincode");
        student.setRegisterDate("2020-03-01");
        student.setStreet("Street");
        student.setUsername("janedoe");
        when(studentDao.findByUsernameAndMobileno(Mockito.<String>any(), Mockito.<String>any())).thenReturn(student);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/forgetpassword")
                .param("mobile", "foo")
                .param("username", "foo");
        MockMvcBuilders.standaloneSetup(studentController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("status"))
                .andExpect(MockMvcResultMatchers.view().name("setpassword"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("setpassword"));
    }

    /**
     * Method under test: {@link StudentController#forgetPassword(HttpServletRequest, String, String)}
     */
    @Test
    void testForgetPassword2() throws Exception {
        MobileVerification mobileVerification = new MobileVerification();
        mobileVerification.setId(1);
        mobileVerification.setMobile("Mobile");
        mobileVerification.setOtp("Otp");
        when(mobileVerificationDao.save(Mockito.<MobileVerification>any())).thenReturn(mobileVerification);

        Student student = new Student();
        student.setCity("Oxford");
        student.setEmailid("jane.doe@example.org");
        student.setFirstname("Jane");
        student.setId(1);
        student.setIsVerified(1);
        student.setLastname("Doe");
        student.setMobileno("Use this OTP for Verification for Forget Password \n OTP : ");
        student.setPassword("university");
        student.setPincode("Pincode");
        student.setRegisterDate("2020-03-01");
        student.setStreet("Street");
        student.setUsername("janedoe");
        when(studentDao.findByUsernameAndMobileno(Mockito.<String>any(), Mockito.<String>any())).thenReturn(student);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/forgetpassword")
                .param("mobile", "foo")
                .param("username", "foo");
        MockMvcBuilders.standaloneSetup(studentController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("status"))
                .andExpect(MockMvcResultMatchers.view().name("setpassword"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("setpassword"));
    }

    /**
     * Method under test: {@link StudentController#goToShowProfilePage()}
     */
    @Test
    void testGoToShowProfilePage() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/myprofile");
        MockMvcBuilders.standaloneSetup(studentController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("showprofile"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("showprofile"));
    }

    /**
     * Method under test: {@link StudentController#goToShowProfilePage()}
     */
    @Test
    void testGoToShowProfilePage2() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/myprofile");
        requestBuilder.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(studentController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("showprofile"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("showprofile"));
    }

    /**
     * Method under test: {@link StudentController#loginStudent(HttpServletRequest, String, String)}
     */
    @Test
    void testLoginStudent() throws Exception {
        Student student = new Student();
        student.setCity("Oxford");
        student.setEmailid("jane.doe@example.org");
        student.setFirstname("Jane");
        student.setId(1);
        student.setIsVerified(1);
        student.setLastname("Doe");
        student.setMobileno("Mobileno");
        student.setPassword("university");
        student.setPincode("Pincode");
        student.setRegisterDate("2020-03-01");
        student.setStreet("Street");
        student.setUsername("janedoe");
        when(studentDao.findByUsernameAndPassword(Mockito.<String>any(), Mockito.<String>any())).thenReturn(student);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/studentlogin")
                .param("password", "foo")
                .param("username", "foo");
        MockMvcBuilders.standaloneSetup(studentController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("status"))
                .andExpect(MockMvcResultMatchers.view().name("index"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("index"));
    }

    /**
     * Method under test: {@link StudentController#logout(HttpSession)}
     */
    @Test
    void testLogout() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/logout");
        MockMvcBuilders.standaloneSetup(studentController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("status"))
                .andExpect(MockMvcResultMatchers.view().name("index"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("index"));
    }

    /**
     * Method under test: {@link StudentController#logout(HttpSession)}
     */
    @Test
    void testLogout2() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/logout");
        requestBuilder.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(studentController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("status"))
                .andExpect(MockMvcResultMatchers.view().name("index"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("index"));
    }
}


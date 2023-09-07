package com.onlineadmission.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.onlineadmission.dao.AppliedCollegeDao;
import com.onlineadmission.dao.CollegeAvailableCourseDao;
import com.onlineadmission.dao.CollegeDao;
import com.onlineadmission.dao.CourseDao;
import com.onlineadmission.dao.StudentDao;
import com.onlineadmission.model.College;
import com.onlineadmission.model.CollegeAvailableCourse;
import com.onlineadmission.model.Course;

import java.util.ArrayList;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

@ContextConfiguration(classes = {CollegeController.class})
@ExtendWith(SpringExtension.class)
class CollegeControllerTest {
    @MockBean(name = "appliedCollegeDao")
    private AppliedCollegeDao appliedCollegeDao;

    @MockBean
    private CollegeAvailableCourseDao collegeAvailableCourseDao;

    @Autowired
    private CollegeController collegeController;

    @MockBean(name = "collegeDao")
    private CollegeDao collegeDao;

    @MockBean
    private CourseDao courseDao;

    @MockBean(name = "studentDao")
    private StudentDao studentDao;

    /**
     * Method under test: {@link CollegeController#goToAdminLoginPage()}
     */
    @Test
    void testGoToAdminLoginPage() {

        assertEquals("collegelogin", (new CollegeController()).goToAdminLoginPage());
    }

    /**
     * Method under test: {@link CollegeController#goToAdminRegisterPage()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGoToAdminRegisterPage() {

        (new CollegeController()).goToAdminRegisterPage();
    }

    /**
     * Method under test: {@link CollegeController#registerAdmin(College)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRegisterAdmin() {

        CollegeController collegeController = new CollegeController();

        College college = new College();
        college.setAddress("42 Main St");
        college.setAvailableSeat(1);
        college.setCode("Code");
        college.setEmail("jane.doe@example.org");
        college.setId(1);
        college.setLocation("Location");
        college.setName("Name");
        college.setPassword("university");
        college.setPhoneNo("6625550144");
        college.setSeatFull("Is Seat Full");
        college.setTotalSeat(1);
        collegeController.registerAdmin(college);
    }

    /**
     * Method under test: {@link CollegeController#registerAdmin(College)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRegisterAdmin2() {

        CollegeController collegeController = new CollegeController();
        College college = mock(College.class);
        when(college.getEmail()).thenReturn("jane.doe@example.org");
        doNothing().when(college).setAddress(Mockito.<String>any());
        doNothing().when(college).setAvailableSeat(anyInt());
        doNothing().when(college).setCode(Mockito.<String>any());
        doNothing().when(college).setEmail(Mockito.<String>any());
        doNothing().when(college).setId(anyInt());
        doNothing().when(college).setLocation(Mockito.<String>any());
        doNothing().when(college).setName(Mockito.<String>any());
        doNothing().when(college).setPassword(Mockito.<String>any());
        doNothing().when(college).setPhoneNo(Mockito.<String>any());
        doNothing().when(college).setSeatFull(Mockito.<String>any());
        doNothing().when(college).setTotalSeat(anyInt());
        college.setAddress("42 Main St");
        college.setAvailableSeat(1);
        college.setCode("Code");
        college.setEmail("jane.doe@example.org");
        college.setId(1);
        college.setLocation("Location");
        college.setName("Name");
        college.setPassword("university");
        college.setPhoneNo("6625550144");
        college.setSeatFull("Is Seat Full");
        college.setTotalSeat(1);
        collegeController.registerAdmin(college);
    }

    /**
     * Method under test: {@link CollegeController#registerAdmin(College)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRegisterAdmin3() {

        CollegeController collegeController = new CollegeController();
        College college = mock(College.class);
        when(college.getName()).thenReturn("Name");
        when(college.getEmail()).thenReturn("@ctscollege.edu");
        doNothing().when(college).setAddress(Mockito.<String>any());
        doNothing().when(college).setAvailableSeat(anyInt());
        doNothing().when(college).setCode(Mockito.<String>any());
        doNothing().when(college).setEmail(Mockito.<String>any());
        doNothing().when(college).setId(anyInt());
        doNothing().when(college).setLocation(Mockito.<String>any());
        doNothing().when(college).setName(Mockito.<String>any());
        doNothing().when(college).setPassword(Mockito.<String>any());
        doNothing().when(college).setPhoneNo(Mockito.<String>any());
        doNothing().when(college).setSeatFull(Mockito.<String>any());
        doNothing().when(college).setTotalSeat(anyInt());
        college.setAddress("42 Main St");
        college.setAvailableSeat(1);
        college.setCode("Code");
        college.setEmail("jane.doe@example.org");
        college.setId(1);
        college.setLocation("Location");
        college.setName("Name");
        college.setPassword("university");
        college.setPhoneNo("6625550144");
        college.setSeatFull("Is Seat Full");
        college.setTotalSeat(1);
        collegeController.registerAdmin(college);
    }

    /**
     * Method under test: {@link CollegeController#goToAddcollegecourse()}
     */
    @Test
    void testGoToAddcollegecourse() {

        assertEquals("addcollegecourse", (new CollegeController()).goToAddcollegecourse());
    }

    /**
     * Method under test: {@link CollegeController#addAllCollegeCourse(String, String)}
     */
    @Test
    void testAddAllCollegeCourse() throws Exception {
        CollegeAvailableCourse collegeAvailableCourse = new CollegeAvailableCourse();
        collegeAvailableCourse.setCollegeId(1);
        collegeAvailableCourse.setCourseId(1);
        collegeAvailableCourse.setId(1);
        when(collegeAvailableCourseDao.save(Mockito.<CollegeAvailableCourse>any())).thenReturn(collegeAvailableCourse);

        College college = new College();
        college.setAddress("42 Main St");
        college.setAvailableSeat(1);
        college.setCode("Code");
        college.setEmail("jane.doe@example.org");
        college.setId(1);
        college.setLocation("Location");
        college.setName("Name");
        college.setPassword("university");
        college.setPhoneNo("6625550144");
        college.setSeatFull("Is Seat Full");
        college.setTotalSeat(1);
        when(collegeDao.findByCode(Mockito.<String>any())).thenReturn(college);

        Course course = new Course();
        course.setId(1);
        course.setMinimumQualification("Minimum Qualification");
        course.setName("Name");
        course.setSubjectCriteria("Hello from the Dreaming Spires");
        Optional<Course> ofResult = Optional.of(course);
        when(courseDao.findById(Mockito.<Integer>any())).thenReturn(ofResult);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/addAllCollegeCourse")
                .param("allCourseIds", "42")
                .param("collegeCode", "foo");
        MockMvcBuilders.standaloneSetup(collegeController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("status"))
                .andExpect(MockMvcResultMatchers.view().name("index"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("index"));
    }

    /**
     * Method under test: {@link CollegeController#addCourseForCollege(String, String, String, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddCourseForCollege() {

        (new CollegeController()).addCourseForCollege("Code", "42", "List Of Course Id In String",
                "Current Course To Display");
    }

    /**
     * Method under test: {@link CollegeController#goToApplycollege()}
     */
    @Test
    void testGoToApplycollege() {

        ModelAndView actualGoToApplycollegeResult = (new CollegeController()).goToApplycollege();
        assertTrue(actualGoToApplycollegeResult.isReference());
        assertSame(actualGoToApplycollegeResult.getModel(), actualGoToApplycollegeResult.getModelMap());
    }

    /**
     * Method under test: {@link CollegeController#goToAppliedcollege(HttpSession)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGoToAppliedcollege() {

        CollegeController collegeController = new CollegeController();
        collegeController.goToAppliedcollege(new MockHttpSession());
    }

    /**
     * Method under test: {@link CollegeController#goToAppliedcollege(HttpSession)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGoToAppliedcollege2() {

        (new CollegeController()).goToAppliedcollege(null);
    }

    /**
     * Method under test: {@link CollegeController#appliedStudents(HttpSession)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAppliedStudents() {

        CollegeController collegeController = new CollegeController();
        collegeController.appliedStudents(new MockHttpSession());
    }

    /**
     * Method under test: {@link CollegeController#appliedStudents(HttpSession)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAppliedStudents2() {

        (new CollegeController()).appliedStudents(null);
    }

    /**
     * Method under test: {@link CollegeController#allotStudent(HttpSession, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAllotStudent() {

        CollegeController collegeController = new CollegeController();
        collegeController.allotStudent(new MockHttpSession(), 1);
    }

    /**
     * Method under test: {@link CollegeController#allotStudent(HttpSession, int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAllotStudent2() {

        (new CollegeController()).allotStudent(null, 1);
    }

    /**
     * Method under test: {@link CollegeController#addCollege(HttpSession, int, String)}
     */
    @Test
    void testAddCollege() throws Exception {
        College college = new College();
        college.setAddress("42 Main St");
        college.setAvailableSeat(1);
        college.setCode("Code");
        college.setEmail("jane.doe@example.org");
        college.setId(1);
        college.setLocation("Location");
        college.setName("Name");
        college.setPassword("university");
        college.setPhoneNo("6625550144");
        college.setSeatFull("Is Seat Full");
        college.setTotalSeat(1);
        Optional<College> ofResult = Optional.of(college);
        when(collegeDao.findById(Mockito.<Integer>any())).thenReturn(ofResult);
        MockHttpServletRequestBuilder postResult = MockMvcRequestBuilders.post("/addcollege");
        MockHttpServletRequestBuilder requestBuilder = postResult.param("collegeId", String.valueOf(1))
                .param("selectedCollegeIds", "42");
        MockMvcBuilders.standaloneSetup(collegeController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("selectedCollegeId"))
                .andExpect(MockMvcResultMatchers.view().name("applycollege"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("applycollege"));
    }

    /**
     * Method under test: {@link CollegeController#addCollege(HttpSession, int, String)}
     */
    @Test
    void testAddCollege2() throws Exception {
        College college = new College();
        college.setAddress("42 Main St");
        college.setAvailableSeat(0);
        college.setCode("Code");
        college.setEmail("jane.doe@example.org");
        college.setId(1);
        college.setLocation("Location");
        college.setName("Name");
        college.setPassword("university");
        college.setPhoneNo("6625550144");
        college.setSeatFull("Is Seat Full");
        college.setTotalSeat(1);
        Optional<College> ofResult = Optional.of(college);
        when(collegeDao.findById(Mockito.<Integer>any())).thenReturn(ofResult);
        MockHttpServletRequestBuilder postResult = MockMvcRequestBuilders.post("/addcollege");
        MockHttpServletRequestBuilder requestBuilder = postResult.param("collegeId", String.valueOf(1))
                .param("selectedCollegeIds", "42");
        MockMvcBuilders.standaloneSetup(collegeController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(2))
                .andExpect(MockMvcResultMatchers.model().attributeExists("selectedCollegeId", "status"))
                .andExpect(MockMvcResultMatchers.view().name("applycollege"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("applycollege"));
    }

    /**
     * Method under test: {@link CollegeController#addCollege(HttpSession, int, String)}
     */
    @Test
    void testAddCollege3() throws Exception {
        College college = new College();
        college.setAddress("42 Main St");
        college.setAvailableSeat(1);
        college.setCode("Code");
        college.setEmail("jane.doe@example.org");
        college.setId(1);
        college.setLocation("Location");
        college.setName("Name");
        college.setPassword("university");
        college.setPhoneNo("6625550144");
        college.setSeatFull("Is Seat Full");
        college.setTotalSeat(1);
        Optional<College> ofResult = Optional.of(college);
        when(collegeDao.findById(Mockito.<Integer>any())).thenReturn(ofResult);
        MockHttpServletRequestBuilder postResult = MockMvcRequestBuilders.post("/addcollege");
        MockHttpServletRequestBuilder requestBuilder = postResult.param("collegeId", String.valueOf(42))
                .param("selectedCollegeIds", "42");
        MockMvcBuilders.standaloneSetup(collegeController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(2))
                .andExpect(MockMvcResultMatchers.model().attributeExists("selectedCollegeId", "status"))
                .andExpect(MockMvcResultMatchers.view().name("applycollege"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("applycollege"));
    }

    /**
     * Method under test: {@link CollegeController#addCollege(HttpSession, int, String)}
     */
    @Test
    void testAddCollege4() throws Exception {
        College college = new College();
        college.setAddress("42 Main St");
        college.setAvailableSeat(1);
        college.setCode("Code");
        college.setEmail("jane.doe@example.org");
        college.setId(1);
        college.setLocation("Location");
        college.setName("Name");
        college.setPassword("university");
        college.setPhoneNo("6625550144");
        college.setSeatFull("Is Seat Full");
        college.setTotalSeat(1);
        Optional<College> ofResult = Optional.of(college);
        when(collegeDao.findById(Mockito.<Integer>any())).thenReturn(ofResult);
        MockHttpServletRequestBuilder postResult = MockMvcRequestBuilders.post("/addcollege");
        MockHttpServletRequestBuilder requestBuilder = postResult.param("collegeId", String.valueOf(1))
                .param("selectedCollegeIds", "NA");
        MockMvcBuilders.standaloneSetup(collegeController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("selectedCollegeId"))
                .andExpect(MockMvcResultMatchers.view().name("applycollege"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("applycollege"));
    }

    /**
     * Method under test: {@link CollegeController#allCollege()}
     */
    @Test
    void testAllCollege() throws Exception {
        when(collegeDao.findAll()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/allcollege");
        MockMvcBuilders.standaloneSetup(collegeController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("colleges"))
                .andExpect(MockMvcResultMatchers.view().name("viewallcollege"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("viewallcollege"));
    }

    /**
     * Method under test: {@link CollegeController#allCollege()}
     */
    @Test
    void testAllCollege2() throws Exception {
        when(collegeDao.findAll()).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/allcollege");
        requestBuilder.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(collegeController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("colleges"))
                .andExpect(MockMvcResultMatchers.view().name("viewallcollege"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("viewallcollege"));
    }

    /**
     * Method under test: {@link CollegeController#applyColleges(HttpSession, String)}
     */
    @Test
    void testApplyColleges() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/applyColleges")
                .param("selectedCollege", "NA");
        MockMvcBuilders.standaloneSetup(collegeController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("status"))
                .andExpect(MockMvcResultMatchers.view().name("applycollege"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("applycollege"));
    }

    /**
     * Method under test: {@link CollegeController#applyColleges(HttpSession, String)}
     */
    @Test
    void testApplyColleges2() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/applyColleges")
                .param("selectedCollege", ",");
        MockMvcBuilders.standaloneSetup(collegeController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("status"))
                .andExpect(MockMvcResultMatchers.view().name("index"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("index"));
    }

    /**
     * Method under test: {@link CollegeController#applyColleges(HttpSession, String)}
     */
    @Test
    void testApplyColleges3() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/applyColleges")
                .param("selectedCollege", "");
        MockMvcBuilders.standaloneSetup(collegeController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("status"))
                .andExpect(MockMvcResultMatchers.view().name("index"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("index"));
    }

    /**
     * Method under test: {@link CollegeController#goToStudentAppliedcollege(int)}
     */
    @Test
    void testGoToStudentAppliedcollege() throws Exception {
        MockHttpServletRequestBuilder getResult = MockMvcRequestBuilders.get("/studentAppliedCollege");
        MockHttpServletRequestBuilder requestBuilder = getResult.param("studentId", String.valueOf(1));
        MockMvcBuilders.standaloneSetup(collegeController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("studentId"))
                .andExpect(MockMvcResultMatchers.view().name("appliedcollege"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("appliedcollege"));
    }

    /**
     * Method under test: {@link CollegeController#loginCollege(HttpServletRequest, String, String)}
     */
    @Test
    void testLoginCollege() throws Exception {
        College college = new College();
        college.setAddress("42 Main St");
        college.setAvailableSeat(1);
        college.setCode("Code");
        college.setEmail("jane.doe@example.org");
        college.setId(1);
        college.setLocation("Location");
        college.setName("Name");
        college.setPassword("university");
        college.setPhoneNo("6625550144");
        college.setSeatFull("Is Seat Full");
        college.setTotalSeat(1);
        when(collegeDao.findByEmailAndPassword(Mockito.<String>any(), Mockito.<String>any())).thenReturn(college);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/collegelogin")
                .param("email", "foo")
                .param("password", "foo");
        MockMvcBuilders.standaloneSetup(collegeController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("status"))
                .andExpect(MockMvcResultMatchers.view().name("index"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("index"));
    }
}


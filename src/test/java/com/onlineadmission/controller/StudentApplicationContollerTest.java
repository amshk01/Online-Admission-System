package com.onlineadmission.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.lowagie.text.DocumentException;
import com.onlineadmission.dao.AppliedCollegeDao;
import com.onlineadmission.dao.CollegeDao;
import com.onlineadmission.dao.CourseDao;
import com.onlineadmission.dao.StudentApplicationDao;
import com.onlineadmission.dao.StudentDao;
import com.onlineadmission.dao.StudentDocumentsDao;
import com.onlineadmission.model.Student;
import com.onlineadmission.model.StudentDocuments;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Response;

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
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.multipart.support.DefaultMultipartHttpServletRequest;

@ContextConfiguration(classes = {StudentApplicationContoller.class})
@ExtendWith(SpringExtension.class)
class StudentApplicationContollerTest {
    @MockBean(name = "appliedCollegeDao")
    private AppliedCollegeDao appliedCollegeDao;

    @MockBean(name = "collegeDao")
    private CollegeDao collegeDao;

    @MockBean
    private CourseDao courseDao;

    @Autowired
    private StudentApplicationContoller studentApplicationContoller;

    @MockBean
    private StudentApplicationDao studentApplicationDao;

    @MockBean(name = "studentDao")
    private StudentDao studentDao;

    @MockBean
    private StudentDocumentsDao studentDocumentsDao;

    /**
     * Method under test: {@link StudentApplicationContoller#goToPaymentPage()}
     */
    @Test
    void testGoToPaymentPage() {

        assertEquals("paymentpage", (new StudentApplicationContoller()).goToPaymentPage());
    }

    /**
     * Method under test: {@link StudentApplicationContoller#addStudentApplication(HttpServletRequest, HttpSession)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddStudentApplication() throws IOException, ServletException {

        StudentApplicationContoller studentApplicationContoller = new StudentApplicationContoller();
        MockHttpServletRequest request = new MockHttpServletRequest();
        studentApplicationContoller.addStudentApplication(request, new MockHttpSession());
    }

    /**
     * Method under test: {@link StudentApplicationContoller#addStudentApplication(HttpServletRequest, HttpSession)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddStudentApplication2() throws IOException, ServletException {

        StudentApplicationContoller studentApplicationContoller = new StudentApplicationContoller();
        studentApplicationContoller.addStudentApplication(new MockHttpServletRequest(), null);
    }

    /**
     * Method under test: {@link StudentApplicationContoller#addStudentApplication(HttpServletRequest, HttpSession)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddStudentApplication3() throws IOException, ServletException {

        (new StudentApplicationContoller()).addStudentApplication(mock(DefaultMultipartHttpServletRequest.class), null);
    }

    /**
     * Method under test: {@link StudentApplicationContoller#addStudentDocument(String, HttpSession)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddStudentDocument() throws IOException, ServletException {

        StudentApplicationContoller studentApplicationContoller = new StudentApplicationContoller();
        studentApplicationContoller.addStudentDocument("10", new MockHttpSession());
    }

    /**
     * Method under test: {@link StudentApplicationContoller#addStudentDocument(String, HttpSession)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddStudentDocument2() throws IOException, ServletException {

        (new StudentApplicationContoller()).addStudentDocument("10", null);
    }

    /**
     * Method under test: {@link StudentApplicationContoller#addStudentDocument(HttpServletRequest, HttpSession)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddStudentDocument3() throws IOException, ServletException {

        StudentApplicationContoller studentApplicationContoller = new StudentApplicationContoller();
        MockHttpServletRequest request = new MockHttpServletRequest();
        studentApplicationContoller.addStudentDocument(request, new MockHttpSession());
    }

    /**
     * Method under test: {@link StudentApplicationContoller#addStudentDocument(HttpServletRequest, HttpSession)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddStudentDocument4() throws IOException, ServletException {

        StudentApplicationContoller studentApplicationContoller = new StudentApplicationContoller();
        studentApplicationContoller.addStudentDocument((HttpServletRequest) null, new MockHttpSession());
    }

    /**
     * Method under test: {@link StudentApplicationContoller#addStudentDocument(HttpServletRequest, HttpSession)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddStudentDocument5() throws IOException, ServletException {

        StudentApplicationContoller studentApplicationContoller = new StudentApplicationContoller();
        DefaultMultipartHttpServletRequest request = mock(DefaultMultipartHttpServletRequest.class);
        when(request.getParameter(Mockito.<String>any())).thenReturn("https://example.org/example");
        studentApplicationContoller.addStudentDocument(request, new MockHttpSession());
    }

    /**
     * Method under test: {@link StudentApplicationContoller#addStudentDocument(HttpServletRequest, HttpSession)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddStudentDocument6() throws IOException, ServletException {

        StudentApplicationContoller studentApplicationContoller = new StudentApplicationContoller();
        DefaultMultipartHttpServletRequest request = mock(DefaultMultipartHttpServletRequest.class);
        when(request.getParameter(Mockito.<String>any())).thenReturn("42");
        studentApplicationContoller.addStudentDocument(request, new MockHttpSession());
    }

    /**
     * Method under test: {@link StudentApplicationContoller#addStudentDocument(HttpServletRequest, HttpSession)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddStudentDocument7() throws IOException, ServletException {

        StudentApplicationContoller studentApplicationContoller = new StudentApplicationContoller();
        DefaultMultipartHttpServletRequest request = mock(DefaultMultipartHttpServletRequest.class);
        when(request.getParameter(Mockito.<String>any())).thenReturn("42");
        studentApplicationContoller.addStudentDocument(request, null);
    }

    /**
     * Method under test: {@link StudentApplicationContoller#goToAllFormPage()}
     */
    @Test
    void testGoToAllFormPage() {

        assertEquals("allforms", (new StudentApplicationContoller()).goToAllFormPage());
    }

    /**
     * Method under test: {@link StudentApplicationContoller#downloadBill(int, HttpServletResponse)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDownloadBill() throws DocumentException, IOException {

        StudentApplicationContoller studentApplicationContoller = new StudentApplicationContoller();
        studentApplicationContoller.downloadBill(1, new Response());
    }

    /**
     * Method under test: {@link StudentApplicationContoller#downloadBill(int, HttpServletResponse)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDownloadBill2() throws DocumentException, IOException {

        (new StudentApplicationContoller()).downloadBill(1, mock(Response.class));
    }

    /**
     * Method under test: {@link StudentApplicationContoller#approveDocumentPage(int, String, String)}
     */
    @Test
    void testApproveDocumentPage() throws Exception {
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
        Optional<Student> ofResult = Optional.of(student);
        when(studentDao.findById(Mockito.<Integer>any())).thenReturn(ofResult);

        StudentDocuments studentDocuments = new StudentDocuments();
        studentDocuments.setDocument("Document");
        studentDocuments.setId(1);
        studentDocuments.setIsApproved("Is Approved");
        studentDocuments.setIsDocumentUploaded("Is Document Uploaded");
        studentDocuments.setPercentage(1L);
        studentDocuments.setStandard("Standard");
        studentDocuments.setStudentId(1);
        studentDocuments.setUploadedDate("2020-03-01");
        studentDocuments.setYearOfPassing(1);

        StudentDocuments studentDocuments2 = new StudentDocuments();
        studentDocuments2.setDocument("Document");
        studentDocuments2.setId(1);
        studentDocuments2.setIsApproved("Is Approved");
        studentDocuments2.setIsDocumentUploaded("Is Document Uploaded");
        studentDocuments2.setPercentage(1L);
        studentDocuments2.setStandard("Standard");
        studentDocuments2.setStudentId(1);
        studentDocuments2.setUploadedDate("2020-03-01");
        studentDocuments2.setYearOfPassing(1);
        when(studentDocumentsDao.save(Mockito.<StudentDocuments>any())).thenReturn(studentDocuments2);
        when(studentDocumentsDao.findByStandardAndStudentId(Mockito.<String>any(), anyInt()))
                .thenReturn(studentDocuments);
        MockHttpServletRequestBuilder paramResult = MockMvcRequestBuilders.get("/approvedocument")
                .param("approvalStatus", "foo")
                .param("standard", "foo");
        MockHttpServletRequestBuilder requestBuilder = paramResult.param("studentId", String.valueOf(1));
        MockMvcBuilders.standaloneSetup(studentApplicationContoller)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(2))
                .andExpect(MockMvcResultMatchers.model().attributeExists("status", "student"))
                .andExpect(MockMvcResultMatchers.view().name("approveapplication"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("approveapplication"));
    }

    /**
     * Method under test: {@link StudentApplicationContoller#approveDocumentPage(int, String, String)}
     */
    @Test
    void testApproveDocumentPage2() throws Exception {
        when(studentDao.findById(Mockito.<Integer>any())).thenReturn(Optional.empty());

        StudentDocuments studentDocuments = new StudentDocuments();
        studentDocuments.setDocument("Document");
        studentDocuments.setId(1);
        studentDocuments.setIsApproved("Is Approved");
        studentDocuments.setIsDocumentUploaded("Is Document Uploaded");
        studentDocuments.setPercentage(1L);
        studentDocuments.setStandard("Standard");
        studentDocuments.setStudentId(1);
        studentDocuments.setUploadedDate("2020-03-01");
        studentDocuments.setYearOfPassing(1);

        StudentDocuments studentDocuments2 = new StudentDocuments();
        studentDocuments2.setDocument("Document");
        studentDocuments2.setId(1);
        studentDocuments2.setIsApproved("Is Approved");
        studentDocuments2.setIsDocumentUploaded("Is Document Uploaded");
        studentDocuments2.setPercentage(1L);
        studentDocuments2.setStandard("Standard");
        studentDocuments2.setStudentId(1);
        studentDocuments2.setUploadedDate("2020-03-01");
        studentDocuments2.setYearOfPassing(1);
        when(studentDocumentsDao.save(Mockito.<StudentDocuments>any())).thenReturn(studentDocuments2);
        when(studentDocumentsDao.findByStandardAndStudentId(Mockito.<String>any(), anyInt()))
                .thenReturn(studentDocuments);
        MockHttpServletRequestBuilder paramResult = MockMvcRequestBuilders.get("/approvedocument")
                .param("approvalStatus", "foo")
                .param("standard", "foo");
        MockHttpServletRequestBuilder requestBuilder = paramResult.param("studentId", String.valueOf(1));
        MockMvcBuilders.standaloneSetup(studentApplicationContoller)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(2))
                .andExpect(MockMvcResultMatchers.model().attributeExists("status"))
                .andExpect(MockMvcResultMatchers.view().name("approveapplication"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("approveapplication"));
    }

    /**
     * Method under test: {@link StudentApplicationContoller#approveStudentApplication(int, String)}
     */
    @Test
    void testApproveStudentApplication() throws Exception {
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
        Optional<Student> ofResult = Optional.of(student);
        when(studentDao.findById(Mockito.<Integer>any())).thenReturn(ofResult);
        when(studentDocumentsDao.findByStudentId(anyInt())).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder paramResult = MockMvcRequestBuilders.get("/approveStudentApplication")
                .param("approvalStatus", "foo");
        MockHttpServletRequestBuilder requestBuilder = paramResult.param("studentId", String.valueOf(1));
        MockMvcBuilders.standaloneSetup(studentApplicationContoller)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(2))
                .andExpect(MockMvcResultMatchers.model().attributeExists("status", "student"))
                .andExpect(MockMvcResultMatchers.view().name("approveapplication"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("approveapplication"));
    }

    /**
     * Method under test: {@link StudentApplicationContoller#approveStudentApplication(int, String)}
     */
    @Test
    void testApproveStudentApplication2() throws Exception {
        when(studentDao.findById(Mockito.<Integer>any())).thenReturn(Optional.empty());
        when(studentDocumentsDao.findByStudentId(anyInt())).thenReturn(new ArrayList<>());
        MockHttpServletRequestBuilder paramResult = MockMvcRequestBuilders.get("/approveStudentApplication")
                .param("approvalStatus", "foo");
        MockHttpServletRequestBuilder requestBuilder = paramResult.param("studentId", String.valueOf(1));
        MockMvcBuilders.standaloneSetup(studentApplicationContoller)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(2))
                .andExpect(MockMvcResultMatchers.model().attributeExists("status"))
                .andExpect(MockMvcResultMatchers.view().name("approveapplication"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("approveapplication"));
    }

    /**
     * Method under test: {@link StudentApplicationContoller#downloadDocument(int, String, HttpServletResponse)}
     */
    @Test
    void testDownloadDocument() throws Exception {
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
        Optional<Student> ofResult = Optional.of(student);
        when(studentDao.findById(Mockito.<Integer>any())).thenReturn(ofResult);

        StudentDocuments studentDocuments = new StudentDocuments();
        studentDocuments.setDocument("Document");
        studentDocuments.setId(1);
        studentDocuments.setIsApproved("Is Approved");
        studentDocuments.setIsDocumentUploaded("Is Document Uploaded");
        studentDocuments.setPercentage(1L);
        studentDocuments.setStandard("Standard");
        studentDocuments.setStudentId(1);
        studentDocuments.setUploadedDate("2020-03-01");
        studentDocuments.setYearOfPassing(1);
        when(studentDocumentsDao.findByStandardAndStudentId(Mockito.<String>any(), anyInt()))
                .thenReturn(studentDocuments);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/downloadDocument")
                .param("standard", "foo")
                .param("studentId", "https://example.org/example");
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(studentApplicationContoller)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(400));
    }

    /**
     * Method under test: {@link StudentApplicationContoller#goToAddDocumentPage()}
     */
    @Test
    void testGoToAddDocumentPage() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/addstudentdocument");
        MockMvcBuilders.standaloneSetup(studentApplicationContoller)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("adddocument"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("adddocument"));
    }

    /**
     * Method under test: {@link StudentApplicationContoller#goToAddDocumentPage()}
     */
    @Test
    void testGoToAddDocumentPage2() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/addstudentdocument");
        requestBuilder.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(studentApplicationContoller)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("adddocument"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("adddocument"));
    }

    /**
     * Method under test: {@link StudentApplicationContoller#goToApplicationPage()}
     */
    @Test
    void testGoToApplicationPage() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/myapplication");
        MockMvcBuilders.standaloneSetup(studentApplicationContoller)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("applicationform"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("applicationform"));
    }

    /**
     * Method under test: {@link StudentApplicationContoller#goToApplicationPage()}
     */
    @Test
    void testGoToApplicationPage2() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/myapplication");
        requestBuilder.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(studentApplicationContoller)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("applicationform"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("applicationform"));
    }

    /**
     * Method under test: {@link StudentApplicationContoller#goToApproveApplicationPage(int)}
     */
    @Test
    void testGoToApproveApplicationPage() throws Exception {
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
        Optional<Student> ofResult = Optional.of(student);
        when(studentDao.findById(Mockito.<Integer>any())).thenReturn(ofResult);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/approveapplication")
                .param("studentId", "https://example.org/example");
        ResultActions actualPerformResult = MockMvcBuilders.standaloneSetup(studentApplicationContoller)
                .build()
                .perform(requestBuilder);
        actualPerformResult.andExpect(MockMvcResultMatchers.status().is(400));
    }

    /**
     * Method under test: {@link StudentApplicationContoller#goToRegisterStudentApplicationPage()}
     */
    @Test
    void testGoToRegisterStudentApplicationPage() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/registerStudentApplication");
        MockMvcBuilders.standaloneSetup(studentApplicationContoller)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("registerstudentapplication"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("registerstudentapplication"));
    }

    /**
     * Method under test: {@link StudentApplicationContoller#goToRegisterStudentApplicationPage()}
     */
    @Test
    void testGoToRegisterStudentApplicationPage2() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/registerStudentApplication");
        requestBuilder.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(studentApplicationContoller)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("registerstudentapplication"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("registerstudentapplication"));
    }
}


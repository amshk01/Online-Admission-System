package com.onlineadmission.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.onlineadmission.dao.CourseDao;
import com.onlineadmission.model.Course;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {CourseController.class})
@ExtendWith(SpringExtension.class)
class CourseControllerTest {
    @Autowired
    private CourseController courseController;

    @MockBean
    private CourseDao courseDao;

    /**
     * Method under test: {@link CourseController#addCourse(Course)}
     */
    @Test
    void testAddCourse() throws Exception {
        Course course = new Course();
        course.setId(1);
        course.setMinimumQualification("Minimum Qualification");
        course.setName("Name");
        course.setSubjectCriteria("Hello from the Dreaming Spires");
        when(courseDao.save(Mockito.<Course>any())).thenReturn(course);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/addcourse");
        MockMvcBuilders.standaloneSetup(courseController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(2))
                .andExpect(MockMvcResultMatchers.model().attributeExists("course", "status"))
                .andExpect(MockMvcResultMatchers.view().name("index"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("index"));
    }

    /**
     * Method under test: {@link CourseController#goToAddCoursePage()}
     */
    @Test
    void testGoToAddCoursePage() {


        assertEquals("addcourse", (new CourseController()).goToAddCoursePage());
    }
}


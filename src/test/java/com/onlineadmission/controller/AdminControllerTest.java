package com.onlineadmission.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.onlineadmission.dao.AdminDao;
import com.onlineadmission.model.Admin;

import javax.servlet.http.HttpServletRequest;

import org.junit.jupiter.api.Disabled;

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
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

@ContextConfiguration(classes = {AdminController.class})
@ExtendWith(SpringExtension.class)
class AdminControllerTest {
    @Autowired
    private AdminController adminController;

    @MockBean(name = "adminDao")
    private AdminDao adminDao;

    /**
     * Method under test: {@link AdminController#goToAdminLoginPage()}
     */
    @Test
    void testGoToAdminLoginPage() {

        assertEquals("adminlogin", (new AdminController()).goToAdminLoginPage());
    }

    /**
     * Method under test: {@link AdminController#goToAdminRegisterPage()}
     */
    @Test
    void testGoToAdminRegisterPage() {

        assertEquals("adminregister", (new AdminController()).goToAdminRegisterPage());
    }

    /**
     * Method under test: {@link AdminController#registerAdmin(Admin, Model)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRegisterAdmin() {

        AdminController adminController = new AdminController();

        Admin admin = new Admin();
        admin.setCity("Oxford");
        admin.setEmailid("jane.doe@example.org");
        admin.setFirstname("Jane");
        admin.setId(1);
        admin.setLastname("Doe");
        admin.setMobileno("Mobileno");
        admin.setPassword("university");
        admin.setPincode("Pincode");
        admin.setStreet("Street");
        admin.setUsername("janedoe");
        adminController.registerAdmin(admin, new ConcurrentModel());
    }

    /**
     * Method under test: {@link AdminController#registerAdmin(Admin, Model)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testRegisterAdmin2() {

        AdminController adminController = new AdminController();
        Admin admin = mock(Admin.class);
        when(admin.getUsername()).thenReturn("janedoe");
        doNothing().when(admin).setCity(Mockito.<String>any());
        doNothing().when(admin).setEmailid(Mockito.<String>any());
        doNothing().when(admin).setFirstname(Mockito.<String>any());
        doNothing().when(admin).setId(anyInt());
        doNothing().when(admin).setLastname(Mockito.<String>any());
        doNothing().when(admin).setMobileno(Mockito.<String>any());
        doNothing().when(admin).setPassword(Mockito.<String>any());
        doNothing().when(admin).setPincode(Mockito.<String>any());
        doNothing().when(admin).setStreet(Mockito.<String>any());
        doNothing().when(admin).setUsername(Mockito.<String>any());
        admin.setCity("Oxford");
        admin.setEmailid("jane.doe@example.org");
        admin.setFirstname("Jane");
        admin.setId(1);
        admin.setLastname("Doe");
        admin.setMobileno("Mobileno");
        admin.setPassword("university");
        admin.setPincode("Pincode");
        admin.setStreet("Street");
        admin.setUsername("janedoe");
        adminController.registerAdmin(admin, new ConcurrentModel());
    }

    /**
     * Method under test: {@link AdminController#goToHomeDuringStart()}
     */
    @Test
    void testGoToHomeDuringStart() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("index"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("index"));
    }

    /**
     * Method under test: {@link AdminController#goToHomeDuringStart()}
     */
    @Test
    void testGoToHomeDuringStart2() throws Exception {
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/");
        requestBuilder.characterEncoding("Encoding");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(0))
                .andExpect(MockMvcResultMatchers.view().name("index"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("index"));
    }

    /**
     * Method under test: {@link AdminController#loginAdmin(HttpServletRequest, String, String)}
     */
    @Test
    void testLoginAdmin() throws Exception {
        Admin admin = new Admin();
        admin.setCity("Oxford");
        admin.setEmailid("jane.doe@example.org");
        admin.setFirstname("Jane");
        admin.setId(1);
        admin.setLastname("Doe");
        admin.setMobileno("Mobileno");
        admin.setPassword("university");
        admin.setPincode("Pincode");
        admin.setStreet("Street");
        admin.setUsername("janedoe");
        when(adminDao.findByUsernameAndPassword(Mockito.<String>any(), Mockito.<String>any())).thenReturn(admin);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/adminlogin")
                .param("password", "foo")
                .param("username", "foo");
        MockMvcBuilders.standaloneSetup(adminController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.model().size(1))
                .andExpect(MockMvcResultMatchers.model().attributeExists("status"))
                .andExpect(MockMvcResultMatchers.view().name("index"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("index"));
    }
}


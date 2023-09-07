package com.onlineadmission.dao;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.onlineadmission.model.Admin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {AdminDao.class})
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.onlineadmission.model"})
@DataJpaTest(properties = {"spring.main.allow-bean-definition-overriding=true"})
class AdminDaoTest {
    @Autowired
    private AdminDao adminDao;

    /**
     * Method under test: {@link AdminDao#findByUsernameAndPassword(String, String)}
     */
    @Test
    void testFindByUsernameAndPassword() {
        Admin admin = new Admin();
        admin.setCity("Oxford");
        admin.setEmailid("jane.doe@example.org");
        admin.setFirstname("Jane");
        admin.setLastname("Doe");
        admin.setMobileno("Mobileno");
        admin.setPassword("university");
        admin.setPincode("Pincode");
        admin.setStreet("Street");
        admin.setUsername("janedoe");

        Admin admin2 = new Admin();
        admin2.setCity("London");
        admin2.setEmailid("john.smith@example.org");
        admin2.setFirstname("John");
        admin2.setLastname("Smith");
        admin2.setMobileno("42");
        admin2.setPassword("Password");
        admin2.setPincode("42");
        admin2.setStreet("42");
        admin2.setUsername("Username");
        adminDao.save(admin);
        adminDao.save(admin2);
        assertSame(admin, adminDao.findByUsernameAndPassword("janedoe", "university"));
    }

    /**
     * Method under test: {@link AdminDao#existsByUsername(String)}
     */
    @Test
    void testExistsByUsername() {
        Admin admin = new Admin();
        admin.setCity("Oxford");
        admin.setEmailid("jane.doe@example.org");
        admin.setFirstname("Jane");
        admin.setLastname("Doe");
        admin.setMobileno("Mobileno");
        admin.setPassword("university");
        admin.setPincode("Pincode");
        admin.setStreet("Street");
        admin.setUsername("janedoe");

        Admin admin2 = new Admin();
        admin2.setCity("London");
        admin2.setEmailid("john.smith@example.org");
        admin2.setFirstname("John");
        admin2.setLastname("Smith");
        admin2.setMobileno("42");
        admin2.setPassword("Password");
        admin2.setPincode("42");
        admin2.setStreet("42");
        admin2.setUsername("Username");
        adminDao.save(admin);
        adminDao.save(admin2);
        assertTrue(adminDao.existsByUsername("janedoe"));
    }

    /**
     * Method under test: {@link AdminDao#existsByEmailid(String)}
     */
    @Test
    void testExistsByEmailid() {
        Admin admin = new Admin();
        admin.setCity("Oxford");
        admin.setEmailid("jane.doe@example.org");
        admin.setFirstname("Jane");
        admin.setLastname("Doe");
        admin.setMobileno("Mobileno");
        admin.setPassword("university");
        admin.setPincode("Pincode");
        admin.setStreet("Street");
        admin.setUsername("janedoe");

        Admin admin2 = new Admin();
        admin2.setCity("London");
        admin2.setEmailid("john.smith@example.org");
        admin2.setFirstname("John");
        admin2.setLastname("Smith");
        admin2.setMobileno("42");
        admin2.setPassword("Password");
        admin2.setPincode("42");
        admin2.setStreet("42");
        admin2.setUsername("Username");
        adminDao.save(admin);
        adminDao.save(admin2);
        assertTrue(adminDao.existsByEmailid("jane.doe@example.org"));
    }

    /**
     * Method under test: {@link AdminDao#existsByMobileno(String)}
     */
    @Test
    void testExistsByMobileno() {
        Admin admin = new Admin();
        admin.setCity("Oxford");
        admin.setEmailid("jane.doe@example.org");
        admin.setFirstname("Jane");
        admin.setLastname("Doe");
        admin.setMobileno("Mobileno");
        admin.setPassword("university");
        admin.setPincode("Pincode");
        admin.setStreet("Street");
        admin.setUsername("janedoe");

        Admin admin2 = new Admin();
        admin2.setCity("London");
        admin2.setEmailid("john.smith@example.org");
        admin2.setFirstname("John");
        admin2.setLastname("Smith");
        admin2.setMobileno("42");
        admin2.setPassword("Password");
        admin2.setPincode("42");
        admin2.setStreet("42");
        admin2.setUsername("Username");
        adminDao.save(admin);
        adminDao.save(admin2);
        assertTrue(adminDao.existsByMobileno("Mobileno"));
    }
}


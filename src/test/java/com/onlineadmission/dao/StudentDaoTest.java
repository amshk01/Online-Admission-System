package com.onlineadmission.dao;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.onlineadmission.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {StudentDao.class})
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.onlineadmission.model"})
@DataJpaTest(properties = {"spring.main.allow-bean-definition-overriding=true"})
class StudentDaoTest {
    @Autowired
    private StudentDao studentDao;

    /**
     * Method under test: {@link StudentDao#findByUsernameAndPassword(String, String)}
     */
    @Test
    void testFindByUsernameAndPassword() {
        Student student = new Student();
        student.setCity("Oxford");
        student.setEmailid("jane.doe@example.org");
        student.setFirstname("Jane");
        student.setIsVerified(1);
        student.setLastname("Doe");
        student.setMobileno("Mobileno");
        student.setPassword("university");
        student.setPincode("Pincode");
        student.setRegisterDate("2020-03-01");
        student.setStreet("Street");
        student.setUsername("janedoe");

        Student student2 = new Student();
        student2.setCity("London");
        student2.setEmailid("john.smith@example.org");
        student2.setFirstname("John");
        student2.setIsVerified(-1);
        student2.setLastname("Smith");
        student2.setMobileno("42");
        student2.setPassword("Password");
        student2.setPincode("42");
        student2.setRegisterDate("2020/03/01");
        student2.setStreet("42");
        student2.setUsername("Username");
        studentDao.save(student);
        studentDao.save(student2);
        assertSame(student, studentDao.findByUsernameAndPassword("janedoe", "university"));
    }

    /**
     * Method under test: {@link StudentDao#findByUsernameAndMobileno(String, String)}
     */
    @Test
    void testFindByUsernameAndMobileno() {
        Student student = new Student();
        student.setCity("Oxford");
        student.setEmailid("jane.doe@example.org");
        student.setFirstname("Jane");
        student.setIsVerified(1);
        student.setLastname("Doe");
        student.setMobileno("Mobileno");
        student.setPassword("university");
        student.setPincode("Pincode");
        student.setRegisterDate("2020-03-01");
        student.setStreet("Street");
        student.setUsername("janedoe");

        Student student2 = new Student();
        student2.setCity("London");
        student2.setEmailid("john.smith@example.org");
        student2.setFirstname("John");
        student2.setIsVerified(-1);
        student2.setLastname("Smith");
        student2.setMobileno("42");
        student2.setPassword("Password");
        student2.setPincode("42");
        student2.setRegisterDate("2020/03/01");
        student2.setStreet("42");
        student2.setUsername("Username");
        studentDao.save(student);
        studentDao.save(student2);
        assertNull(studentDao.findByUsernameAndMobileno("janedoe", "6625550144"));
    }

    /**
     * Method under test: {@link StudentDao#existsByUsername(String)}
     */
    @Test
    void testExistsByUsername() {
        Student student = new Student();
        student.setCity("Oxford");
        student.setEmailid("jane.doe@example.org");
        student.setFirstname("Jane");
        student.setIsVerified(1);
        student.setLastname("Doe");
        student.setMobileno("Mobileno");
        student.setPassword("university");
        student.setPincode("Pincode");
        student.setRegisterDate("2020-03-01");
        student.setStreet("Street");
        student.setUsername("janedoe");

        Student student2 = new Student();
        student2.setCity("London");
        student2.setEmailid("john.smith@example.org");
        student2.setFirstname("John");
        student2.setIsVerified(-1);
        student2.setLastname("Smith");
        student2.setMobileno("42");
        student2.setPassword("Password");
        student2.setPincode("42");
        student2.setRegisterDate("2020/03/01");
        student2.setStreet("42");
        student2.setUsername("Username");
        studentDao.save(student);
        studentDao.save(student2);
        assertTrue(studentDao.existsByUsername("janedoe"));
    }

    /**
     * Method under test: {@link StudentDao#existsByEmailid(String)}
     */
    @Test
    void testExistsByEmailid() {
        Student student = new Student();
        student.setCity("Oxford");
        student.setEmailid("jane.doe@example.org");
        student.setFirstname("Jane");
        student.setIsVerified(1);
        student.setLastname("Doe");
        student.setMobileno("Mobileno");
        student.setPassword("university");
        student.setPincode("Pincode");
        student.setRegisterDate("2020-03-01");
        student.setStreet("Street");
        student.setUsername("janedoe");

        Student student2 = new Student();
        student2.setCity("London");
        student2.setEmailid("john.smith@example.org");
        student2.setFirstname("John");
        student2.setIsVerified(-1);
        student2.setLastname("Smith");
        student2.setMobileno("42");
        student2.setPassword("Password");
        student2.setPincode("42");
        student2.setRegisterDate("2020/03/01");
        student2.setStreet("42");
        student2.setUsername("Username");
        studentDao.save(student);
        studentDao.save(student2);
        assertTrue(studentDao.existsByEmailid("jane.doe@example.org"));
    }

    /**
     * Method under test: {@link StudentDao#existsByMobileno(String)}
     */
    @Test
    void testExistsByMobileno() {
        Student student = new Student();
        student.setCity("Oxford");
        student.setEmailid("jane.doe@example.org");
        student.setFirstname("Jane");
        student.setIsVerified(1);
        student.setLastname("Doe");
        student.setMobileno("Mobileno");
        student.setPassword("university");
        student.setPincode("Pincode");
        student.setRegisterDate("2020-03-01");
        student.setStreet("Street");
        student.setUsername("janedoe");

        Student student2 = new Student();
        student2.setCity("London");
        student2.setEmailid("john.smith@example.org");
        student2.setFirstname("John");
        student2.setIsVerified(-1);
        student2.setLastname("Smith");
        student2.setMobileno("42");
        student2.setPassword("Password");
        student2.setPincode("42");
        student2.setRegisterDate("2020/03/01");
        student2.setStreet("42");
        student2.setUsername("Username");
        studentDao.save(student);
        studentDao.save(student2);
        assertTrue(studentDao.existsByMobileno("Mobileno"));
    }
}


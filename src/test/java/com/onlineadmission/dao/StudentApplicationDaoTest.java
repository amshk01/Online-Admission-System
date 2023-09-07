package com.onlineadmission.dao;

import static org.junit.jupiter.api.Assertions.assertSame;

import com.onlineadmission.model.StudentApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {StudentApplicationDao.class})
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.onlineadmission.model"})
@DataJpaTest(properties = {"spring.main.allow-bean-definition-overriding=true"})
class StudentApplicationDaoTest {
    @Autowired
    private StudentApplicationDao studentApplicationDao;

    /**
     * Method under test: {@link StudentApplicationDao#findByStudentId(int)}
     */
    @Test
    void testFindByStudentId() {
        StudentApplication studentApplication = new StudentApplication();
        studentApplication.setApplicationDate("2020-03-01");
        studentApplication.setCity("Oxford");
        studentApplication.setCountry("GB");
        studentApplication.setCourseId(1);
        studentApplication.setDob("Dob");
        studentApplication.setFatherName("Father Name");
        studentApplication.setIsAmountPaid("10");
        studentApplication.setIsApproved("Is Approved");
        studentApplication.setMotherName("Mother Name");
        studentApplication.setPinCode("Pin Code");
        studentApplication.setState("MD");
        studentApplication.setStudentId(1);
        studentApplication.setStudentPhoto("alice.liddell@example.org");

        StudentApplication studentApplication2 = new StudentApplication();
        studentApplication2.setApplicationDate("2020/03/01");
        studentApplication2.setCity("London");
        studentApplication2.setCountry("GBR");
        studentApplication2.setCourseId(2);
        studentApplication2.setDob("42");
        studentApplication2.setFatherName("42");
        studentApplication2.setIsAmountPaid("Is Amount Paid");
        studentApplication2.setIsApproved("42");
        studentApplication2.setMotherName("42");
        studentApplication2.setPinCode("42");
        studentApplication2.setState("State");
        studentApplication2.setStudentId(2);
        studentApplication2.setStudentPhoto("Student Photo");
        studentApplicationDao.save(studentApplication);
        studentApplicationDao.save(studentApplication2);
        assertSame(studentApplication, studentApplicationDao.findByStudentId(1));
    }
}


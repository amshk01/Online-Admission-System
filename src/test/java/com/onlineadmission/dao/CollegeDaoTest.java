package com.onlineadmission.dao;

import static org.junit.jupiter.api.Assertions.assertSame;

import com.onlineadmission.model.College;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {CollegeDao.class})
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.onlineadmission.model"})
@DataJpaTest(properties = {"spring.main.allow-bean-definition-overriding=true"})
class CollegeDaoTest {
    @Autowired
    private CollegeDao collegeDao;

    /**
     * Method under test: {@link CollegeDao#findByEmailAndPassword(String, String)}
     */
    @Test
    void testFindByEmailAndPassword() {
        College college = new College();
        college.setAddress("42 Main St");
        college.setAvailableSeat(1);
        college.setCode("Code");
        college.setEmail("jane.doe@example.org");
        college.setLocation("Location");
        college.setName("Name");
        college.setPassword("university");
        college.setPhoneNo("6625550144");
        college.setSeatFull("Is Seat Full");
        college.setTotalSeat(1);

        College college2 = new College();
        college2.setAddress("17 High St");
        college2.setAvailableSeat(-1);
        college2.setCode("42");
        college2.setEmail("john.smith@example.org");
        college2.setLocation("42");
        college2.setName("42");
        college2.setPassword("Password");
        college2.setPhoneNo("8605550118");
        college2.setSeatFull("42");
        college2.setTotalSeat(-1);
        collegeDao.save(college);
        collegeDao.save(college2);
        assertSame(college, collegeDao.findByEmailAndPassword("jane.doe@example.org", "university"));
    }

    /**
     * Method under test: {@link CollegeDao#findByCode(String)}
     */
    @Test
    void testFindByCode() {
        College college = new College();
        college.setAddress("42 Main St");
        college.setAvailableSeat(1);
        college.setCode("Code");
        college.setEmail("jane.doe@example.org");
        college.setLocation("Location");
        college.setName("Name");
        college.setPassword("university");
        college.setPhoneNo("6625550144");
        college.setSeatFull("Is Seat Full");
        college.setTotalSeat(1);

        College college2 = new College();
        college2.setAddress("17 High St");
        college2.setAvailableSeat(-1);
        college2.setCode("42");
        college2.setEmail("john.smith@example.org");
        college2.setLocation("42");
        college2.setName("42");
        college2.setPassword("Password");
        college2.setPhoneNo("8605550118");
        college2.setSeatFull("42");
        college2.setTotalSeat(-1);
        collegeDao.save(college);
        collegeDao.save(college2);
        assertSame(college, collegeDao.findByCode("Code"));
    }

    /**
     * Method under test: {@link CollegeDao#findByEmail(String)}
     */
    @Test
    void testFindByEmail() {
        College college = new College();
        college.setAddress("42 Main St");
        college.setAvailableSeat(1);
        college.setCode("Code");
        college.setEmail("jane.doe@example.org");
        college.setLocation("Location");
        college.setName("Name");
        college.setPassword("university");
        college.setPhoneNo("6625550144");
        college.setSeatFull("Is Seat Full");
        college.setTotalSeat(1);

        College college2 = new College();
        college2.setAddress("17 High St");
        college2.setAvailableSeat(-1);
        college2.setCode("42");
        college2.setEmail("john.smith@example.org");
        college2.setLocation("42");
        college2.setName("42");
        college2.setPassword("Password");
        college2.setPhoneNo("8605550118");
        college2.setSeatFull("42");
        college2.setTotalSeat(-1);
        collegeDao.save(college);
        collegeDao.save(college2);
        assertSame(college, collegeDao.findByEmail("jane.doe@example.org"));
    }

    /**
     * Method under test: {@link CollegeDao#findByName(String)}
     */
    @Test
    void testFindByName() {
        College college = new College();
        college.setAddress("42 Main St");
        college.setAvailableSeat(1);
        college.setCode("Code");
        college.setEmail("jane.doe@example.org");
        college.setLocation("Location");
        college.setName("Name");
        college.setPassword("university");
        college.setPhoneNo("6625550144");
        college.setSeatFull("Is Seat Full");
        college.setTotalSeat(1);

        College college2 = new College();
        college2.setAddress("17 High St");
        college2.setAvailableSeat(-1);
        college2.setCode("42");
        college2.setEmail("john.smith@example.org");
        college2.setLocation("42");
        college2.setName("42");
        college2.setPassword("Password");
        college2.setPhoneNo("8605550118");
        college2.setSeatFull("42");
        college2.setTotalSeat(-1);
        collegeDao.save(college);
        collegeDao.save(college2);
        assertSame(college, collegeDao.findByName("Name"));
    }

    /**
     * Method under test: {@link CollegeDao#findByPhoneNo(String)}
     */
    @Test
    void testFindByPhoneNo() {
        College college = new College();
        college.setAddress("42 Main St");
        college.setAvailableSeat(1);
        college.setCode("Code");
        college.setEmail("jane.doe@example.org");
        college.setLocation("Location");
        college.setName("Name");
        college.setPassword("university");
        college.setPhoneNo("6625550144");
        college.setSeatFull("Is Seat Full");
        college.setTotalSeat(1);

        College college2 = new College();
        college2.setAddress("17 High St");
        college2.setAvailableSeat(-1);
        college2.setCode("42");
        college2.setEmail("john.smith@example.org");
        college2.setLocation("42");
        college2.setName("42");
        college2.setPassword("Password");
        college2.setPhoneNo("8605550118");
        college2.setSeatFull("42");
        college2.setTotalSeat(-1);
        collegeDao.save(college);
        collegeDao.save(college2);
        assertSame(college, collegeDao.findByPhoneNo("6625550144"));
    }
}


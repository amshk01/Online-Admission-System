package com.onlineadmission.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import com.onlineadmission.model.AppliedCollege;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {AppliedCollegeDao.class})
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.onlineadmission.model"})
@DataJpaTest(properties = {"spring.main.allow-bean-definition-overriding=true"})
class AppliedCollegeDaoTest {
    @Autowired
    private AppliedCollegeDao appliedCollegeDao;

    /**
     * Method under test: {@link AppliedCollegeDao#findByStudentId(int)}
     */
    @Test
    void testFindByStudentId() {
        AppliedCollege appliedCollege = new AppliedCollege();
        appliedCollege.setAllotmentStatus("Allotment Status");
        appliedCollege.setCollegeId(1);
        appliedCollege.setStudentId(1);

        AppliedCollege appliedCollege2 = new AppliedCollege();
        appliedCollege2.setAllotmentStatus("42");
        appliedCollege2.setCollegeId(2);
        appliedCollege2.setStudentId(2);
        appliedCollegeDao.save(appliedCollege);
        appliedCollegeDao.save(appliedCollege2);
        assertEquals(1, appliedCollegeDao.findByStudentId(1).size());
    }

    /**
     * Method under test: {@link AppliedCollegeDao#findByCollegeId(int)}
     */
    @Test
    void testFindByCollegeId() {
        AppliedCollege appliedCollege = new AppliedCollege();
        appliedCollege.setAllotmentStatus("Allotment Status");
        appliedCollege.setCollegeId(1);
        appliedCollege.setStudentId(1);

        AppliedCollege appliedCollege2 = new AppliedCollege();
        appliedCollege2.setAllotmentStatus("42");
        appliedCollege2.setCollegeId(2);
        appliedCollege2.setStudentId(2);
        appliedCollegeDao.save(appliedCollege);
        appliedCollegeDao.save(appliedCollege2);
        assertEquals(1, appliedCollegeDao.findByCollegeId(1).size());
    }

    /**
     * Method under test: {@link AppliedCollegeDao#countByStudentId(int)}
     */
    @Test
    void testCountByStudentId() {
        AppliedCollege appliedCollege = new AppliedCollege();
        appliedCollege.setAllotmentStatus("Allotment Status");
        appliedCollege.setCollegeId(1);
        appliedCollege.setStudentId(1);

        AppliedCollege appliedCollege2 = new AppliedCollege();
        appliedCollege2.setAllotmentStatus("42");
        appliedCollege2.setCollegeId(2);
        appliedCollege2.setStudentId(2);
        appliedCollegeDao.save(appliedCollege);
        appliedCollegeDao.save(appliedCollege2);
        assertEquals(0L, appliedCollegeDao.countByStudentId(3).longValue());
    }

    /**
     * Method under test: {@link AppliedCollegeDao#findByStudentIdAndAllotmentStatus(int, String)}
     */
    @Test
    void testFindByStudentIdAndAllotmentStatus() {
        AppliedCollege appliedCollege = new AppliedCollege();
        appliedCollege.setAllotmentStatus("Allotment Status");
        appliedCollege.setCollegeId(1);
        appliedCollege.setStudentId(1);

        AppliedCollege appliedCollege2 = new AppliedCollege();
        appliedCollege2.setAllotmentStatus("42");
        appliedCollege2.setCollegeId(2);
        appliedCollege2.setStudentId(2);
        appliedCollegeDao.save(appliedCollege);
        appliedCollegeDao.save(appliedCollege2);
        assertSame(appliedCollege, appliedCollegeDao.findByStudentIdAndAllotmentStatus(1, "Allotment Status"));
    }

    /**
     * Method under test: {@link AppliedCollegeDao#findByCollegeIdAndAllotmentStatus(int, String)}
     */
    @Test
    void testFindByCollegeIdAndAllotmentStatus() {
        AppliedCollege appliedCollege = new AppliedCollege();
        appliedCollege.setAllotmentStatus("Allotment Status");
        appliedCollege.setCollegeId(1);
        appliedCollege.setStudentId(1);

        AppliedCollege appliedCollege2 = new AppliedCollege();
        appliedCollege2.setAllotmentStatus("42");
        appliedCollege2.setCollegeId(2);
        appliedCollege2.setStudentId(2);
        appliedCollegeDao.save(appliedCollege);
        appliedCollegeDao.save(appliedCollege2);
        assertEquals(1, appliedCollegeDao.findByCollegeIdAndAllotmentStatus(1, "Allotment Status").size());
    }

    /**
     * Method under test: {@link AppliedCollegeDao#findByStudentIdAndCollegeId(int, int)}
     */
    @Test
    void testFindByStudentIdAndCollegeId() {
        AppliedCollege appliedCollege = new AppliedCollege();
        appliedCollege.setAllotmentStatus("Allotment Status");
        appliedCollege.setCollegeId(1);
        appliedCollege.setStudentId(1);

        AppliedCollege appliedCollege2 = new AppliedCollege();
        appliedCollege2.setAllotmentStatus("42");
        appliedCollege2.setCollegeId(2);
        appliedCollege2.setStudentId(2);
        appliedCollegeDao.save(appliedCollege);
        appliedCollegeDao.save(appliedCollege2);
        assertSame(appliedCollege, appliedCollegeDao.findByStudentIdAndCollegeId(1, 1));
    }
}


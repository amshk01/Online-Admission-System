package com.onlineadmission.dao;

import com.onlineadmission.model.CollegeAvailableCourse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {CollegeAvailableCourseDao.class})
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.onlineadmission.model"})
@DataJpaTest(properties = {"spring.main.allow-bean-definition-overriding=true"})
class CollegeAvailableCourseDaoTest {
    @Autowired
    private CollegeAvailableCourseDao collegeAvailableCourseDao;

    /**
     * Method under test: {@link CollegeAvailableCourseDao#findByCollegeId(int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindByCollegeId() {

        CollegeAvailableCourse collegeAvailableCourse = new CollegeAvailableCourse();
        collegeAvailableCourse.setCollegeId(1);
        collegeAvailableCourse.setCourseId(1);

        CollegeAvailableCourse collegeAvailableCourse2 = new CollegeAvailableCourse();
        collegeAvailableCourse2.setCollegeId(2);
        collegeAvailableCourse2.setCourseId(2);
        collegeAvailableCourseDao.save(collegeAvailableCourse);
        collegeAvailableCourseDao.save(collegeAvailableCourse2);
        collegeAvailableCourseDao.findByCollegeId(1);
    }

    /**
     * Method under test: {@link CollegeAvailableCourseDao#findByCourseId(int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindByCourseId() {

        CollegeAvailableCourse collegeAvailableCourse = new CollegeAvailableCourse();
        collegeAvailableCourse.setCollegeId(1);
        collegeAvailableCourse.setCourseId(1);

        CollegeAvailableCourse collegeAvailableCourse2 = new CollegeAvailableCourse();
        collegeAvailableCourse2.setCollegeId(2);
        collegeAvailableCourse2.setCourseId(2);
        collegeAvailableCourseDao.save(collegeAvailableCourse);
        collegeAvailableCourseDao.save(collegeAvailableCourse2);
        collegeAvailableCourseDao.findByCourseId(1);
    }
}


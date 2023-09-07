package com.onlineadmission.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CollegeAvailableCourseTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link CollegeAvailableCourse}
     *   <li>{@link CollegeAvailableCourse#setCollegeId(int)}
     *   <li>{@link CollegeAvailableCourse#setCourseId(int)}
     *   <li>{@link CollegeAvailableCourse#setId(int)}
     *   <li>{@link CollegeAvailableCourse#getCollegeId()}
     *   <li>{@link CollegeAvailableCourse#getCourseId()}
     *   <li>{@link CollegeAvailableCourse#getId()}
     * </ul>
     */
    @Test
    void testConstructor() {
        CollegeAvailableCourse actualCollegeAvailableCourse = new CollegeAvailableCourse();
        actualCollegeAvailableCourse.setCollegeId(1);
        actualCollegeAvailableCourse.setCourseId(1);
        actualCollegeAvailableCourse.setId(1);
        assertEquals(1, actualCollegeAvailableCourse.getCollegeId());
        assertEquals(1, actualCollegeAvailableCourse.getCourseId());
        assertEquals(1, actualCollegeAvailableCourse.getId());
    }
}


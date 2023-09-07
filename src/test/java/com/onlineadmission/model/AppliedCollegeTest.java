package com.onlineadmission.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppliedCollegeTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link AppliedCollege}
     *   <li>{@link AppliedCollege#setAllotmentStatus(String)}
     *   <li>{@link AppliedCollege#setCollegeId(int)}
     *   <li>{@link AppliedCollege#setId(int)}
     *   <li>{@link AppliedCollege#setStudentId(int)}
     *   <li>{@link AppliedCollege#getAllotmentStatus()}
     *   <li>{@link AppliedCollege#getCollegeId()}
     *   <li>{@link AppliedCollege#getId()}
     *   <li>{@link AppliedCollege#getStudentId()}
     * </ul>
     */
    @Test
    void testConstructor() {
        AppliedCollege actualAppliedCollege = new AppliedCollege();
        actualAppliedCollege.setAllotmentStatus("Allotment Status");
        actualAppliedCollege.setCollegeId(1);
        actualAppliedCollege.setId(1);
        actualAppliedCollege.setStudentId(1);
        assertEquals("Allotment Status", actualAppliedCollege.getAllotmentStatus());
        assertEquals(1, actualAppliedCollege.getCollegeId());
        assertEquals(1, actualAppliedCollege.getId());
        assertEquals(1, actualAppliedCollege.getStudentId());
    }
}


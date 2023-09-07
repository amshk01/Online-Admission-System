package com.onlineadmission.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StudentApplicationTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link StudentApplication}
     *   <li>{@link StudentApplication#setApplicationDate(String)}
     *   <li>{@link StudentApplication#setCity(String)}
     *   <li>{@link StudentApplication#setCountry(String)}
     *   <li>{@link StudentApplication#setCourseId(int)}
     *   <li>{@link StudentApplication#setDob(String)}
     *   <li>{@link StudentApplication#setFatherName(String)}
     *   <li>{@link StudentApplication#setId(int)}
     *   <li>{@link StudentApplication#setIsAmountPaid(String)}
     *   <li>{@link StudentApplication#setIsApproved(String)}
     *   <li>{@link StudentApplication#setMotherName(String)}
     *   <li>{@link StudentApplication#setPinCode(String)}
     *   <li>{@link StudentApplication#setState(String)}
     *   <li>{@link StudentApplication#setStudentId(int)}
     *   <li>{@link StudentApplication#setStudentPhoto(String)}
     *   <li>{@link StudentApplication#getApplicationDate()}
     *   <li>{@link StudentApplication#getCity()}
     *   <li>{@link StudentApplication#getCountry()}
     *   <li>{@link StudentApplication#getCourseId()}
     *   <li>{@link StudentApplication#getDob()}
     *   <li>{@link StudentApplication#getFatherName()}
     *   <li>{@link StudentApplication#getId()}
     *   <li>{@link StudentApplication#getIsAmountPaid()}
     *   <li>{@link StudentApplication#getIsApproved()}
     *   <li>{@link StudentApplication#getMotherName()}
     *   <li>{@link StudentApplication#getPinCode()}
     *   <li>{@link StudentApplication#getState()}
     *   <li>{@link StudentApplication#getStudentId()}
     *   <li>{@link StudentApplication#getStudentPhoto()}
     * </ul>
     */
    @Test
    void testConstructor() {
        StudentApplication actualStudentApplication = new StudentApplication();
        actualStudentApplication.setApplicationDate("2020-03-01");
        actualStudentApplication.setCity("Oxford");
        actualStudentApplication.setCountry("GB");
        actualStudentApplication.setCourseId(1);
        actualStudentApplication.setDob("Dob");
        actualStudentApplication.setFatherName("Father Name");
        actualStudentApplication.setId(1);
        actualStudentApplication.setIsAmountPaid("10");
        actualStudentApplication.setIsApproved("Is Approved");
        actualStudentApplication.setMotherName("Mother Name");
        actualStudentApplication.setPinCode("Pin Code");
        actualStudentApplication.setState("MD");
        actualStudentApplication.setStudentId(1);
        actualStudentApplication.setStudentPhoto("alice.liddell@example.org");
        assertEquals("2020-03-01", actualStudentApplication.getApplicationDate());
        assertEquals("Oxford", actualStudentApplication.getCity());
        assertEquals("GB", actualStudentApplication.getCountry());
        assertEquals(1, actualStudentApplication.getCourseId());
        assertEquals("Dob", actualStudentApplication.getDob());
        assertEquals("Father Name", actualStudentApplication.getFatherName());
        assertEquals(1, actualStudentApplication.getId());
        assertEquals("10", actualStudentApplication.getIsAmountPaid());
        assertEquals("Is Approved", actualStudentApplication.getIsApproved());
        assertEquals("Mother Name", actualStudentApplication.getMotherName());
        assertEquals("Pin Code", actualStudentApplication.getPinCode());
        assertEquals("MD", actualStudentApplication.getState());
        assertEquals(1, actualStudentApplication.getStudentId());
        assertEquals("alice.liddell@example.org", actualStudentApplication.getStudentPhoto());
    }
}


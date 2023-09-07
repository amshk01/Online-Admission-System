package com.onlineadmission.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StudentTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Student}
     *   <li>{@link Student#setCity(String)}
     *   <li>{@link Student#setEmailid(String)}
     *   <li>{@link Student#setFirstname(String)}
     *   <li>{@link Student#setId(int)}
     *   <li>{@link Student#setIsVerified(int)}
     *   <li>{@link Student#setLastname(String)}
     *   <li>{@link Student#setMobileno(String)}
     *   <li>{@link Student#setPassword(String)}
     *   <li>{@link Student#setPincode(String)}
     *   <li>{@link Student#setRegisterDate(String)}
     *   <li>{@link Student#setStreet(String)}
     *   <li>{@link Student#setUsername(String)}
     *   <li>{@link Student#getCity()}
     *   <li>{@link Student#getEmailid()}
     *   <li>{@link Student#getFirstname()}
     *   <li>{@link Student#getId()}
     *   <li>{@link Student#getIsVerified()}
     *   <li>{@link Student#getLastname()}
     *   <li>{@link Student#getMobileno()}
     *   <li>{@link Student#getPassword()}
     *   <li>{@link Student#getPincode()}
     *   <li>{@link Student#getRegisterDate()}
     *   <li>{@link Student#getStreet()}
     *   <li>{@link Student#getUsername()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Student actualStudent = new Student();
        actualStudent.setCity("Oxford");
        actualStudent.setEmailid("jane.doe@example.org");
        actualStudent.setFirstname("Jane");
        actualStudent.setId(1);
        actualStudent.setIsVerified(1);
        actualStudent.setLastname("Doe");
        actualStudent.setMobileno("Mobileno");
        actualStudent.setPassword("university");
        actualStudent.setPincode("Pincode");
        actualStudent.setRegisterDate("2020-03-01");
        actualStudent.setStreet("Street");
        actualStudent.setUsername("janedoe");
        assertEquals("Oxford", actualStudent.getCity());
        assertEquals("jane.doe@example.org", actualStudent.getEmailid());
        assertEquals("Jane", actualStudent.getFirstname());
        assertEquals(1, actualStudent.getId());
        assertEquals(1, actualStudent.getIsVerified());
        assertEquals("Doe", actualStudent.getLastname());
        assertEquals("Mobileno", actualStudent.getMobileno());
        assertEquals("university", actualStudent.getPassword());
        assertEquals("Pincode", actualStudent.getPincode());
        assertEquals("2020-03-01", actualStudent.getRegisterDate());
        assertEquals("Street", actualStudent.getStreet());
        assertEquals("janedoe", actualStudent.getUsername());
    }
}


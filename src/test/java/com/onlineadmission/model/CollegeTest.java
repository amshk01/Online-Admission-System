package com.onlineadmission.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CollegeTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link College}
     *   <li>{@link College#setAddress(String)}
     *   <li>{@link College#setAvailableSeat(int)}
     *   <li>{@link College#setCode(String)}
     *   <li>{@link College#setEmail(String)}
     *   <li>{@link College#setId(int)}
     *   <li>{@link College#setLocation(String)}
     *   <li>{@link College#setName(String)}
     *   <li>{@link College#setPassword(String)}
     *   <li>{@link College#setPhoneNo(String)}
     *   <li>{@link College#setSeatFull(String)}
     *   <li>{@link College#setTotalSeat(int)}
     *   <li>{@link College#getAddress()}
     *   <li>{@link College#getAvailableSeat()}
     *   <li>{@link College#getCode()}
     *   <li>{@link College#getEmail()}
     *   <li>{@link College#getId()}
     *   <li>{@link College#getLocation()}
     *   <li>{@link College#getName()}
     *   <li>{@link College#getPassword()}
     *   <li>{@link College#getPhoneNo()}
     *   <li>{@link College#getTotalSeat()}
     *   <li>{@link College#isSeatFull()}
     * </ul>
     */
    @Test
    void testConstructor() {
        College actualCollege = new College();
        actualCollege.setAddress("42 Main St");
        actualCollege.setAvailableSeat(1);
        actualCollege.setCode("Code");
        actualCollege.setEmail("jane.doe@example.org");
        actualCollege.setId(1);
        actualCollege.setLocation("Location");
        actualCollege.setName("Name");
        actualCollege.setPassword("university");
        actualCollege.setPhoneNo("6625550144");
        actualCollege.setSeatFull("Is Seat Full");
        actualCollege.setTotalSeat(1);
        assertEquals("42 Main St", actualCollege.getAddress());
        assertEquals(1, actualCollege.getAvailableSeat());
        assertEquals("Code", actualCollege.getCode());
        assertEquals("jane.doe@example.org", actualCollege.getEmail());
        assertEquals(1, actualCollege.getId());
        assertEquals("Location", actualCollege.getLocation());
        assertEquals("Name", actualCollege.getName());
        assertEquals("university", actualCollege.getPassword());
        assertEquals("6625550144", actualCollege.getPhoneNo());
        assertEquals(1, actualCollege.getTotalSeat());
        assertEquals("Is Seat Full", actualCollege.isSeatFull());
    }
}


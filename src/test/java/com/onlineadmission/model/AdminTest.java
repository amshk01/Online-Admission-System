package com.onlineadmission.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AdminTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link Admin}
     *   <li>{@link Admin#setCity(String)}
     *   <li>{@link Admin#setEmailid(String)}
     *   <li>{@link Admin#setFirstname(String)}
     *   <li>{@link Admin#setId(int)}
     *   <li>{@link Admin#setLastname(String)}
     *   <li>{@link Admin#setMobileno(String)}
     *   <li>{@link Admin#setPassword(String)}
     *   <li>{@link Admin#setPincode(String)}
     *   <li>{@link Admin#setStreet(String)}
     *   <li>{@link Admin#setUsername(String)}
     *   <li>{@link Admin#getCity()}
     *   <li>{@link Admin#getEmailid()}
     *   <li>{@link Admin#getFirstname()}
     *   <li>{@link Admin#getId()}
     *   <li>{@link Admin#getLastname()}
     *   <li>{@link Admin#getMobileno()}
     *   <li>{@link Admin#getPassword()}
     *   <li>{@link Admin#getPincode()}
     *   <li>{@link Admin#getStreet()}
     *   <li>{@link Admin#getUsername()}
     * </ul>
     */
    @Test
    void testConstructor() {
        Admin actualAdmin = new Admin();
        actualAdmin.setCity("Oxford");
        actualAdmin.setEmailid("jane.doe@example.org");
        actualAdmin.setFirstname("Jane");
        actualAdmin.setId(1);
        actualAdmin.setLastname("Doe");
        actualAdmin.setMobileno("Mobileno");
        actualAdmin.setPassword("university");
        actualAdmin.setPincode("Pincode");
        actualAdmin.setStreet("Street");
        actualAdmin.setUsername("janedoe");
        assertEquals("Oxford", actualAdmin.getCity());
        assertEquals("jane.doe@example.org", actualAdmin.getEmailid());
        assertEquals("Jane", actualAdmin.getFirstname());
        assertEquals(1, actualAdmin.getId());
        assertEquals("Doe", actualAdmin.getLastname());
        assertEquals("Mobileno", actualAdmin.getMobileno());
        assertEquals("university", actualAdmin.getPassword());
        assertEquals("Pincode", actualAdmin.getPincode());
        assertEquals("Street", actualAdmin.getStreet());
        assertEquals("janedoe", actualAdmin.getUsername());
    }
}


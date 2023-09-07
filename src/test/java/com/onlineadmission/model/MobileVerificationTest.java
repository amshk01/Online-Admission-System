package com.onlineadmission.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MobileVerificationTest {
    /**
     * Methods under test:
     *
     * <ul>
     *   <li>default or parameterless constructor of {@link MobileVerification}
     *   <li>{@link MobileVerification#setId(int)}
     *   <li>{@link MobileVerification#setMobile(String)}
     *   <li>{@link MobileVerification#setOtp(String)}
     *   <li>{@link MobileVerification#getId()}
     *   <li>{@link MobileVerification#getMobile()}
     *   <li>{@link MobileVerification#getOtp()}
     * </ul>
     */
    @Test
    void testConstructor() {
        MobileVerification actualMobileVerification = new MobileVerification();
        actualMobileVerification.setId(1);
        actualMobileVerification.setMobile("Mobile");
        actualMobileVerification.setOtp("Otp");
        assertEquals(1, actualMobileVerification.getId());
        assertEquals("Mobile", actualMobileVerification.getMobile());
        assertEquals("Otp", actualMobileVerification.getOtp());
    }
}


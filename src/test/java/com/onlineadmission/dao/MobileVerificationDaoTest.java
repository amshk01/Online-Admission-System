package com.onlineadmission.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.onlineadmission.model.MobileVerification;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {MobileVerificationDao.class})
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.onlineadmission.model"})
@DataJpaTest(properties = {"spring.main.allow-bean-definition-overriding=true"})
class MobileVerificationDaoTest {
    @Autowired
    private MobileVerificationDao mobileVerificationDao;

    /**
     * Method under test: {@link MobileVerificationDao#findAllByMobile(String)}
     */
    @Test
    void testFindAllByMobile() {
        MobileVerification mobileVerification = new MobileVerification();
        mobileVerification.setMobile("Mobile");
        mobileVerification.setOtp("Otp");

        MobileVerification mobileVerification2 = new MobileVerification();
        mobileVerification2.setMobile("42");
        mobileVerification2.setOtp("42");
        mobileVerificationDao.save(mobileVerification);
        mobileVerificationDao.save(mobileVerification2);
        assertEquals(1, mobileVerificationDao.findAllByMobile("Mobile").size());
    }
}

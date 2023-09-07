package com.onlineadmission.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlineadmission.model.MobileVerification;



@Repository
public interface MobileVerificationDao extends JpaRepository<MobileVerification, Integer>{
	
	List<MobileVerification> findAllByMobile(String mobile);


}

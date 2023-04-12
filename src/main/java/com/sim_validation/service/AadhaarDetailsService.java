package com.sim_validation.service;

import com.sim_validation.dto.AadhaarDetailsDto;
import com.sim_validation.entity.AadhaarDetails;

public interface AadhaarDetailsService {

	void addDetails(AadhaarDetails aadhaarDetails);

	String checkAadhar(AadhaarDetailsDto aadhaarDetailsDto);

}

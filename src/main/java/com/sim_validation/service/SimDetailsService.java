package com.sim_validation.service;

import com.sim_validation.dto.AadhaarDetailsDto;
import com.sim_validation.dto.SimDetailsDto;
import com.sim_validation.entity.SimDetails;

public interface SimDetailsService {

	String addNumber(SimDetails simDetails);

	String check(SimDetailsDto simDetailsDto);


}

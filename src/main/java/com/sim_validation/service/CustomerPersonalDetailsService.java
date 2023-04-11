package com.sim_validation.service;

import com.sim_validation.entity.CustomerPersonalDetails;

public interface CustomerPersonalDetailsService {

	void saveDetails(String serviceNumber, CustomerPersonalDetails customerPersonalDetails);

}

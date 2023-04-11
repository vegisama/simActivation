package com.sim_validation.service;

import com.sim_validation.entity.CustomerAddressDetails;

public interface CustomerAddressDetailsService {

	void saveAddress(String serviceNumber, CustomerAddressDetails customerAddressDetails);

}

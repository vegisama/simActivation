package com.sim_validation.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sim_validation.dto.CompleteDetails;
import com.sim_validation.entity.CustomerAddressDetails;
import com.sim_validation.repo.CustomerAddressDetailsRepository;
import com.sim_validation.service.CustomerAddressDetailsService;

@Service
public class CustomerAddressDetailsServiceImple implements CustomerAddressDetailsService {

	@Autowired
	private CustomerAddressDetailsRepository customerAddressDetailsRepository;

	@Override
	public void saveAddress(String serviceNumber, CustomerAddressDetails customerAddressDetails) {
		customerAddressDetails.setServiceNumber(serviceNumber);
		customerAddressDetailsRepository.save(customerAddressDetails);
	}
}

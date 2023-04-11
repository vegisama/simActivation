package com.sim_validation.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sim_validation.entity.CustomerPersonalDetails;
import com.sim_validation.repo.CustomerPersonalDetailsRepository;
import com.sim_validation.service.CustomerPersonalDetailsService;

@Service
public class CustomerPersonalDetailsServiceImple implements CustomerPersonalDetailsService {

	@Autowired
	private CustomerPersonalDetailsRepository customerPersonalDetailsRepository;

	@Override
	public void saveDetails(String serviceNumber, CustomerPersonalDetails customerPersonalDetails) {
		// TODO Auto-generated method stub
		customerPersonalDetails.setServiceNumber(serviceNumber);
		customerPersonalDetailsRepository.save(customerPersonalDetails);

	}

}

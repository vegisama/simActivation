package com.sim_validation.serviceImple;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sim_validation.dto.AadhaarDetailsDto;
import com.sim_validation.entity.AadhaarDetails;
import com.sim_validation.repo.AadhaarDetailsRepository;
import com.sim_validation.service.AadhaarDetailsService;

@Service
public class AadhaarDetailsServiceImple implements AadhaarDetailsService {

	@Autowired
	private AadhaarDetailsRepository aadhaarDetailsRepository;

	@Override
	public void addDetails(AadhaarDetails aadhaarDetails) {
		// TODO Auto-generated method stub
		aadhaarDetailsRepository.save(aadhaarDetails);

	}

	@Override
	public String checkAadhar(AadhaarDetailsDto aadhaarDetailsDto) {
		Optional<AadhaarDetails> aadhaarPresent = aadhaarDetailsRepository.findById(aadhaarDetailsDto.getIdNumber());

		if (aadhaarPresent.isPresent()
				&& aadhaarPresent.get().getAddFirstName().equals(aadhaarDetailsDto.getAddFirstName())
				&& aadhaarPresent.get().getAddLastName().equals(aadhaarDetailsDto.getAddLastName())) {
			return "valid_aadhaar";
		} else {
			return "invalid";
		}

	}

}

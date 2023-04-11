package com.sim_validation.serviceImple;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sim_validation.dto.CheckEmailDto;
import com.sim_validation.entity.BasicUserValidation;
import com.sim_validation.repo.BasicUserValidationRepository;
import com.sim_validation.service.BasicUserValidationService;

@Service
public class BasicUserValidationServiceImple implements BasicUserValidationService {

	@Autowired
	private BasicUserValidationRepository basicUserValidationRepository;

	@Override
	public void addEmail(BasicUserValidation basicUserValidation) {
		basicUserValidationRepository.save(basicUserValidation);
	}

	@Override
	public String checkEmail(CheckEmailDto checkEmailDto) {
		Optional<BasicUserValidation> checkingMail = basicUserValidationRepository.findById(checkEmailDto.getEmail());
		if (checkingMail.isPresent()) {
			return "mail is already used";
		} else {
			return "mail is not used";
		}
	}
}

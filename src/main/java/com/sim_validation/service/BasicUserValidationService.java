package com.sim_validation.service;

import com.sim_validation.dto.CheckEmailDto;
import com.sim_validation.entity.BasicUserValidation;

public interface BasicUserValidationService {

	void addEmail(BasicUserValidation basicUserValidation);

	String checkEmail(CheckEmailDto checkEmailDto);

}

package com.sim_validation.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sim_validation.dto.CheckEmailDto;
import com.sim_validation.entity.BasicUserValidation;
import com.sim_validation.service.BasicUserValidationService;

@RestController
public class BasicUserValidationController {

	@Autowired
	private BasicUserValidationService basicUserValidationService;

	@PostMapping("/add/email")
	public String addEmail(@RequestBody BasicUserValidation basicUserValidation) {
		basicUserValidationService.addEmail(basicUserValidation);
		return "email added in already used email";
	}

	@PostMapping("/verify/Email")
	@ResponseBody
	@CrossOrigin
	public Object checkEmail(@RequestBody CheckEmailDto checkEmailDto) {
		String checkMail = basicUserValidationService.checkEmail(checkEmailDto);
		Map<String, Object> object = new HashMap<>();
		if (checkMail == "mail is already used") {
			object.put("checkMail", "mail is already used");
		} else {
			object.put("success", "mail is not used");
		}
		return object;
	}
}

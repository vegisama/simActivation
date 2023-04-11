package com.sim_validation.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {
	
	private String serviceNumber;
	
	private String title;
	
	private String firstName;
	
	private String lastName;
	
	private String email;

	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dateOfBirth;
}

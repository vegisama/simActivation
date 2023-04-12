package com.sim_validation.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AadhaarDetailsDto {

	@Size(min = 12, max = 12)
	private String idNumber;

	private String idType;

	private String state;

	private String addFirstName;

	private String addLastName;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date addDateOfBirth;
}

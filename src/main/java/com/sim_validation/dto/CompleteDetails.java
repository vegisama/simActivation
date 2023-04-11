package com.sim_validation.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompleteDetails {

	@Size(min = 13, max = 13)
	private String simNumber;

	@Size(min = 10, max = 10)
	private String serviceNumber;

	@Email
	private String email;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateOfBirth;

	private String title;

	private String firstName;

	private String lastName;

	private String idtype;

	private String state;

	private String idNumber;

	private String address;

	private String addressFirstName;

	private String addressLastName;

	private String addressDateOfBirth;

	private String addressEmail;

	private String pincode;

	private String city;
}

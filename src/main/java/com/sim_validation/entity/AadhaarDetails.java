package com.sim_validation.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AadhaarDetails {
	
	@Id
	@Size(min = 12, max =12)
	@Column(unique = true)
	private String idNumber;
	
	@Column(nullable = false)
	private String idType;
	
	@Column(nullable = false)
	private String state;
	
	@Column(nullable = false)
	private String addFirstName;
	
	@Column(nullable = false)
	private String addLastName;
	
	@Column(nullable = false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date addDateOfBirth;
}

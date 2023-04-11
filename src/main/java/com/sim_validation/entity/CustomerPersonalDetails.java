package com.sim_validation.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="cus_per_det")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerPersonalDetails {
	
	@Id
	@Size(min=10,max=10)
	private String serviceNumber;
	
	@Column(nullable=false)
	private String title;
	
	@Size(max=15)
	@Column(nullable=false)
	private String firstName;
	
	@Size(max=15)
	@Column(nullable=false)
	private String lastName;
	
	@Email
	@Column(nullable = false,unique = true)
	private String email;
	
	@Column(nullable = false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateOfBirth;

}

package com.sim_validation.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="id_proof")
public class IdProofValidation {
	
	@Id
	@Size(min=10,max=10)
	private String serviceNumber;
	
	@Size(min=12,max=12)
	private String idNumber;
	
	private String idType;
	
	@Size(max=15)
	@Column(nullable=false)
	private String firstName;
	
	@Size(max=15)
	@Column(nullable=false)
	private String lastName;
	
	@Column(nullable = false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateOfBirth;
	
}

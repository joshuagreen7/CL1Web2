package com.cibertec.hospital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name = "staff")
public class Staff {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int staffId;
	//FK 
	@ManyToOne
	@JoinColumn (name="departmentId")
	private Department department;
	
	private String staffFName;
	private String staffLName;
	private String staffAddress;
	private String staffPhoneNumber;
}


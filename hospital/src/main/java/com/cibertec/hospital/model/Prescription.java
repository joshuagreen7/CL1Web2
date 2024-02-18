package com.cibertec.hospital.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
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
@Table (name = "prescription")
public class Prescription {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="prescriptionId")
	private int id; //prescriptionNum
	// FK 
	@ManyToOne
	@JoinColumn (name="patientId")
	private Patient patient;
	
	private String medicationName;
	private LocalDate PrescriptionDate;
	private Double PrescriptionCost;

}


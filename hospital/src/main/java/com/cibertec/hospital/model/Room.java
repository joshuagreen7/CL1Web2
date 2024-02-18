package com.cibertec.hospital.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name = "room")
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roomId;
	// FK 
	@OneToOne
	@JoinColumn (name="patientId")
	private Patient patient;
	
	// FK 
	@ManyToOne
	@JoinColumn (name="staffId")
	private Staff staff;
	
	private LocalDate admissionDate;
	
	
}

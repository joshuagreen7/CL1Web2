package com.cibertec.hospital.model;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name = "appointment") //tabla intermedia
public class Appointment {

	// FK private int patientId;
	// FK private int DoctorId;
	@Id
	@ManyToOne
	@JoinColumn(name = "patientId")
    private Patient patientId;

    @Id
    @ManyToOne
    @JoinColumn(name = "doctorId")
    private Doctor doctorId;
	
  
	@Column(name = "date")
	private LocalDate date;
	
	//@Column(name = "time") 
	//private Time time;
	
	//@Column(name = "time")
	//private Timestamp time;
  
	//@Column(name = "datetime")
	//private Timestamp datetime;
	
}

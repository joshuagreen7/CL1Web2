package com.cibertec.hospital.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.hospital.model.Prescription;

public interface PrescriptionRepo extends JpaRepository<Prescription, Integer>{

	List<Prescription> findAllByPatientId(int patientId);

}

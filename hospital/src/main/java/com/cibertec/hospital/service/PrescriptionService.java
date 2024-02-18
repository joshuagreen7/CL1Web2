package com.cibertec.hospital.service;

import java.util.List;

import com.cibertec.hospital.dto.PrescriptionCostResponse;
import com.cibertec.hospital.model.Prescription;
import com.cibertec.hospital.projections.PrescriptionCostProjection;

public interface PrescriptionService {
	
	public List<Prescription> list();
	public Prescription add(Prescription pre);
	public Prescription update(Prescription pre);
	public void delete(int id);
	
	//List<PrescriptionCostResponse> getTotalPrescriptionCostByPatient();
	
	//Projections
    List<PrescriptionCostProjection> getTotalPrescriptionCostByPatient2();


}

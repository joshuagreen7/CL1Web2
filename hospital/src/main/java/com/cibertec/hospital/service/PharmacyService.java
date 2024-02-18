package com.cibertec.hospital.service;

import java.util.List;

import com.cibertec.hospital.model.Pharmacy;

public interface PharmacyService {
	public List<Pharmacy> list();
	public Pharmacy add(Pharmacy pha);
	public Pharmacy update(Pharmacy pha);
	public void delete(int id);
}

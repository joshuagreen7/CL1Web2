package com.cibertec.hospital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.hospital.model.Pharmacy;
import com.cibertec.hospital.repo.PharmacyRepo;
import com.cibertec.hospital.service.PharmacyService;

@Service
public class PharmacyServiceImpl implements PharmacyService{
	
	@Autowired
	PharmacyRepo pharmacyRepo;

	@Override
	public List<Pharmacy> list() {
		// TODO Auto-generated method stub
		return pharmacyRepo.findAll();
	}

	@Override
	public Pharmacy add(Pharmacy pha) {
		// TODO Auto-generated method stub
		return pharmacyRepo.save(pha);
	}

	@Override
	public Pharmacy update(Pharmacy pha) {
		// TODO Auto-generated method stub
		return pharmacyRepo.save(pha);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		pharmacyRepo.deleteById(id);
	}
	
}

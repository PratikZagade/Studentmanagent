package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.DoctorRepo;
import com.example.demo.entity.Doctor;

@Service
public class DoctorService {
	@Autowired
	DoctorRepo dr;

	public void save(Doctor d) {
		dr.save(d);
		
	}

	public void delete(int did) {
		dr.deleteById(did);
		
	}

	public Doctor GetDoctor(int did) {
		Optional<Doctor>o = dr.findById(did);
		Doctor d = o.get();
		return d;
	}
	

	

}

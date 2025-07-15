package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.Appointmentrepo;
import com.example.demo.entity.Appointment;


@Service
public class AppointmentService {
	@Autowired
	Appointmentrepo ar;

	public void save(Appointment a) {
		ar.save(a);
		
		
	}

	public void delete(int aid) {
		ar.deleteById(aid);
		
	}

	public Appointment getAppointment(int aid) {
		Optional<Appointment> o= ar.findById(aid);
		Appointment a= o.get();
	
		return a;
	}
}

package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.StaffRepo;
import com.example.demo.entity.Staff;

@Service
public class StaffService {
	@Autowired
	StaffRepo sr;

	public void save(Staff s) {
		sr.save(s);

	}

	public void delete(int s) {
		sr.deleteById(s);

	}

	public Staff GetStaff(int sid) {
		Optional<Staff> o = sr.findById(sid);
		Staff s = o.get();
		return s;
	}

}

package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Staff;
import com.example.demo.service.StaffService;

@RestController
public class StaffController {
	@Autowired
	StaffService ss;
	
	@PostMapping("addStaff")
	public String addStaff(@RequestBody Staff s) {
		ss.save(s);
		return"Staff Added....";
	}
	@DeleteMapping("DeleteStaff/{sid}")
	public String DeleteStaff(@PathVariable int sid) {
		ss.delete(sid);
		return"Staff Deleted.....";
	}
	@GetMapping("GetStaff/{sid}")
	public Staff GetStaff(@PathVariable int sid) {
		return ss.GetStaff(sid);
	}

}

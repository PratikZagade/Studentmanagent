package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
	
	
	@GetMapping("calc/{operationType}/{a}/{b}")
	int calculations(@PathVariable String operationType, @PathVariable int a, @PathVariable int b) 
	{
		if(operationType.equals("add"))
		{
			System.out.println("this is addition");
			return a+b;
		}
			
		if(operationType.equals("sub")) {
			return a-b;
		}
			
		if(operationType.equals("mul")) {
			return a*b;
		}
		
		if(operationType.equals("div")) {
			return a/b;
		}
		return 0;
	}
}
	


package com.spring.boot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.model.Employee;

@RestController
public class EmployeeController {
	
	@RequestMapping("/getEmployee")
    public List<Employee> getEmployees() 
    {
		List<Employee> employeesList = new ArrayList<Employee>();
		
		
		employeesList.add(new Employee(1,"Leeladhar","G","leeladhar45@gmail.com"));
		return employeesList;
    }
	
	@RequestMapping("/")
	public String ping() 
    {
		String status= "Service is Up";
		
		return status ;
    }

}

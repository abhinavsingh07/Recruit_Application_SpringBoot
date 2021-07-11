package com.abhiwork.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhiwork.model.Employee;
import com.abhiwork.service.EmployeeService;

@RestController
@RequestMapping("/employee/api")
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	@GetMapping(value="/employees",produces ="application/json")
	public List<Employee> getEmployees() {
		List<Employee> empList = null;
		try {
			empList = empService.getEmployees();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return empList;
	}

}

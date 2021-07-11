package com.abhiwork.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.abhiwork.model.Address;
import com.abhiwork.model.Employee;

@Service("EmployeeService")
public class EmployeeService {

	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(12,"Abhinav","","Singh",10000,24,"Senior Software Engineer",new Address("Faridabad","Haryana","Faridabad",121004)));
		return empList;
	}

}

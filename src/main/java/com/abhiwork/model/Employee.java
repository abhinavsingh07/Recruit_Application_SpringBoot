package com.abhiwork.model;

public class Employee {

	private int employeeId;
	private	String firstname;
	private	String middlename;
	private	String lastname;
	private long salary;
	private int leaves;
	private String designation;
	private Address address;
	
	public Employee(int employeeId, String firstname, String middlename, String lastname, long salary, int leaves,
			String designation, Address address) {
		super();
		this.employeeId = employeeId;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.salary = salary;
		this.leaves = leaves;
		this.designation = designation;
		this.address = address;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public int getLeaves() {
		return leaves;
	}
	public void setLeaves(int leaves) {
		this.leaves = leaves;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstname=" + firstname + ", middlename=" + middlename
				+ ", lastname=" + lastname + ", salary=" + salary + ", leaves=" + leaves + ", designation="
				+ designation + ", address=" + address + "]";
	}
	
}

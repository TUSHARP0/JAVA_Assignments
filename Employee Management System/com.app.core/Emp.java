package com.app.core;

import java.io.Serializable;
import java.time.LocalDate;

public class Emp implements Serializable{
	private String id;
	private String firstName;
	private String lastName;
	private Department dept;
	private double sal;
	private LocalDate joinDate;
	
	public Emp(String id, String firstName, String lastName, Department dept, double sal, LocalDate joinDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dept = dept;
		this.sal = sal;
		this.joinDate = joinDate;
	}

	public Emp(String id) {
		this.id=id;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	
	public Department getDept() {
		return dept;
	}

	public double getSal() {
		return sal;
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dept=" + dept + ", sal="
				+ sal + ", joinDate=" + joinDate + "]";
	}
	
	
}

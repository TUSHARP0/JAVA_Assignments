package com.core;

import java.time.LocalDate;

public class Customer implements Comparable<Customer> {
	//customer id(int) ,first name, last name (string),email(string),password(string),registrationAmount(double),dob(LocalDate),plan(ServicePlan : enum)
	private int CustId;
	private String FirstName;
	private String LastName;
	private String email;
	private String password;
	private double RegAmount;
	private LocalDate dob;
	private ServicePlan plan;
	
	private static int counter;// auto increment id
	static {
	counter=0;
	}
	public Customer(String firstName, String lastName, String email, String password, double regAmount,LocalDate dob, ServicePlan plan) {
		super();
		this.CustId = ++counter;
		FirstName = firstName;
		LastName = lastName;
		this.email = email;
		this.password = password;
		RegAmount = regAmount;
		this.dob = dob;
		this.plan = plan;
	}
	
	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getRegAmount() {
		return RegAmount;
	}

	public void setRegAmount(double regAmount) {
		RegAmount = regAmount;
	}

	public int getCustId() {
		return CustId;
	}

	public ServicePlan getPlan() {
		return plan;
	}

//	public static int getCounter() {
//		return counter;
//	}

	public Customer(String email) {
		this.email=email;
	}
	

	@Override
	public String toString() {
		return "CustId = " + CustId + ", FirstName = " + FirstName + ", LastName = " + LastName + ", email = " + email
				+ ", password = " + password + ", RegAmount = " + RegAmount + ", dob = " + dob + ", plan = " + plan ;
	}
	
	public LocalDate getDob() {
		return dob;
	}

	@Override
	public boolean equals(Object o) {
//		System.out.println("In equals method");
		if(o instanceof Customer)
			return this.email.equals(((Customer)o).email);
		return false;
	}
	
	@Override
	public int compareTo(Customer anotherCust) {
		return this.email.compareTo(anotherCust.email);
	}

}

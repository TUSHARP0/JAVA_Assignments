package com.core;

import java.time.LocalDate;

public class Vehicle {
	private String chasisNo;
	private Color color;
	private double basePrice;
	private LocalDate manufactureDate;
	private String company;
	private boolean isAvailable;
	
	public Vehicle(String chasisNo, Color color, double basePrice, LocalDate manufactureDate, String company) {
		super();
		this.chasisNo = chasisNo;
		this.color = color;
		this.basePrice = basePrice;
		this.manufactureDate = manufactureDate;
		this.company = company;
		this.isAvailable=true;
	}
	
	public Vehicle(String chasisNo) {
		this.chasisNo=chasisNo;
	}

	
	@Override
	public boolean equals(Object o) {
		System.out.println("In Equals Method");
		if(o instanceof Vehicle)
			return this.chasisNo.equals(((Vehicle)o).chasisNo);
		return false;
	}

	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", color=" + color + ", basePrice=" + basePrice + ", manufactureDate="
				+ manufactureDate + ", company=" + company + ", isAvailable=" + isAvailable + "]";
	}
	
	
}

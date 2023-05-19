package com.core.app;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Tape extends Publish {

	private int min;

	public Tape(int Id,String text, double price, LocalDate date, int rating, int min) {
		super(Id,text, price, date, rating);
		this.min = LocalDateTime.now().getMinute();
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	@Override
	public String toString() {
		return super.toString()+"Tape [min=" + min + "]";
	}

	
	
	
	
	
}

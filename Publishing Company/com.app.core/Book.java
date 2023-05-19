package com.core.app;

import java.time.LocalDate;

public class Book extends Publish{
	
	private int Pages;


	public Book(int Id,String text, double price, LocalDate date, int rating, int pages) {
		super(Id,text, price, date, rating);
		Pages = pages;
	}


	public int getPages() {
		return Pages;
	}


	public void setPages(int pages) {
		Pages = pages;
	}


	@Override
	public String toString() {
		return super.toString()+"Book [Pages=" + Pages + "]";
	}

	
	
	
}

package com.core.app;

import java.io.Serializable;
import java.time.LocalDate;

public class Publish implements Serializable{

	private int Id;
	private String text;
	private double price;
	private LocalDate date;
	private int rating;
	
//	private static int cnt;
//	
//	static {
//		cnt = cnt+ 1;
//	}

	public Publish(int Id,String text, double price, LocalDate date, int rating) {
		super();
		this.Id = Id;
		this.text = text;
		this.price = price;
		this.date = date;
		this.rating = rating;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

//	public static int getCnt() {
//		return cnt;
//	}
//
//	public static void setCnt(int cnt) {
//		Publish.cnt = cnt;
//	}

	public Publish (int id) {
		this.Id=id;
	}
	@Override
	public String toString() {
		return " [Id=" + Id + ", text=" + text + ", price=" + price + ", date=" + date + ", rating=" + rating + "]";
	}
	
	
	
	
	
}

package com.core;

public enum ServicePlan {
	SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
	
	private double Cost;
	private ServicePlan(double Cost) {
		//super(name,ordinal): java.lang.Enum
		this.Cost=Cost;
	}
	public double getCost() {
		return Cost;
	}
	
	@Override
	public String toString() {
		return name()+" "+Cost;
	}
}

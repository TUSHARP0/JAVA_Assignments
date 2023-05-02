package com.app.core;

public enum Color {
	WHITE(10000), SILVER(20000), BLACK(15000), BLUE(35000), RED(50000);//enum are singletons, they are created in static initialising block and called only once
	//state : Colorcost
	private double colorCost;
	// all enum constructor are implicitly private
	private Color(double colorCost) //implicitly constructor with String name and int ordinal(position) is added
	{
		//super(name,ordinal);
		this.colorCost = colorCost;
	}
	//getter

	public double getColorCost() {
		return colorCost;
	}
	@Override
	public String toString()
	{
		return name()+"@"+colorCost;
	}
	
}

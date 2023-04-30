package Fruit;

public class Fruit {
	private String colour;
	private double weight;
	private String name;
	private boolean fresh;
	
	public Fruit(String colour, double weight, String name) {
		this.colour=colour;
		this.weight=weight;
		this.name=name;
		this.fresh=true;
	}
	
	public void setColour(String colour) {
		this.colour=colour;
	}
	
	public String getColour() {
		return colour;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return fresh;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}
	
	public void taste() {
		System.out.println("No Specific Taste");
	}

	public String toString() {
		return "Name: "+name+" Colour: "+colour+" Weight:"+weight+" Fresh: "+fresh;
	}
	
	
}

package Fruit;

public class Mango extends Fruit{
	
	public Mango(String colour,double weight, String name) {
		super(colour,weight,name);
	}
	
	
	public void pulp() {
		System.out.println(this.getName()+" "+this.getColour()+" Creating Pulp");
	}
	
	@Override
	public void taste() {
		System.out.println("Sweet");
	}
	
}

package Fruit;

public class Orange extends Fruit {
	
	public Orange(String colour,double weight, String name) {
		super(colour,weight,name);
	}
	
	
	public void juice() {
		System.out.println(this.getName()+" "+this.getColour()+" Extracting Juice");
	}
	
	@Override
	public void taste() {
		System.out.println("Sour");
	}
	
}

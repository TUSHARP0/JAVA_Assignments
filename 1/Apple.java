package Fruit;

public class Apple extends Fruit{
	
	public Apple(String colour,double weight, String name) {
		super(colour,weight,name);
	}
	
	
	public void jam() {
		System.out.println(this.getName()+" "+this.getColour()+" Making Jam");
	}
	
	@Override
	public void taste() {
		System.out.println("Sweet and Sour");
	}
	
}

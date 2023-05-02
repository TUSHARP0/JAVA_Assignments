package Tester;

import java.util.Scanner;

import com.core.Vehicle;

import Exception.VehicleValidationException;

import static utils.VehicleValidationRules.*; 

public class VehicleTester {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
		System.out.println("Enter the capacity of showroom");
		Vehicle[] showroom= new Vehicle[sc.nextInt()];
		boolean exit=false;
		int counter=0;
		while(!exit) {
			System.out.println("1. Add vehicle 2. Display Vehicles 3. Exit");
			System.out.println("Enter the choice");
			try {
				switch(sc.nextInt()) {
				case 1:if(counter<showroom.length) {
					System.out.println("Enter Chasis No. Color BasePrice ManufactureDate Comapany Name ");
					Vehicle v= ValidateAllInputs(sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next(),showroom);// all rules we have to apply to the vehicles so use vehicle class at start
					showroom[counter++]=v;
					System.out.println("Vehicle is added");
				} else {
					throw new VehicleValidationException("Showroom is full");
				}
					break;
					
				case 2: for(Vehicle v:showroom)
							if(v!=null)
								System.out.println(v);
					break;
					
				case 3: exit=true;
					break;
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		} 
		}
	}

}

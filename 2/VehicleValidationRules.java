package utils;

import java.time.LocalDate;

import com.core.Color;
import com.core.Vehicle;

import Exception.VehicleValidationException;

public class VehicleValidationRules {
	
	public static Vehicle ValidateAllInputs(String chasisNo, String validColor, double basePrice, String manufactureDate, String company,Vehicle[] vehicles) throws VehicleValidationException {
		duplicateVehicle(chasisNo, vehicles);
		Color color=parseAndValidColor(validColor);
		double netPrice = basePrice + color.getColorCost();
		LocalDate MRF=parseAndValidateDate(manufactureDate);
		return new Vehicle(chasisNo, color, netPrice, MRF, company);
	}
	
	public static Color parseAndValidColor(String color) {
		return Color.valueOf(color.toUpperCase());
	}
	
	public static LocalDate parseAndValidateDate(String d) throws VehicleValidationException 
	{
		LocalDate d1=LocalDate.parse(d);
		LocalDate validDate=LocalDate.of(LocalDate.now().getYear(), 1, 1);
		
		if(d1.isAfter(validDate))
			return d1;
		throw new VehicleValidationException("Car valid date should be after 1 jan ");
	}
	
	public static void duplicateVehicle(String chasisNo, Vehicle[] vehicles) throws VehicleValidationException {
		Vehicle newVehicle=new Vehicle(chasisNo);
		for(Vehicle v:vehicles)
			if(v!=null)
				if(v.equals(newVehicle))//Comparing two chasis No
					throw new VehicleValidationException("Matching chasis No.");
		System.out.println("No duplicate Found");
				
	}
}

package com.core;

import java.util.List;
import java.util.ArrayList;
import static utils.CustomerValidationRules.*;

public class CustomerData {
	public static List<Customer> customer(){
	try {
		ArrayList<Customer> cust=new ArrayList<>();
		cust.add(ValidateAllInputs("Tushar","Pawar","tushar.@pqr.com","Tushar@123",10000,"2001-02-08","PLATINUM",cust));
		cust.add(ValidateAllInputs("Ahad","Sheikh","ahad.@pqr.com","Ahad@123",1000,"2000-12-08","SILVER",cust));
		cust.add(ValidateAllInputs("Mohan","Talawar","mohan.@pqr.com","mohan@123",2000,"1999-05-05","GOLD",cust));
		cust.add(ValidateAllInputs("Pranay","Patil","pranay.@pqr.com","Pranay@123",10000,"1999-02-15","PLATINUM",cust));
		cust.add(ValidateAllInputs("Shubham","Apte","shubham.@pqr.com","Shubham@123",2000,"2000-01-15","GOLD",cust));
		cust.add(ValidateAllInputs("Niaz","Sheikh","niaz.@pqr.com","Niaz@123",5000,"1999-05-05","DIAMOND",cust));
		cust.add(ValidateAllInputs("Sakshi","Odhne","sakshi.@pqr.com","Sakshi@123",1000,"2000-01-15","SILVER",cust));
		cust.add(ValidateAllInputs("Akash","Mali","akash.@pqr.com","Akash@123",2000,"2001-08-25","GOLD",cust));
		cust.add(ValidateAllInputs("Shradha","Pawar","shradha.@pqr.com","Shradha@123",10000,"2000-09-28","PLATINUM",cust));
		cust.add(ValidateAllInputs("Harshal","Jadhav","harshal.@pqr.com","Harshal@123",5000,"2000-05-15","DIAMOND",cust));
		return cust;
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;
}
}

package utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import com.core.Customer;
import com.core.ServicePlan;

import Exception.CustomerValidationException;

public class CustomerValidationRules {
// no duplicate customer
// reg amount must match with the plan
// validate plan	
// customer's age must be > 21 : lab work
	
	public static Customer ValidateAllInputs(String firstName, String lastName, String email, String password, double regAmount,String dob, String plan,List<Customer> customer) throws CustomerValidationException {
		CheckDuplicateCust(email,customer);
		ServicePlan Plan=ValidatePlan(plan);
		ValidateAmount(regAmount,plan);
		LocalDate Dob=ValidateAge(dob);
		
		return new Customer(firstName,lastName,email,password,regAmount,Dob,Plan);
	}
	
	public static void CheckDuplicateCust(String e,List<Customer> customer) throws CustomerValidationException {
		Customer emailId=new Customer(e);//Constructor in Customer class will be called,wrap email in customer reference
			if(customer.contains(emailId))// as primary key no need to iterate so didn't use for each loop
				throw new CustomerValidationException("Matching email Id, choose new Email!!!!!!");
//		System.out.println("No Duplicate Email");
		
	}
	
	public static ServicePlan ValidatePlan(String p) {
		return ServicePlan.valueOf(p.toUpperCase());
	}
	
	public static void ValidateAmount(double cost, String p) throws CustomerValidationException {
		ServicePlan service=ServicePlan.valueOf(p.toUpperCase());
		if(cost != service.getCost())
			throw new CustomerValidationException("Cost is Invalid!!!!"); 
	}
	
	public static LocalDate ValidateAge(String date) throws CustomerValidationException {
//		System.out.println("Enter the Date of Birth");
		LocalDate d= LocalDate.parse(date);
		int age=Period.between(d,LocalDate.now()).getYears();
		if(age < 21)
			throw new CustomerValidationException("Age is less than 21, not a valid customer!!!!!!!");
		return d;
		
	}
	
	//add a static method customer's login
	public static Customer customerLogin(String email, String passwd, List<Customer> customer) throws CustomerValidationException {
		int index=customer.indexOf(new Customer(email));// as it is new instance so we take new Customer email
		if(index == -1)// if we don't get matched input so index will return -1
			throw new CustomerValidationException("Incorrect Email Id");
		Customer validCustomer=customer.get(index);//if we get the index element equal
		if(!validCustomer.getPassword().equals(passwd))//if in arraylist password is not equal to password then it will throw exception
			throw new CustomerValidationException("Invalid Password");
		return validCustomer;//if password is equal then it will return the arraylist element
	}
}

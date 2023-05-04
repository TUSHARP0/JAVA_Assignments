package tester;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.core.Customer;

import Exception.CustomerValidationException;

import static utils.CustomerValidationRules.*;

import static com.core.CustomerData.*;

public class CustomerTester {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			//create array list to hold customer data
			List<Customer> data = customer();
			boolean exit=false;
			
			while(!exit) {
				System.out.println("1. Sign-up  2. Sign-in  3. Change Password  4. Unsubcribe Customer  5. Display 6. Sort email in Ascending Order 7. Sort according registration amount 0. Exit");
				System.out.println("Choose Option");
				try {
					switch(sc.nextInt()) {
					
					case 1://customer registration
						System.out.println("FirstName, LastName, Email, Password, RegAmount, Dob, Plan");
					Customer validCustomer= ValidateAllInputs(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next(),data);
					data.add(validCustomer);
					System.out.println("Customer Registered...");
						break;
						
					case 2:// Sign-in
							System.out.println("Enter Email and Password ");
							validCustomer=customerLogin(sc.next(),sc.next(),data);
							System.out.println(validCustomer);
							break;
							
					case 3:// email, old password, new password----- inputs
						System.out.println("Enter Email, Old Password, New password");
						validCustomer=customerLogin(sc.next(),sc.next(),data);
						validCustomer.setPassword(sc.next());
						break;
						
					case 4://Unsubscribe Customer
						System.out.println("Enter email");
						String email=sc.next();
						int index=data.indexOf(new Customer(email));
						if(index == -1)
							throw new CustomerValidationException("Email not found");
						data.remove(data.get(index));

						break;
						
					case 5://Display Customer Details
						for(Customer c: data)
							System.out.println(c);
						break;
						
					case 6://Sorting array in descending order
						Collections.sort(data);
						break;
						
					case 7://sort according registration amount in descending order using anonymous inner class
						Collections.sort(data, new Comparator<Customer>() {
							public int compare(Customer c1, Customer c2) {
								if(c1.getRegAmount()<c2.getRegAmount())
									return 1;
								if(c1.getRegAmount()==c2.getRegAmount())
									return 0;
								return -1;
							}
						});
						break;
						
					case 8://sort according dob and amount
						Collections.sort(data, new Comparator<Customer>() {
						public int compare(Customer c1, Customer c2) {
							int relVal=c1.getDob().compareTo(c2.getDob());// if output is -1 then dob is before and if 1 then dob is after so there are no duplicate dates
									if(relVal==0) {
										if(c1.getRegAmount()<c2.getRegAmount())
											return -1;
										if(c1.getRegAmount()==c2.getRegAmount())
											return 0;
										return 1;
									}
							return relVal;
						}
						} );;
						break;
						
					case 0:exit = true;
						break;
					}
				}catch(Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}

	}

}

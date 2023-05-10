package com.app.core;

import java.util.HashMap;
import java.util.Map;

import CustomException.EmpValidationException;

import static Utils.ValidationRules.validateAllInputs;


public interface Data {
	
	static Map<String,Emp> populatedMap() throws EmpValidationException{
		Map<String,Emp> map= new HashMap<>();
		//String id, String firstName, String lastName, String dept, double sal, String joinDate, 
		//Map<String,Emp> map,,RND, HR, SALES, FINANCE, PRODUCTION
		map.putIfAbsent("A1",validateAllInputs("A1","Tushar","Pawar","HR",2500000,"2024-05-02",map));
		map.putIfAbsent("A2",validateAllInputs("A2","Mohan","Talawar","PRODUCTION",500000,"2025-05-22",map));
		map.putIfAbsent("A3",validateAllInputs("A3","Pranay","Patil","FINANCE",400000,"2023-08-02",map));
		map.putIfAbsent("A4",validateAllInputs("A4","Ahad","Sheikh","RND",50000,"2027-05-02",map));
		map.putIfAbsent("A5",validateAllInputs("A5","Somesh","Datatre","SALES",20000,"2024-02-28",map));
		map.putIfAbsent("A6",validateAllInputs("A6","Mohit","Bijwar","FINANCE",30000,"2025-05-12",map));
		map.putIfAbsent("A7",validateAllInputs("A7","Prajot","Pawar","PRODUCTION",50000,"2026-05-02",map));
		map.putIfAbsent("A8",validateAllInputs("A9","Shradha","Pawar","RND",100000,"2024-09-28",map));
		map.putIfAbsent("B1",validateAllInputs("B1","Preeti","Despande","SALES",200000,"2028-05-12",map));
		map.putIfAbsent("B2",validateAllInputs("B2","Arav","Pawar","RND",500000,"2027-08-28",map));
	return map;	
	}
}

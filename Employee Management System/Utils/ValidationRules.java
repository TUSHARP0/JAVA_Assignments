package Utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;

import com.app.core.Department;
import com.app.core.Emp;

import CustomException.EmpValidationException;

public interface ValidationRules {
	
	static Emp validateAllInputs(String id, String firstName, String lastName, String dept, double sal, String joinDate, Map<String,Emp> map) throws EmpValidationException {
		LocalDate date= validateDate(joinDate);
		Department d= validateDept(dept);
		checkForDuplicate(id,map);
		return new Emp(id,firstName,lastName,d,sal,date);
	}
	
	static LocalDate validateDate(String date) throws EmpValidationException {
		LocalDate joinDate= LocalDate.parse(date);
		int period= Period.between(joinDate, LocalDate.now()).getYears();
		if(period > 3)
			throw new EmpValidationException("Incorrect Joining Date!!!!!!!");
		return joinDate;
	}
	
	static Department validateDept(String department) {
		return Department.valueOf(department.toUpperCase());
	}
	
	//add a static method to validate if emp is dup or distinct
	static String checkForDuplicate(String empId, Map<String,Emp> map) throws EmpValidationException {
		if(map.containsKey(empId))
			throw new EmpValidationException("Same Id!!!!!!");
		return empId;
			
	}
	
}

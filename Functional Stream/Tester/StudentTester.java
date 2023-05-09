package Tester;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Scanner;

import com.app.core.Student;
import com.app.core.Subject;

import static utils.StudentCollectionUtils.*;

public class Test1 {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
		List<Student> list= populateList();
		//Display all student details from a student list
		list.forEach(i -> System.out.println(i));
		
		//Display all student details from a student map
		System.out.println();
		Map<String, Student> map= populateMap(list);
		map.forEach((k,v) -> System.out.println(k+ " "+v));
		System.out.println();
		
		//Display all student details(list) sorted as per GPA. Use custom ordering 
		list.stream().sorted((i1,i2) -> ((Double)i1.getGpa()).compareTo(i2.getGpa())).forEach(i -> System.out.println(i));
		
		// Write a tester to print average of  gpa of students for the specified subject
		System.out.println();
		System.out.println("Enter the Subject");
		Subject sub=Subject.valueOf(sc.next().toUpperCase());
		OptionalDouble Avg= map.values().stream().filter(i -> i.getSubject()==sub).mapToDouble(i -> i.getGpa()).average();
		System.out.println(Avg);
		
		//Print name of specified subject topper
		System.out.println();
		Optional<Student> topper= list.stream().filter(i -> i.getSubject()==sub).max((i1,i2) -> ((Double)i1.getGpa()).compareTo(i2.getGpa()));
		if(topper.isPresent())
		System.out.println(topper.get().getName()+" is a Class Topper ");
		else
			System.out.println("All Failed");
		
		//Print no of  failures for the specified subject chosen  from user. (gpa < 5 : failed case)
		System.out.println();
		long failCount=list.stream().filter(i -> i.getSubject()==sub).filter(i -> i.getGpa()<5).count();
		System.out.println(failCount);
		
		//Display student names of all the students , from a specified city.
		System.out.println();
		System.out.println("Enter City");
		String city = sc.next();
		list.stream().filter(i -> i.getAddress().getCity().equalsIgnoreCase(city)).forEach(i -> System.out.println(i.getName()));
		
		}
	}

}

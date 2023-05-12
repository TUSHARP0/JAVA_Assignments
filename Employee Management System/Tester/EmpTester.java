package Tester;

import java.util.Map;
import java.util.Scanner;
import static Utils.IOUtils.*;
import com.app.core.Department;
import com.app.core.Emp;
import static Utils.ValidationRules.*;
import static com.app.core.Data.*;
public class EmpTester {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter File Name");
			String filename=sc.next();
			Map<String,Emp> map=restoreFile(filename);
			System.out.println("Restored Map"+map);
			boolean exit=false;
			while(!exit) {
				System.out.println("1. Hire Employee  2. Display Employees  3. Promote  4. Delete  5. Sort Employee as per join Date  0. Exit and store the file");
				System.out.println("Enter choice");
				try {
				switch(sc.nextInt()){
				case 1:
					System.out.println("KeyId, id, FirstName, LastName, Department, Salary, Joining Date ");
					Emp validate=validateAllInputs(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),map);
					map.put(validate.getId(), validate);
					System.out.println("Employee Hired");
					break;
				
				case 2:
					map.values().stream().forEach(e -> System.out.println(e));
					break;
				
				case 3:
					System.out.println("Enter employee Id");
					String id= sc.next();
					Department d=validateDept(sc.next());
					if(map.containsKey(id)) {
						map.get(id).setDept(d);
					}
					break;
					
				case 4:
					System.out.println("Enter Employee Id");
					String eid=sc.next();
					if(map.containsKey(eid))
						map.remove(eid);
					break;
					
				case 5:
					map.values().stream().sorted((e1,e2) -> e1.getJoinDate().compareTo(e2.getJoinDate())).forEach(System.out::println);
					break;
					
				case 0:
					exit=true;
					storeFile(filename,map);
					break;
					
				}
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}

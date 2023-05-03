package Lists;

import java.util.ArrayList;
import java.util.Collections;

public class TestingArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();//created empty array list, and auto boxing is done 
		for(int i: list)
			System.out.println(i);// it won't iterate as ArrayList iterate over size and size=0, capacity=10 by default
			System.out.println(list);// it will show [] as output
		
		int[] data= {10,12,14,3,5,8,7,-5,99,155,84,2,4};
		
		for(int i: data) 
//			System.out.println(list.add(0,i));// insert, and it will reverse the list [4,2,84,155,99,-5,7,8,5,3,14,12,10]
		list.add(i);//append
		System.out.println(list);//[10,12,14,3,5,8,7,-5,99,155,84,2,4]
		
		list.add(0,99);// inserting 99 at 0th position
		System.out.println(list);//[99,10,12,14,3,5,8,7,-5,99,155,84,2,4]
		
		System.out.println("Searching -5 "+list.contains(-5));//true
		System.out.println("Removing "+list.remove(list.indexOf(-5)));
		System.out.println("Searching -5 "+list.contains(-5));//false
		
		//double the value of data > 50
		for(int i=0;i<list.size();i++)
			if(list.get(i) > 50)
				System.out.println("Replace "+list.set(i, list.get(i)*2));//99,99,155,84 is replaced
		System.out.println(list);//[198, 10, 12, 14, 3, 5, 8, 7, 198, 310, 168, 2, 4]
		
		Collections.sort(list);//sorts in ascending order
		System.out.println(list);
		
		
		
		
		
		

	}

}

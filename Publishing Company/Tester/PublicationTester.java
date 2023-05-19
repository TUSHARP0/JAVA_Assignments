package Tester;

import static Utils.BookValidationRules.ValidateAllInputs;
import static Utils.TapeValidationRules.ValidateAllTInputs;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.core.app.Book;
import com.core.app.Tape;

import Utils.IOUtils;

import static Utils.Data.*;

public class PublicationTester {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter File Name");
			String Filename = sc.next();
			Map<Integer,Book> book= IOUtils.restoreBook(Filename);
			Map<Integer,Tape> tape= new HashMap<>();
			
			boolean exit = false;
			
			while(!exit) {
				System.out.println("1. Publish New Book  2. Publish New Tape  3. List all book publication ordered by publish date in descending order  4. List top 5 publication of current year based on rating  5. Remove all publication which are 5 years old 6. Display 0. Exit");
			try {
				switch(sc.nextInt()) {
				case 1:
					System.out.println("Book Id, Book Name, Price, Publication Date, Rating, Pages");
					Book validate= ValidateAllInputs(sc.nextInt(),sc.next(),sc.nextDouble(),sc.next(),sc.nextInt(),sc.nextInt(),book);
					book.put(validate.getId(), validate);
					System.out.println("Book Inserted");
					
					break;
					
				case 2:
					System.out.println("Tape Id, Tape Name, Price, Publication Date, Rating, Min");
					Tape validate1= ValidateAllTInputs(sc.nextInt(),sc.next(),sc.nextDouble(),sc.next(),sc.nextInt(),sc.nextInt(),tape);
					tape.put(validate1.getId(), validate1);
					System.out.println("Tape Inserted");
					break;
					
				case 3:
					book.values().stream().sorted((a,b) -> a.getDate().compareTo(b.getDate())).forEach(System.out::println);
					tape.values().stream().sorted((a,b) -> a.getDate().compareTo(b.getDate())).forEach(System.out::println);
					
					break;
					
				case 4:
					List<Book> maximum=book.values().stream().sorted((a,b) -> ((Integer)b.getRating())
							.compareTo(a.getRating())).limit(5).collect(Collectors.toList());
					for(Book b : maximum)
					System.out.println(b);
					
					break;
					
				case 5:
					
					LocalDate d = LocalDate.now().minusYears(5);
					book.values().removeIf(d1 -> d1.getDate().isBefore(d));
					System.out.println("Book published before 5 years is removed");
					
					break;
					
				case 6:
//					for(Book b: book.values())
//						System.out.println(b);
					book.values().stream().forEach(System.out::println);
//					for(Tape t: tape.values())
//						System.out.println(t);
					break;
					
				case 0: exit= true;
//				System.out.println("Enter file name");
				IOUtils.storeBook(Filename, book);
				System.out.println("Exit");
					break;
				}
			}catch(Exception e) {
				e.printStackTrace();
				sc.nextLine();
			}
			}
			
		}catch(Exception e) {
			e.printStackTrace();	
		}

	}

}

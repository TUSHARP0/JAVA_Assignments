package Utils;

import java.time.LocalDate;
import java.util.Map;

import com.core.app.Book;

import CustomException.PublishCustomException;

public class BookValidationRules {

	public static Book ValidateAllInputs(int Id,String text, double price, String date, int rating, int pages,Map<Integer,Book> map) throws PublishCustomException {
		LocalDate d= parseAndValidateDate(date);
		validateTitle(text, map);
		return new Book(Id,text,price,d,rating,pages);
		
	}
	
	public static LocalDate parseAndValidateDate(String date) {
		return LocalDate.parse(date);
	}
	
	
	@SuppressWarnings("unlikely-arg-type")
	public static void validateTitle(String title,Map<Integer,Book> map) throws PublishCustomException {
		if(map.containsValue(title))
			throw new PublishCustomException("Book Already Exists With Same Book Name");
	}
}

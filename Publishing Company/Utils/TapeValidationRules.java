package Utils;

import java.time.LocalDate;
import java.util.Map;

import com.core.app.Tape;

import CustomException.PublishCustomException;

public class TapeValidationRules {

	public static Tape ValidateAllTInputs(int Id,String text, double price, String date, int rating, int min,Map<Integer,Tape> map) throws PublishCustomException {
		LocalDate d= parseAndValidateDate(date);
		validateTitle(text, map);
		return new Tape(Id,text,price,d,rating,min);
		
	}
	
	public static LocalDate parseAndValidateDate(String date) {
		return LocalDate.parse(date);
	}
	
	
	@SuppressWarnings("unlikely-arg-type")
	public static void validateTitle(String title,Map<Integer,Tape> map) throws PublishCustomException {
		if(map.containsValue(title))
			throw new PublishCustomException("Tape Already Exists With Same Book Name");
	}
}

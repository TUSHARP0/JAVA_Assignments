package Utils;

import java.util.HashMap;
import java.util.Map;
import static Utils.BookValidationRules.*;

import com.core.app.Book;

import CustomException.PublishCustomException;

public class Data {
public static Map<Integer,Book> populatedMap() throws PublishCustomException{
	Map<Integer,Book> book = new HashMap<>();
	//Book Id, Book Name, Price, Publication Date, Rating, Pages
	book.put(1, ValidateAllInputs(1, "Life", 500, "2020-01-01", 5, 200, book));
	book.put(2, ValidateAllInputs(2, "My Life", 800, "2021-01-01", 8, 200, book));
	book.put(3, ValidateAllInputs(3, "Your Life", 100, "2022-01-01", 10, 200, book));
	book.put(4, ValidateAllInputs(4, "Her Life", 200, "2019-01-01", 6, 200, book));
	book.put(5, ValidateAllInputs(5, "Her Bf Life", 300, "2020-01-01", 4, 200, book));
	return book;
}
}

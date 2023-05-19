package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.core.app.Book;
import com.core.app.Tape;

public interface IOUtils {
	
	static void storeBook(String filename, Map<Integer,Book> map) throws FileNotFoundException, IOException {
		try(ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream(filename))){
			out.writeObject(map);
		}
	}
		
	@SuppressWarnings("unchecked")
	static Map<Integer,Book> restoreBook(String filename) throws IOException, ClassNotFoundException{
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))){
			return (Map<Integer,Book>)in.readObject();
		}
	}
	
	static void storeTape(String filename, Map<Integer,Tape> map) throws FileNotFoundException, IOException {
		try(ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream(filename))){
			out.writeObject(map);
		}
	}
		
	@SuppressWarnings("unchecked")
	static Map<Integer,Tape> restoreTape(String filename) throws IOException, ClassNotFoundException{
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))){
			return (Map<Integer,Tape>)in.readObject();
		}
	}
	}
	


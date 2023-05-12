package Utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.app.core.Emp;

import CustomException.EmpValidationException;

public interface IOUtils {

	static void storeFile(String fileName, Map<String,Emp> map) throws IOException {
	try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))){
		out.writeObject(map);
	}
	}
	
	@SuppressWarnings("unchecked")
	static Map<String,Emp> restoreFile(String fileName){
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))){
			
			return (Map<String,Emp>)in.readObject();
		}
		catch(Exception e) {
			System.out.println(e);
			return new HashMap<>();
		}
	}
}

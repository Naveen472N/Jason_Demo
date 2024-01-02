package in.naveen;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertObjToJason {
	
	public static void main(String[] args) throws Exception {
		Employee emp = new Employee(101,"Ram",12000);
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("index.json"), emp);
		System.out.println("hello");
	}

}

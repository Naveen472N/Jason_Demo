package in.naveen;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertJsonToObj {
	
public static void main(String[] args) throws Exception {
	File f = new File("index.json");
	
	ObjectMapper mapper = new ObjectMapper();
	Employee employee = mapper.readValue(f, Employee.class);
	System.out.println(employee);

}	
	

}

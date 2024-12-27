import java.io.File;
import java.io.IOException;

import org.test.pojo.EmployeePojo;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File file=new File("C:\\Users\\new\\eclipse-workspace\\APITestingDay1\\src\\test\\resources\\Sample.json");
		
		ObjectMapper mapper=new ObjectMapper();
		
		EmployeePojo emp = mapper.readValue(file,EmployeePojo.class);
		
		String name = emp.getName();
		System.out.println(name);
		String emailId = emp.getEmailId();
		System.out.println(emailId);
		long phoneNo = emp.getPhoneNo();
		System.out.println(phoneNo);
		String course = emp.getCourse();
		System.out.println(course);
	}

}

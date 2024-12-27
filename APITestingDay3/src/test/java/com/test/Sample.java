package com.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.DataPojo;
import com.pojo.EmployeePojo;
import com.pojo.Support;

public class Sample {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		File file=new File("C:\\Users\\new\\eclipse-workspace\\APITestingDay3\\src\\test\\resources\\sampleFlight.json");
		
		ObjectMapper mapper=new ObjectMapper();
		mapper.setVisibility(PropertyAccessor.FIELD,Visibility.ANY);
		
		Support support=new Support( "https:\\omrbranch.com",  "For Joining Automation Course, Please Contact-Velmurugan 9944152058");
		ArrayList<DataPojo>data=new ArrayList<DataPojo>();
		DataPojo dataPojo=new DataPojo(3,"AirIndia","India","28", "https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		DataPojo dataPojo1=new DataPojo(33,"AirIndia","India","30", "https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		DataPojo dataPojo2=new DataPojo(49,"AirIndia","India","12", "https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		
		data.add(dataPojo);
		data.add(dataPojo1);
		data.add(dataPojo2);
		
		EmployeePojo employee=new EmployeePojo(1,10,10212,2332,data,support);
		
		mapper.writeValue(file, employee);
	}

}

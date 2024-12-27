package org.test.omrbranch;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.Datum;
import com.pojo.Root;
import com.pojo.Support;

public class Task1 {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		File file=new File("C:\\Users\\new\\eclipse-workspace\\APITestingDay2\\src\\test\\resources\\ListFlight.json");
		
		ObjectMapper mapper=new ObjectMapper();
		Root flight = mapper.readValue(file, Root.class);
		
		int page = flight.getPage();
		System.out.println(page);
		int per_page = flight.getPer_page();
		System.out.println(per_page);
		int total = flight.getTotal();
		System.out.println(total);
		int total_pages = flight.getTotal_pages();
		System.out.println(total_pages);
		
		ArrayList<Datum> data = flight.getData();
		for (Datum datum : data) {
			System.out.println(datum.getId());
			System.out.println(datum.getFlightName());
			System.out.println(datum.getCountry());
			System.out.println(datum.getDestinations());
			System.out.println(datum.getuRL());
		}
		Support support = flight.getSupport();
		String url = support.getUrl();
		System.out.println(url);
		String text = support.getText();
		System.out.println(text);
		
	}

}

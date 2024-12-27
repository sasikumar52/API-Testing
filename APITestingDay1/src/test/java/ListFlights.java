import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ListFlights {

	public static void main(String[] args) throws IOException, ParseException {
		
		FileReader fileReader=new FileReader("C:\\Users\\new\\eclipse-workspace\\APITestingDay1\\src\\test\\resources\\ListFlightInformation.json");
		JSONParser parser=new JSONParser();
		Object object = parser.parse(fileReader);
		JSONObject jsonObject=(JSONObject) object;
		
		Object page = jsonObject.get("page");
		System.out.println(page);
		Object perPage = jsonObject.get("per_page");
		System.out.println(perPage);
		Object total = jsonObject.get("total");
		System.out.println(total);
		Object totalPages = jsonObject.get("total_pages");
		System.out.println(totalPages);
		
		Object dataObject = jsonObject.get("data");
		JSONArray array=(JSONArray) dataObject;
		for (int i = 0; i < array.size(); i++) {
			
			Object object2 = array.get(i);
			JSONObject jsonObject2=(JSONObject) object2;
			
			Object id = jsonObject2.get("id");
			System.out.println(id);
			Object flightName = jsonObject2.get("flightName");
			System.out.println(flightName);
			Object country = jsonObject2.get("Country");
			System.out.println(country);
			Object destination = jsonObject2.get("Destinations");
			System.out.println(destination);
			Object url = jsonObject2.get("URL");
			System.out.println(url);
		}
		Object support = jsonObject.get("support");
		JSONObject jsonObject3=(JSONObject) support;
		Object url = jsonObject3.get("url");
		System.out.println(url);
		Object text = jsonObject3.get("text");
		System.out.println(text);
		
	}
}

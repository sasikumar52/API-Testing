import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SingleFlight {

	public static void main(String[] args) throws IOException, ParseException {
		//1.Mention the path of json file
		FileReader fileReader=new FileReader("C:\\Users\\new\\eclipse-workspace\\APITestingDay1\\src\\test\\resources\\SingleFlightInformation.json");
		
		//2.Create the object for JSON Parser
		JSONParser jsonParser=new JSONParser();
		
		//3.Pass the json file to fetch the values
		Object parseFile = jsonParser.parse(fileReader);
		
		//4.Convert into JSON Object
		JSONObject jsonObject=(JSONObject) parseFile;
		Object data = jsonObject.get("data");
		
		JSONObject jsonObject2=(JSONObject) data;
		Object id = jsonObject2.get("id");
		System.out.println("id:"+id);
		Object flightName = jsonObject2.get("flightName");
		System.out.println("FlightName:"+flightName);
		Object country = jsonObject2.get("Country");
		System.out.println("Country:"+country);
		Object destination = jsonObject2.get("Destinations");
		System.out.println("Destionations:"+destination);
		Object url = jsonObject2.get("URL");
		System.out.println("URL:"+url);
		Object createdDate = jsonObject2.get("Created_Date");
		System.out.println("Created Date:"+createdDate);
		Object updatedDate = jsonObject2.get("Updated_Date");
		System.out.println("Updated Date:"+updatedDate);
	
		Object support = jsonObject.get("support");
		JSONObject jsonObject3=(JSONObject) support;
		
		Object supportURl = jsonObject3.get("url");
		System.out.println("SupportURL:"+supportURl);
		Object text = jsonObject3.get("text");
		System.out.println("Text:"+text);
		
		
		
		
		
	}
}

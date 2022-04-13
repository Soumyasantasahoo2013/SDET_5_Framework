package com.DDT;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

public class ReadingDataFromJSONTest {
	
	@Test
	public void readingDataFromJSONTest() throws Throwable
	{
		//Step-1 Converting JSON File into JSON Object
		FileReader fr=new FileReader("./requestBodyData.json");
		
		//Step-2 Convert JSON Object into Java Object
		JSONParser jp=new JSONParser();
		Object jobj = jp.parse(fr);
		
		//Step-3 Read the data
		HashMap hm = (HashMap)jobj;
		String value = (String) hm.get("status");
		System.out.println(value);
	}

}

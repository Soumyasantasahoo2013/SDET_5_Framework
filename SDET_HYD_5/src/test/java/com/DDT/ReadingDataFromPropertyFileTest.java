package com.DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadingDataFromPropertyFileTest {
	
	@Test
	public void readingDataFromPropertyFileTest() throws Throwable
	{
		//Step=1 Convert the physical file into Java Object
		FileInputStream fis=new FileInputStream("./commonData.properties");
		
		//Step=2 Create object for Properties class & load the file
		Properties p=new Properties();
		p.load(fis);
		
		//Step=3 Read the common Data
		String url=p.getProperty("URL");
		String username=p.getProperty("UN");
		String password=p.getProperty("PWD");
		
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}

}

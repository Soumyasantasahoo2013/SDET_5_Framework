package com.DDT;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class ReadingDataFromXMLTest {
	
	@Test
	public void readingDataFromXMLTest(XmlTest xml)
	{
		String url = xml.getParameter("URL");
		String un = xml.getParameter("UN");
		String password = xml.getParameter("PWD");
		
		System.out.println(url);
		System.out.println(un);
		System.out.println(password);
	}

}

package dataProvider.com;

import java.io.File;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ConfigProperty {
	
	
	
	public static String getProperties(String key) 
	{
		
		String value=null;
	Properties prop=new Properties();
	
	try {
		prop.load(new FileInputStream(new File("./ConfigFolder/PropertyFile")));
	     value=prop.getProperty(key);

	} 
	
	catch (FileNotFoundException e) {

		System.out.println("Log Info: File not found"+e.getMessage());
	} 
	catch (IOException e) {

		System.out.println("Log Info: Something went wrong"+e.getMessage());
	}
	
	return value;
}
}
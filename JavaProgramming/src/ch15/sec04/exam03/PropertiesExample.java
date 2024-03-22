package ch15.sec04.exam03;

import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		try {
			prop.load(PropertiesExample.class.getResourceAsStream("database.properties"));
			// getResourceAsStream 객체 = inputStream
		} catch (IOException e) {

		}
		String userName = prop.getProperty("username");
		String password = prop.getProperty("password");
		System.out.println("userName:" + userName);
		System.out.println("password:" + password);
	}

}

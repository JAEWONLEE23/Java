package ch11.sec05;

import java.io.*;

public class ThrowsExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void method() throws IOException, FileNotFoundException {

		FileInputStream fis = null;

		fis = new FileInputStream("C;/Temp/a.txt");

		fis.read();// IOException 발생

		fis.close();// IOException 발생

	}
}

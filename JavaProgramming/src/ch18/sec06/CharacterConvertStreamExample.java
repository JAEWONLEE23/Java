package ch18.sec06;

import java.io.*;

public class CharacterConvertStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			write("문자 변환 스트림을 사용합니다.");
			String data = read();
			System.out.println(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void write(String str) throws Exception {
		OutputStream os = new FileOutputStream("C:/temp/test.txt");// 바이트가 문자열로 바뀌는것.(txt는 문자를 의미한다)
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		writer.write(str);
		writer.flush();
		writer.close();
	}

	public static String read() throws Exception {

		InputStream is = new FileInputStream("C:/temp/test.txt");// 바이트가 문자열로 바꿔서 텍스트로 저장
		Reader reader = new InputStreamReader(is, "UTF-8");

		char[] data = new char[100];
		int num = reader.read(data);
		reader.close();

		String str = new String(data, 0, num);
		return str;
	}

}

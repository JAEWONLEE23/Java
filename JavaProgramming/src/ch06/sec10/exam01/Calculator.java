package ch06.sec10.exam01;

public class Calculator {
	
	static double pi =3.14159;
	
	static int minus(int x, int y) {//메소드에 인스턴스 맴버들을 사용하는 코드가 없는 거라면 static으로 선언해야된다.
		return x -y;
		
		}
	static int plus(int x , int y) {
		return x+y;
	}
}

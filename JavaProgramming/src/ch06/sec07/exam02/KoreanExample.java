package ch06.sec07.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean K1 = new Korean("박자바", "123123-1234567" );
		System.out.println(K1.name);
		System.out.println(K1.ssn);
		System.out.println();
		
		Korean K2 = new Korean("김자바", "1234868-6548213");
		System.out.println(K2.name);
		System.out.println(K2.ssn);
	}

}

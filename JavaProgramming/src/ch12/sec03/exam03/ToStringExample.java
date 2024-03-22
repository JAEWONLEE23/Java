package ch12.sec03.exam03;

public class ToStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone myPhone = new SmartPhone("삼성전자", "안드로이드");

		String strObj = myPhone.toString();
		
		System.out.println(strObj);

		System.out.println(myPhone);//toString 생략됨
		
		String info = "나의 폰은 :" + myPhone; // 문자열 + 객체 = 자동으로  toString 호출됨 리턴값을 가지고 결합이 가능.
		System.out.println(info);
		
		Integer obj = 100;
		int result = obj +3; // obj 산수연산
		String str = obj + "3"; 
		System.out.println(str);
		System.out.println(result);
	}
  
}

package ch07.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// MobilePhone mp = new MobilePhone("홍길동");// abstract를 붙이게 되면new로 객체생성 불가

		MobilePhone mp; // 선언만해줌

		mp = new AndroidPhone("홍길동"); // 오로지 상속으로만 물려받을수 있다.
		mp.turnOff();
		mp.turnOn();
		mp.internetSearch(); // AndroidPhone 재정의가 됨

		mp = new IPhone("김자바");
		mp.turnOn();
		mp.turnOff();
		mp.internetSearch(); // IPhone 재정의가 됨
	}

}

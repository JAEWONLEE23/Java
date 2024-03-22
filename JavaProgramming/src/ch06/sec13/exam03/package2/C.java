package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.A;

public class C {
	// 필드선언
	A a = new A();

	// 생성자 선언
	public C() {
		a.field1 = 1;
		// a.field2 = 1; x
		// a.field3 = 1; x

		a.method1();
		// a.method2(); x
		// a.method3(); x
	}
	// 메소드 선언
}

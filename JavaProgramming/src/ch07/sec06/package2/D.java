package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A {
	// field
	// constructor
	// method
	public void method() { //상속을 받아서 물려받을 수있다 페케이지라면 자식이라면 상속하게 되면 전혀 문제가 없다.
		field = "Data";
		method();
	}

}

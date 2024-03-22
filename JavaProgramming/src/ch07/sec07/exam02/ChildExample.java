package ch07.sec07.exam02;

public class ChildExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();

		Parent parent = child;
		parent.method1();
		parent.method2(); // 재정의 한것이 실행
		// parent.method3(); parent라는 메소드상에 선언되어있지 않기 때문에

		if (child == parent) {
			System.out.println("같은 객체를 참조");

		} else {
			System.out.println("다른 객체를 잠초");
		}
	}

}

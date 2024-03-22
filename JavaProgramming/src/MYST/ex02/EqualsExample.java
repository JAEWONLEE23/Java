package MYST.ex02;

public class EqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");

		if (obj1.eqauls(obj2)) {
			System.out.println("색깔이 똑같습니다.");
		} else {
			System.out.println("색깔이 다릅니다.");
		}
		if (obj1.eqauls(obj3)) {
			System.out.println("색깔이 똑같습니다.");
		} else {
			System.out.println("색깔이 다릅니다.");
		}
	}

}

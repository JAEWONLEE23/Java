package practice.p13.exam03;

public class ContainerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container<String, String> contaniner1 = new Container<String, String>();
		contaniner1.set("홍길동", "도적");
		String name1 = contaniner1.getkey();
		String job = contaniner1.getValue();

		Container<String, Integer> contaniner2 = new Container<String, Integer>();
		contaniner2.set("홍길동", 35);
		String name2 = contaniner2.getkey();
		int age = contaniner2.getValue();
		

	}

}

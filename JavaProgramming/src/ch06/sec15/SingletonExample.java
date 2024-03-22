package ch06.sec15;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Singleton st = new Singleton();
		
		Singleton st1= Singleton.getInstance();
		Singleton st2 = Singleton.getInstance();
		
		if(st1 == st2) {
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
		}
	}

}

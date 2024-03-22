package ch07.sec09;

public class Student  extends Person{ // extends 는 사람을 상속하기 때문에
	
	public int studentNo; //학생 수이기 때문에 int
	
	public Student(String name, int studentNo ) {
		super(name);
		this.studentNo = studentNo;
	}
	public void study() {
		System.out.println("공부를 합니다.");
	}

}

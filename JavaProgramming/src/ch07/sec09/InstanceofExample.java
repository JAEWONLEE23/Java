 package ch07.sec09;

public class InstanceofExample {
	public static void personInfo(Person person) {
		System.out.println("name:" + person.name);
		person.walk();
	
	if(person instanceof Student student) {
		System.out.println("studentNo:" + student.studentNo);
		student.study();
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("홍길동");
		personInfo(p1);
		System.out.println();
		/*personInfo(new Person("lee"));
		
		System.out.println();
		personInfo(new Student("kim", 10));*/
		Person p2 = new Student("김길동" , 10);
		personInfo(p2);
	}

}

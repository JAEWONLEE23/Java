package practice.go;

/*import ch07.sec09.Person;
import ch07.sec09.Student
*/
public class InstanceofExample {
	public static void personInfo(Person person) {
		System.out.println("name:" + person.name);
		person.walk();

		if (person instanceof Student student) {
			System.out.println("studentNo:" + student.studentNo);
			student.study();
		}
	}

	public static void main(String[] args) {
		personInfo(new Person("홍길동"));
		System.out.println();

		personInfo(new Student("김길동", 10));
	}
}

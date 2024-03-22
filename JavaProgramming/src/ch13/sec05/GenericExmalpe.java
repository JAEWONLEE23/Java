package ch13.sec05;

public class GenericExmalpe {

	public static void main(String[] args) {

		Course.regiserCourse1(new Applicant<Person>(new Person()));// <Person> T를 대체하는 타입
		Course.regiserCourse1(new Applicant<Worker>(new Worker()));
		Course.regiserCourse1(new Applicant<Student>(new Student()));
		Course.regiserCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.regiserCourse1(new Applicant<MiddleStudnet>(new MiddleStudnet()));
		System.out.println();

		Course.regiserCourse2(new Applicant<Student>(new Student()));
		Course.regiserCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.regiserCourse2(new Applicant<MiddleStudnet>(new MiddleStudnet()));
		System.out.println();

		Course.regiserCourse3(new Applicant<Person>(new Person()));
		Course.regiserCourse3(new Applicant<Worker>(new Worker()));
	}

}

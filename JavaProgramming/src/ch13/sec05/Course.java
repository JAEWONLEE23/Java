package ch13.sec05;

public class Course {

	public static void regiserCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course1을 등록함");

	}

	public static void regiserCourse2(Applicant<? extends Student> applicant) {//자식객체
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course2을 등록함");

	}

	public static void regiserCourse3(Applicant<? super Worker> applicant) {//부모 객체
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course3을 등록함");

	}

}

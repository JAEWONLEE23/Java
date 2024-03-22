package MYST.ex01;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
		
	}
	public String getStudentNum() {
		return studentNum;
		
	}
	public int hashCode() {
		int hashCode = studentNum.hashCode();
		return hashCode;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Student target) {
			if(studentNum.equals(target.studentNum)) {
				return true;
			}
		}
		return false;
	}
}

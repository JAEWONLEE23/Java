package practice.sec01;

public class P164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String borad = " 1, 자바 학습, 참조 타입 String을 학습합니다, 이재원";

		String[] tokens = borad.split(",");

		System.out.println("번호:" + tokens[0]);
		System.out.println("제목:" + tokens[1]);
		System.out.println("내용:" + tokens[2]);
		System.out.println("성명:" + tokens[3]);
		System.out.println();

		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
	}

}

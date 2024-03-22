package ch02.sec11;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		int v2 = 0;   //값이 존재하지않으면 if문을 실행할수 없기 때문에 초기값을 지정해준다.
		
		
		
		if(v1>10) {
			 v2 = v1 -10;
		}
		
		int v3 = v1 + v2 + 5;
	}

}

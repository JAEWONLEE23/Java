package ch05.sec11;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length !=2) {
			System.out.println("프로그램 입력값이 부족");
			System.exit(0);
		}
		
		String strNum1= args[0];
		String strNum2= args[1];
		System.out.println(strNum1);
		System.out.println(strNum2);
		
		int Num1=Integer.parseInt(strNum1);
		int Num2=Integer.parseInt(strNum2);
		
		int result = Num1 + Num2;
		System.out.println(Num1 + " + " + Num2 + " = " +result);
		
	}

}

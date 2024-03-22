package practice.G11.QS;

public class SSS {

	public static void main(String[] args) {
		String[] strArray = { "10", "2a" };
		int value = 0;
		for (int i = 0; i <= 2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과됨:" );

			} catch (NumberFormatException e) {
				System.out.println("실행에 문제가 있습니다.");
			} finally {
				System.out.println(value);
			}
		}
	}
}
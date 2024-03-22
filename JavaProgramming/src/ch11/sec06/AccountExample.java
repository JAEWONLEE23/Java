package ch11.sec06;

public class AccountExample {

	public static void main(String[] args) {

		Account account = new Account();

		account.deposit(10000);

		try {
			account.withdraw(30000);
		} catch (InSufficientException e) {
			System.out.println(e.getMessage());

		}

		System.out.println("잔고:" + account.getbalance());

	}

}

package ch06.sec15;

public class Account {
	private  int balance;
	private static Account instance = new Account();
	
	private Account() {}
	
	public void input(int amount) {
		balance += amount;

	}

	public void output(int amount) {
		balance -=amount;
	}
		public static Account getInstance() {
			return instance;
		}

		public int getBalance() {
			return balance;
		}
	}



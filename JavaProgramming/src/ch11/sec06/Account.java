package ch11.sec06;

public class Account {
	private long balance;

	public long getbalance() {
		return balance;
	}

	public void deposit(int amount) {
		balance += amount;
	}

	public void withdraw(int amount) throws InSufficientException {
		if (balance < amount) {
			throw new InSufficientException("잔고 부족:" + (amount - balance) + "모자람");
		}
		balance -= amount;
	}
}

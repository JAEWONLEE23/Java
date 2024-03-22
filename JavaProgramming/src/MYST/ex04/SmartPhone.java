package MYST.ex04;

public class SmartPhone {
	private String company;
	private String ds;

	public SmartPhone(String company, String ds) {
		this.company = company;
		this.ds = ds;

	}

	public String toString() {
		return company + "," + ds;
	}
}

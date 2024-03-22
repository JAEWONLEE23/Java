package MYST.ex02;

public class Member {

	public String id;

	public Member(String id) {
		this.id = id;
	}

	public boolean eqauls(Object obj) {
		if (obj instanceof Member traget) {
			if (id.equals(traget.id)) {
				return true;
			}
		}
		return false;
	}

}

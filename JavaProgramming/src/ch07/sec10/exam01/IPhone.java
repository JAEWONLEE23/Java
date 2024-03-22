package ch07.sec10.exam01;

public class IPhone extends MobilePhone {
	public String owner;

	public IPhone(String owner) {
		super(owner);
	}

	@Override // 부모가 추상 클래스 이고 공통된 메소드 중에서 abstract이 붙어있는경우
	// 자식 클래스는 추상 메소드를 반드시 재정의를 해주어야 된다.
	public void internetSearch() {
		System.out.println("사파리 브라우저로 인터넷을 검색합니다."); //자식 개채가 반드시 작성해야되는 이유가 생김.
	}
}

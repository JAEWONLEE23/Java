package ch14.sec06.exam02;

public class WorkObject {
	public synchronized void methodA() {
		Thread thread = Thread.currentThread(); // 현재 메소드를 사용할 객체
		System.out.println(thread.getName() + ": methodA 작업실행");
		// 상대방을 깨운다.(실행 대기 상태로 만듬)
		notify();
		// 자기자신은 일시정지
		try {
			wait();
		} catch (InterruptedException e) {
			// notify , wait 항상 synchronized에서만 사용가능
		}
	}

	public synchronized void methodB() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodB 작업실행");
		try {
			wait();
		} catch (InterruptedException e) {

		}
	}
}

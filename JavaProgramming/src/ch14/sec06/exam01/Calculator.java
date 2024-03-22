package ch14.sec06.exam01;

public class Calculator {
	// field
	private int memory; // 임시저장장소

	// constructor
	public int getMemory() {
		return memory;
	}

	// method
	public synchronized void setMemory1(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}

	public synchronized void setMemory2(int memory) {
		//~~~~(멀티 스레드가 실행가능)
		synchronized (this) {
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		}
		//~~~(멀티 스레드가 실행가능)
	}
	
}

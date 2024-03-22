package ch08.sec06;

public interface RemoteControl {
	//상수 선언
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	//추상 메소드 선언
	void turnOn();

	void turnOff();

	void setVolume(int volume);
	//디폴트 메소드 선언
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음 해제합니다."); 
		}
	}
	//정적 메소드 선언
	static void changeBattery() {
		System.out.println("리모콘 건전기를 교체합니다.");
	}
}

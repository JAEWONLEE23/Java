package ch07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone myphone = new SmartPhone(" 겔럭시", "은색");

		System.out.println(myphone.color);
		System.out.println(myphone.model);
		System.out.println(myphone.wifi);

		myphone.bell();
		myphone.sendVoice("여보세여");
		myphone.receiveVoice("안녕하세여");
		myphone.sendVoice("반가워여");

		myphone.hangup();

		myphone.setWifi(true);
		myphone.internet();

	}

}

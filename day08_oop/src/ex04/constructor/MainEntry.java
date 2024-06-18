package ex04.constructor;

public class MainEntry {
	public static void main(String[] args) {
		TV tv = new TV(7); //매개변수 1개 생성자함수
		tv.show();
		
		TV tv2 = new TV(15, "red"); //매개변수 2개 생성자함수
		tv2.show();
		
		TV tv3 = new TV("orange"); //매개변수 1개 생성자함수
		tv3.show();
		
		TV tv4 = new TV(); //default 생성자함수
		tv4.setColor("green");
		tv4.setChannel(15);
		tv4.show();
		
	}
}

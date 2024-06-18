package ex04.constructor;

//문제] class TV {
//	color, channel;
//	getter / setter method
//	output method

public class TV {
	private int channel; //멤버변수
	private String color; //멤버변수
	
	//constructor method(생성자 함수)
	public TV(int ch) { //void 조차 쓰지 않아도됨. 써도 문제는 없으나 노란줄 지글지글
		channel = ch;
		color = "yellow";
	}
	
	public TV(int ch, String col) {
		channel = ch;
		color = col;
	}
	
	public TV(String c) {
		color = c;
		channel = 33;
	}
	
	public TV() {
	}
	
	//getter / setter method
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void show() {
		System.out.println(getChannel() + ", " + getColor());
//		System.out.println(channel + ", " + color);
	}
	
}


//> Constructor(생성자) 함수 
//– 클래스명과 동일하다. (유일하게 메서드가 대문자로 시작)
//– 리턴타입 없음(void 조차 사용하지 않음)
//– 중복정의가 가능하다(overload 가능 - 중복함수)
//– default constructor를 가지고 있음(클래스를 만들면 자동으로 만들어짐)
//  (단, 사용자가 생성자함수 재정의를 하면 default constructor 기능 상실)




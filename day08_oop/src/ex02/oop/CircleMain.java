package ex02.oop;


class Circle {
	private int x, y, r; //멤버변수
	
	public int getR() {
		return r;
	}
	public void setR(int rr) {
		r = rr;
	}
	
	public void disp() {
		System.out.println(x + ", " + y + ", " + r);
	}
	
} //Circle class end


public class CircleMain {
	public static void main(String[] args) {
		Circle c = new Circle(); //객체 생성, 메모리에 할당, 생성자함수 자동호출
		
		//public > protected(상속 관계면, 다른 패키지 일지라도 접근 가능 > default(같은 패키지는 접근 가능 / c.x, c.y 해당) > private(클래스 내부에서만 사용 가능)
//		c.x = 100;
//		c.y = 50;
		
		c.setR(5);
		System.out.println(c.getR());
		c.disp();
	}
}

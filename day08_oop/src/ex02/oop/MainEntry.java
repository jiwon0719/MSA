package ex02.oop;

class Point {
	int x, y; //멤버변수
	
	//멤버함수: 클래스 안에서 할 수 있는 행위들을 모두 정의해두고 main은 호출만 하면 깔끔
	void setXY(int xx, int yy) {
		x =xx;
		y = yy;
	}
	
	int getX() { 
		return x;
	}
	void setX(int xx) {
		x = xx;
	}
	
	int getY() {
		return y;
	}
	void setY(int yy) {
		y = yy;
	}
	
	public void disp() {
		System.out.println(x + ", " + y);
	}
	
} //end Point class

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point(); //객체 생성, 메모리에 할당, 생성자함수 자동호출
		pt.setX(5);
		pt.setY(3);
		pt.setXY(10, 20);
		pt.setXY(10, 5); //분리하는게 유지보수 차원에서 좋다. 멤버변수 하나당 멤버함수 하나씩 두기. 
		
		pt.disp();
		
//		System.out.println(pt.getX() + ", " + pt.getY());
	}
}

package ex01.This;

class Point{ //부모는 Object
	private int x, y;

	public Point(int x) { //변수를 선언되어있는 가장 가까운 변수로 인식한다. 
		this(x,3); //반드시 첫줄에 있어야 함.
		System.out.println("매개변수 1개 생성자함수!!");
	}

	public Point() {
		this(999,888);
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	//output method
	public void disp() {
		System.out.println("(" + x + ", " + y + ")");
	}
} //end point class


public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point(); //700번지  / 객체생성, 메모리에 할당, 생성자함수 자동호출
		pt.disp(); 
		Point pt2 = new Point(33); //800번지
		pt2.disp(); 
		Point pt3 = new Point(1,2); //900번지
		pt3.disp();
		
	}
}

package ex03.inheritance;

class Point {
	int x, y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		System.out.println("Point 클래스 매개변수 2개");
	}
	
	public Point() {
		x = y = 5;
//		this(5, 5);
		System.out.println("Point 클래스 디폴트 생성자함수");
	}
	
	public Point(int x) {
		super();
		this.x = x;
		System.out.println("Point 클래스 매개변수 1개");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void disp() {
		System.out.print(x + ", " + y);	
	}
	
} //end Point class

class Circle extends Point {
	int r;
	
	public Circle(int x, int y, int r) {
		super(x, y); //부모의 생성자 함수 
		this.r = r;
		System.out.println("Circle 클래스 매개변수 3개");
	}
	
	public Circle(int x, int r) {
		super(x);
		this.r = r;
	}

	public Circle(int r) {
		super();
		this.r = r;
	}
	
	public Circle() {
		super();
	}

	public void disp() {
		super.disp();
		System.out.println(", " + r);
	}
	
} //end Cirlce class



public class MainEntry {
	public static void main(String[] args) {
		
		Circle c = new Circle(1,2,3);
		c.disp();
		
//		Point pt = new Point();
//		pt.disp();
//		
//		Point pt2 = new Point(10, 20);
//		pt2.disp();
	}
}

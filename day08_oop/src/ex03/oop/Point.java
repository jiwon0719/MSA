package ex03.oop;

public class Point {
	private int x, y; // 멤버변수, 초기화 0

	// getter / setter Method (자동화: alt + shift + s)
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
		System.out.println("x= " + x + ", y= " + y);
	}


}

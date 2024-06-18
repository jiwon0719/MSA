package ex05.constructor;

public class PointClass {
	private int x, y;
	
	//constructor method(3가지)
	public PointClass(int xx) {
		x = xx;
	}
	
	public PointClass(int xx, int yy) {
		x = xx;
		y = yy;
	}
	
	public PointClass() {
	}
	
	//setter, getter method
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
	
	
	//output method
	public void output() {
		System.out.println("(" + x + ", " + y + ")");
	}
	
	
	
}

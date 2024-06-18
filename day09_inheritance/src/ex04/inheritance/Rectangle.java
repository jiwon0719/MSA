package ex04.inheritance;

public class Rectangle extends Point {
	private int x2, y2;
	
	public void disp() {
		super.disp();
		System.out.print(x2 + ", " + y2);	
	}
	
}

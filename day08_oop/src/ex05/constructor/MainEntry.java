package ex05.constructor;

public class MainEntry {
	public static void main(String[] args) {
		PointClass point = new PointClass(1);
		point.output();
		
		PointClass point2 = new PointClass(1, 2);
		point2.output();
		
		PointClass point3 = new PointClass();
		point3.setX(3);
		point3.setY(5);
		point3.output();
	}
}

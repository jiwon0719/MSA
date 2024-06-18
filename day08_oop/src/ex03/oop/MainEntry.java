package ex03.oop;

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point(); //객체 생성, 메모리에 할당, 생성자함수 자동 호출
		pt.disp();
		
		pt.setX(100);
		pt.setY(30);
		pt.disp();
		
		// rectangle class object & print
		
		Rectangle rec = new Rectangle(); //객체 생성, 메모리에 할당, 생성자함수 자동호출
		rec.setX(1);
		rec.setX2(2);
		rec.setY(3);
		rec.setY2(4);

		rec.disp();
	}
}

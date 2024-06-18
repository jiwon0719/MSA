package ex01.method;

public class MainEntry {
	
	//1) 매개변수 없고 / 리턴타입 없는 경우
	public static void hello() { //함수 정의부(구현부)
		System.out.println("hello~");
	}
	
	//2) 매개변수 있고 / 리턴타입 없는 경우
	public static void plus(int x, int y) {
		System.out.println("hap = " + (x + y));
		
		int sum = x + y;
		System.out.println("sum = " + sum);
		
		System.out.println(x + "+" +  y + "=" + (x+y));
	}
	
	public static void main(String[] args) { //시작점, 진입점
		hello(); //함수 호출
		line();
		hello(); //함수 호출
		line();
		info();
		line();
		plus(3, 5);
	}
	
	
	//----- 출력하는 line(); 만들기
	public static void line() {
		System.out.println("-------");
	}
	
	// 개인정보 info(); 만들기
	public static void info() {
		System.out.println("도연");
		System.out.println("010-0000-0000");
		System.out.println("대전");
	}
	
	
	
}


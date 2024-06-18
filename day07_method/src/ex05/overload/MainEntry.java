package ex05.overload;

public class MainEntry {

	public static void line() {
		System.out.println("-------------------------");
	}

	public static void line(String str) {
		System.out.println(str);
	}

	public static void line(double str) {
		System.out.println(str);
	}

	public static void line(int n, String str) {
		for (int i = 1; i < n; i++) {
			System.out.print(str);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		line(15, "&");
		line(12.34);
		line("&");
		line();
		System.out.println("=========================");
//		for(int i = 1; i < 6;i++) {
//			line();
//		}
		
		line(3, 5, "*");
		line(13, 5, "*");
		
		line();
		System.out.println("이 밑에 것으로 확인....");
		plus(12.34);
		plus(20);
		
		plus("hello ");
		plus(1, 2);
		
	} //end main

	public static void plus(double x) {
		System.out.println(x + 100);
	}

	public static void plus(int x) {
		System.out.println(x + 100);
	}
	
	public static void plus(int x, int y) {
		System.out.println(x + y);
	}
	
	public static void plus(String x) {
		System.out.println(x + 100);
	}

	public static void line(int n, int y, String str) {
		
		if( n > y ) {
			int temp = n;
			n = y;
			y = temp;
		}
		
		for(int i = n; i < y; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
	
}

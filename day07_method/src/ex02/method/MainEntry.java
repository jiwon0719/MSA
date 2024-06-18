package ex02.method;

import java.util.Scanner;

public class MainEntry {
	//3) 매개변수 없고/ 리턴타입 있는 경우
	public static int num() {
		return 100;
	}
	
	//max() 큰 수 리턴하는 함수
	public static int max() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int max = (x > y)? x : y;
		
		return max;
	}
	
	//abs() 해당 숫자의 절대값 구하는 함수
	public static int abs() {
		Scanner sc = new Scanner(System.in);
		System.out.print("su = ");
		int x = sc.nextInt();
		int abs = (x > 0)? x : -x;
		
		return abs;
	}
	
	
	//4) 매개변수 있고 / 리턴타입 있는 경우
	public static String name(int a, String name) {
		System.out.println("a = " + a);
		return name + "안녕하세요!";
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println(num());
		int result = num();
		String str = name(30, sc.next());
		
		System.out.println(result);
		System.out.println(max());
		System.out.println(abs());
		System.out.println();
	} //end main 
}

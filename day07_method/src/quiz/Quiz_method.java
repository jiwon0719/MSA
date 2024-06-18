package quiz;

import java.util.Scanner;

public class Quiz_method {
	// 문제] plus(+), div(/)함수는 리턴타입 X ~ sub(-), mul(*)함수는 리턴타입 O 형태로 구현
	// 예외처리까지 해주세요. 
	public static void plus() {
		Scanner sc = new Scanner(System.in);
		System.out.print("plus num1 : ");
		int x = sc.nextInt();
		System.out.print("plus num2 : ");
		int y = sc.nextInt();
		System.out.println("plus : " + (x + y));
	}
	
	public static void div() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("div num1 : ");
			int x = sc.nextInt();
			System.out.print("div num2 : ");
			int y = sc.nextInt();
			System.out.println("div : " + (x / y));		
		} catch(Exception e) {
			System.out.println("error");
		}
	}
	
	public static int mul(int x, int y) {
		return x * y;
	}
	
	public static int sub(int x, int y) {
		return x - y;
	}
	
	
	
	public static void main(String[] args) {
		plus();
		div();
		System.out.println("mul = " + mul(3,5));
		System.out.println("sub = " + sub(5,3));
		
	}
}

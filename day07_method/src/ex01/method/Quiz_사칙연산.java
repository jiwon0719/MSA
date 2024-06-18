package ex01.method;

import java.util.Scanner;

public class Quiz_사칙연산 {
	// add(+), sub(-)

	public static void add(int x, int y) {
		System.out.println("x+y= " + (x + y));
	}

	public static void sub(int x, int y) {
		//결과값 음수 X
		if(x < y) {
			int temp = x;
			x = y;
			y = temp;	
		}
		System.out.println("x-y= " + (x - y));	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		add(x, y);
		sub(x, y);		
	} // end main
	
	
	
} // end class
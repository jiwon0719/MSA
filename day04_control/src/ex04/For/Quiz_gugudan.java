package ex04.For;

import java.util.Scanner;

public class Quiz_gugudan {
	public static void main(String[] args) {
		
		//Q1. 원하는 단 입력 받아서 구구단 구하는 프로그램 작성
		System.out.print("1~9단 중 원하는 단을 입력하시오: ");
		int input = new Scanner(System.in).nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(input + " * " + i + " = " + (input * i));
		} // end for
		
		
		System.out.println("\n\n");
		
		
		//Q2. "*****"출력하는 프로그램 작성하기
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		} // end for
		
		
		System.out.println("\n\n");
		
		
		//Q3. 구구단 전체 출력하기 
		int multi = 0;
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));	
			} //in for end
			
			System.out.println();
		} //out for end
		
	} //main end
} //class end

package ex06.While;

import java.util.Scanner;

public class Quis_While {
	public static void main(String[] args) {
		//Q1. 원하는 단 입력 받아서 구구단 구하는 프로그램 작성(for문)
		System.out.print("1~9단 중 원하는 단을 입력하시오: ");
		int input = new Scanner(System.in).nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(input + " * " + i + " = " + (input * i));
		} // end for
		
		
		System.out.println("==================");
		
		
		//Q2. 원하는 단 입력 받아서 구구단 구하는 프로그램 작성(while문)
		System.out.print("1~9단 중 원하는 단을 입력하시오: ");
		int inputTwo = new Scanner(System.in).nextInt();
		
		int i = 1;
		while(i <= 9) {
			System.out.println(inputTwo + " * " + i + " = " + (inputTwo * i));
			i++;
		} // end while
		

		System.out.println("==================");
		
		
		//Q3. 원하는 단 입력 받아서 구구단 구하는 프로그램 작성(do while문)
		System.out.print("1~9단 중 원하는 단을 입력하시오: ");
		int inputThree = new Scanner(System.in).nextInt();
		
		i = 1;
		do {
			System.out.println(inputThree + " * " + i + " = " + (inputThree * i));
			i++;
		} while(i <= 9); // end do while
		
	}
}

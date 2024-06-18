package ex06.While;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		
		int su;
		
		do {
			System.out.print("jumsu input(0~100) = ");	
			su = new Scanner(System.in).nextInt();
			
			System.out.println(su);
			
		}while(su< 0 || su > 100) ;
	}
}

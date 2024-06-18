package ex02.If;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		//짝/홀수 판정 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.println("integer data input : ");
		int su = sc.nextInt();
		
		if( su % 2 == 0 ) {
			System.out.println(su + " ==> even");
		} else {
			System.out.println(su + " ==> odd");
		}
	}
}

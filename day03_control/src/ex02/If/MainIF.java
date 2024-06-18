package ex02.If;

import java.util.Scanner;

public class MainIF {
	public static void main(String[] args) {
		
		// 짝/홀수 & 음수/양수인지 판정 프로그램 
		System.out.println("integer data input : ");
		int su = new Scanner(System.in).nextInt();
		
		if( su % 2 != 0 ) { // if( su % 2 == 0 ) {
			System.out.println(su + " ==> 홀수");
			
			if( su > 0 ) {
				System.out.println("양수");
			}else {
				System.out.println("음수");
			} // in if end
			
		} else {
			System.out.println(su + " ==> 짝수");
			
			if( su > 0 ) {
				System.out.println("양수");
			}else {
				System.out.println("음수");
			} // in if end
			
		} // out if end
	}
}

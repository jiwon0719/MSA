package ex04.foreach;

import java.util.Iterator;

public class MainEntry {
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6};
		
		//오름차순 정렬
		for(int i = 0; i < a.length; i++) {
			
//			if(a[i] == 3) break;
//			if(i ==4) break; //인덱스 번호가 4일때 멈춰
			
			System.out.print(a[i] + "\t");
		}
		
		System.out.println("\n===============================");
		
		//for(자료형 변수명 : 컬랙션명 또는 배열명) { 반복구문; }
		for(int item : a) {	
//			if(item ==3) break;
			System.out.print(item + "\t");
		}

		System.out.println("\n===============================");
		
		
		//내림차순 정렬
		for(int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + "\t");
		}
		
		
	}
}



/*
package ex04.foreach;

import java.util.Iterator;

public class MainEntry {
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6};
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		
		System.out.println("\n\n");
		
		//for(자료형 변수명 : 컬랙션명 또는 배열명) { 반복구문;}
		for(int item : a) {
			System.out.print(item + "\t");
		}
		
		System.out.println("\n\n");
		
		for (int i : a) {
			System.out.print(i + "\t");
		}
		
	}
}
*/


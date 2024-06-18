package ex05.sort;

import java.util.Arrays;

public class ArraysSort {
	public static void main(String[] args) {
		
		int[] a = {7,3,5,2,8};
		
		System.out.println("sort 전 출력: ");
		for(int i = 0; i < a.length; i++) { //a.length = 5
			System.out.print(a[i] + " ");
		}
		
		Arrays.sort(a); //정렬 알고리즘이 이미 내부적으로 처리 되어 있는 메소드
	
		System.out.println("\nsort 후 출력: ");
		for(int i = 0;i <a.length; i++) {
			System.out.print(a[i] + " " );
		}
	}
}

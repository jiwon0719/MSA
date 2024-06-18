package ex02.array;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		//2차원 배열 임의의 데이터 입력 받아서(난수), 입력된 데이터 합 구하는 프로그램 작성
		
		
		int[][] arr = new int[2][3];
		int sum = 0;
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				
				arr[i][j] = (int)(Math.random()*100); //0~99
				System.out.println("arr["+i+"]["+j+"] = " + arr[i][j]);
				sum += arr[i][j];
				
			}
		}
		
		System.out.println("\nsum = " + sum);
		
		
		
		
	}
}

package quiz;

import java.util.Scanner;

public class ArrayEx02 {
	public static void main(String[] args) {
		//문제. 기상청 출근(단, 특정월(6월) 30일 기준) 비 온 날에 대한 강수량 평균(소수점 2자리)출력하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		System.out.print("총 일: ");
		int num = sc.nextInt();		
		
		double[] arr = new double[num];
		int sum = 0;
		double avg = 0.0;
		
		for(int i = 0; i < arr.length; i++) {
//			System.out.print((i + 1) + "일 강수량: ");
//			arr[i] = sc.nextInt();
			arr[i] = Math.random() * 100; //강수량 난수로 받기, Math 함수는 기본이 double형임. 
			
			sum += arr[i];
		}
		
		avg = (double) sum / num;
		
		System.out.print("\n6월 " + num + "일 치 강수량 평균: ");
		System.out.printf("%.2f", avg);
		
	
		
		
		
		
		
	}
}


/*
int num = 0;
num = new Scanner(System.in).nextInt();
int[] a = new int[num]; //배열크기는 비워두면 안됨, 실수형X
*/
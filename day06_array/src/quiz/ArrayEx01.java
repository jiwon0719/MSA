package quiz;

import java.util.Scanner;

public class ArrayEx01 {
	public static void main(String[] args) {
		//임의적인 데이터 입력 받아서, 입력 받은 데이터의 합 구하는 프로그램 작성
		
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			
//			System.out.print("a["+i+"] = ");
			System.out.print(( i + 1) + "번째 = " );		
			a[i] = sc.nextInt();
			sum += a[i];			
		} //end for
		
		System.out.println("\nsum =  " + sum);
		
		
		
		
	}
}

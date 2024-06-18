package quiz;

import java.util.Scanner;

// 문제] 두수 입력 받아서 큰수 출력하는 프로그램 작성 (if문 이용)
public class Quiz_IF {
	public static void main(String[] args) {
		System.out.println("2개 정수 데이터 입력>> ");
		int x = new Scanner(System.in).nextInt();
		int y = new Scanner(System.in).nextInt();
		int result ;
		
		if( x > y ) result = x;
		else result = y;
		
//		System.out.println("max = "+result);
		System.out.println(x + ", "+ y+"중에서 max = "+result);
	}
}

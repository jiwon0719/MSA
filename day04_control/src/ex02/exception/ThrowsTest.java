package ex02.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsTest {

	public static void main(String[] args) 
			throws Exception { //예외처리 위임 - 누가 해결? JVM
//			throws ArithmeticException, InputMismatchException { //하나씩 예외를 넣어줄수 있음.
		
		int x, y, result = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x, y = ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		result = x / y; // number/0 <==불능
		
		System.out.println(result);
	}
}
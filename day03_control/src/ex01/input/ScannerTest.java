package ex01.input;

import java.util.Scanner;

public class ScannerTest {
	//next()  vs  nextLine()
	public static void main(String[] args) {
//		Ctrl + Shift + O : import 
		Scanner sc = new Scanner(System.in); //객체생성, 메모리에할당, 생성자함수자동호출
		
		System.out.println("string input : ");
//		String s1 = sc.next(); // 공백인식 못함
		
		String s1 = sc.nextLine();
		System.out.println(s1);
		
		System.out.print("integer, double data input>> ");
//		int num = sc.nextInt();
//		double su = sc.nextDouble();
//		System.out.println(num + ", "+ su);
		
		System.out.println(sc.nextInt() + ", " + sc.nextDouble());
	}
}








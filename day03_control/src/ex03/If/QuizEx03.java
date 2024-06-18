/*
package ex03.If;

import java.util.Scanner;

//2개 정수 데이터 입력 받고, 연산자(+,-,*,/) 1개 입력 받아서 사칙연산하는 프로그램 작성하기
public class QuizEx03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String op = "korea"; 
		char ch = ' ';
		
//		System.out.print("string input ");
		ch = op.charAt(4);  // 문자열\0
		
		System.out.println(op + ", " + ch);
		
	}
}
//*/

//*
package ex03.If;

import java.util.Scanner;

//2개 정수 데이터 입력 받고, 연산자(+,-,*,/) 1개 입력 받아서 사칙연산하는 프로그램 작성하기
public class QuizEx03 {
	
	public static void main(String[] args) {
			  //object(instance)
		Scanner sc = new Scanner(System.in); // 객체생성, 메모리에할당, 생성자함수자동호출
		double d; 
//		System.out.println(d);
		int x, y, result = 0;
//		String op = "";  // op = null;
		char op = ' ';
		
		System.out.print("2개 정수 데이터 입력>> ");
		x = sc.nextInt();		y = sc.nextInt();
		
		System.out.print("연산자(+,-,*,/) 입력>> ");
		op = sc.next().charAt(0);  // 문자열\0

		if( op == '+' )  result = x + y;   // if(op.equals("+")) ==> error
		else if(op == '-')  result = x - y;
		else if(op == '*')  result = x * y;
		else if(op == '/')  result = x / y;
		
		System.out.println("\n\n"+x + op + y + " = " + result);
		
	}
}
//*/

/*
package ex03.If;

import java.util.Scanner;

//2개 정수 데이터 입력 받고, 연산자(+,-,*,/) 1개 입력 받아서 사칙연산하는 프로그램 작성하기
public class QuizEx03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, result = 0;
		String op = "";  // op = null;
		
		System.out.print("2개 정수 데이터 입력>> ");
		x = sc.nextInt();		y = sc.nextInt();
		
		System.out.print("연산자(+,-,*,/) 입력>> ");
		op = sc.next();  // +\0

		if(op.equals("+"))  result = x + y;   // if( op == "+" )
		else if(op.equals("-"))  result = x - y;
		else if(op.equals("*"))  result = x * y;
		else if(op.equals("/"))  result = x / y;
		
		System.out.println("\n\n"+x + op + y + " = " + result);
		
	}
}
//*/








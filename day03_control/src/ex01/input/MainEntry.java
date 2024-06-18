package ex01.input;  // 사용자 패키지
import java.util.Scanner;  //
//import java.lang.*;  // 내부적으로 자동 임포트 해줌

public class MainEntry {
	public static void main(String[] args) {
				// 표준입력 : System.in
		 Scanner sc = new Scanner(System.in);  //객체생성, 메모리에할당, 생성자함수자동호출
		 System.out.print("integer data input>> ");
		 int su = sc.nextInt();
		 
		 System.out.print("double data input>> ");
		 double num = sc.nextDouble();
		 
		 System.out.println("\n\n입력 받은 수 : "+ su+", "+num);
		 
//		 Ctrl + / : 주석 설정/해제
//		 Ctrl + Shift + / : 여러줄 주석 설정
//		 Ctrl + Shift + \ : 여러줄 주석 해제
		 
	}
}

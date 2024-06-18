package quiz;

import java.util.Scanner;

public class Quiz_switch {
	public static void main(String[] args) {
		//0~100점사이 점수 입력 받아서 학점 구하는 프로그램 작성(switch 이용)
		
		System.out.print("0~100점사이 점수를 입력하세요: ");
		int score = new Scanner(System.in).nextInt();
		char grade; 
		
		switch (score / 10) {
		case 10 : 
		case 9 : 
			grade = 'A';
			break;
		case 8 : 
			grade = 'B';
			break;
		case 7 : 
			grade = 'C';
			break;
		case 6 : 
			grade = 'D';
			break;
		default : 
			grade = 'F';
		}
		
		System.out.println("\n\n당신의 점수는 " + score + "점 이며, 학점은 " + grade + " 입니다.");
	}
}

package quiz;

import java.util.Scanner;

public class ScoreMethod_강사님 {
	// 변수 선언
	static int kor = 0, eng = 0, com = 0, sum = 0;
	static double avg = 0;
	static String name = " ";
	static char grade = ' ';

	// main 함수
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 학생 수: ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			input();
			process();
			grade();
			output();
		}
	}

	// input 함수
	public static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력 하세요 : ");
		name = sc.nextLine();

		do {
			System.out.print("국어점수 입력 : ");
			kor = sc.nextInt();
		} while (kor < 0 || kor > 100);

		do {
			System.out.print("영어점수 입력 : ");
			eng = sc.nextInt();
		} while (eng < 0 || eng > 100);

		do {
			System.out.print("전산점수 입력 : ");
			com = sc.nextInt();
		} while (kor < 0 || kor > 100);
	}

	// process 함수
	public static void process() {
		sum = kor + eng + com;
		avg = sum / 3.0;
	}

	// grade 함수
	public static void grade() {
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grade = 'A';
		case 8:
			grade = 'B';
		case 7:
			grade = 'C';
		case 6:
			grade = 'D';
		default:
			grade = 'F';
		}
	}

	// output 함수
	public static void output() {
		System.out.println(name + "님의 성적표*******************");
		System.out.println("국어:" + kor + "   영어:" + eng + "   전산:" + com);
		System.out.println("총점:" + sum + "   평균:" + avg + "   학점:" + grade);
		System.out.println("********************************");
	}

}

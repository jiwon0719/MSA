package quiz;

import java.util.Scanner;

//문제] 성적처리 프로그램을 함수로 분리한다. 

public class ScoreMethod {

	// 입력(name) 함수 : 이름
	public static void name(int i) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
	}

	// 입력(input) 함수 : 국어, 영어, 전산, 총점, 평균, 학점, 성적표 출력
	public static void input(int i) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, com, sum;
		double avg;
		char grade;

		do {
			System.out.print("국어 점수: ");
			kor = sc.nextInt();
		} while (kor < 0 || kor > 100);

		do {
			System.out.print("영어 점수: ");
			eng = sc.nextInt();
		} while (eng < 0 || eng > 100);

		do {
			System.out.print("전산 점수: ");
			com = sc.nextInt();
		} while (com < 0 || com > 100);
		
		sum = kor + eng + com;

		avg = (double) sum / 3;

		grade = switch ((int) avg / 10) {
		case 10, 9 -> 'A';
		case 8 -> 'B';
		case 7 -> 'C';
		case 6 -> 'D';
		default -> 'F';
		};

		System.out.println("성적표****************");
		System.out.println("국어:" + kor + " 영어:" + eng + " 전산:" + com);
		System.out.println("총점:" + sum + " 평균:" + avg + " 학점:" + grade);
		System.out.println("************************************");

	} // end input method

	// 메인 함수
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 학생 수: ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			name(i);
			input(i);

		}
	}
}
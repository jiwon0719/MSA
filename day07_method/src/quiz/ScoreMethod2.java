package quiz;

import java.util.Scanner;

//문제] 성적처리 프로그램을 함수로 분리한다. 

public class ScoreMethod2 {

	//input 함수 : 이름, 국어, 영어, 전산 입력받기 
	public static void input() {
		Scanner sc = new Scanner(System.in);
//		System.out.print("이름을 입력하세요: ");
//		name = sc.next();
		int kor = 0, eng = 0, com = 0;
		
		char grade = ' ';
		
	
	
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
		
		totalavg(kor, eng, com);
	}	
		
	
	//total_avg 함수 : 합계와 평균 구하기
	public static void totalavg(int kor, int eng, int com) {
		int sum = 0;
		double avg = 0.0;
		sum = kor + eng + com;
		avg = (double)sum / 3;
		
		grade(avg);
	}
		

	//grade 함수: 학점 구하기
	public static void grade(double avg) {
		char grade = switch ((int) avg / 10) {
		case 10, 9 -> 'A';
		case 8 -> 'B';
		case 7 -> 'C';
		case 6 -> 'D';
		default -> 'F';
		};
	}	

	//output 함수: 성적표 출력하기
	public static void output(String name, int kor, int eng, int com, int sum, double avg, char grade) {
	//public static void output() {
		input();
		System.out.println(name +  " 님의 성적표****************");
		System.out.println("국어:" + kor + " 영어:" + eng + " 전산:" + com);
		System.out.println("총점:" + sum + " 평균:" + avg + " 학점:" + grade);
		System.out.println("************************************");
	}

	//메인 함수
	public static void main(String[] args) {
		String name = "";
		
		//input();
		output();
	}
}
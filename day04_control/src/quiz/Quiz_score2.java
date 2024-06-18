package quiz;

import java.util.Scanner;

public class Quiz_score2 {
	public static void main(String[] args) {
		// 반복문을 이용해서 3명의 학생 데이터 처리하기
		/*
		 * 문제] 이름 입력 받고, 국어,영어,전산 점수 입력 받아서 총점, 평균까지 구하는 프로그램 작성
		 * 
		 * 이도연님의 성적표************** 국어 : 100, 영어 : 100, 전산 : 100 총점 : 300, 평균 : 100.0
		 */

		while (true) {

			Scanner sc = new Scanner(System.in);
			int kor, eng, com;
			int sum = 0;
			double avg = 0.0;
			char grade;
			char ans;

			System.out.print("이름을 입력해주세요: ");
			String name = sc.next();

			do {
				System.out.print("국어 점수(0~100)를 입력해주세요: ");
				kor = sc.nextInt();
			} while (kor < 0 || kor > 100);

			do {
				System.out.print("영어 점수(0~100)를 입력해주세요: ");
				eng = sc.nextInt();
			} while (eng < 0 || eng > 100);

			do {
				System.out.print("전산 점수(0~100)를 입력해주세요: ");
				com = sc.nextInt();
			} while (com < 0 || com > 100);

			sum = kor + eng + com;
			avg = (double) sum / 3;

			switch ((int) avg / 10) {
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
				break;
			}

			System.out.println();
			System.out.println(name + "님의 성적표 ***********");
			System.out.println("국어:" + kor + " 영어:" + eng + " 전산:" + com);
			System.out.println("총점:" + sum + " 평균:" + avg + " 학점:" + grade);
		
			//계속 입력 받을지에 대한 판정 유무
			System.out.print("\n계속하시겠습니까?(Y/N): ");
			ans = sc.next().toUpperCase().charAt(0); //대문자
			
			if( ans == 'Y' ) continue;
			else break;
			
		} //end while		
	}
}

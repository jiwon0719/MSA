package quiz;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("이름을 입력해주세요 : ");
//		String name = sc.next();
//		
//		System.out.println("국어, 영어, 전산 점수를 입력해주세요");
//		int kor = sc.nextInt(), eng = sc.nextInt(), com = sc.nextInt();
//		
//		int sum = kor + eng + com;
//		double avg = sum / 3;
//		char grade = ' ';
//		
//		//학점 구하기(if문 이용) - 총점/평균 중 선택해서 구하세요.
//		switch ( int(avg) / 10) 
//		case 10 :
//		case 9 :
//			grade = 'A';
//			break;
//			
//		else if( avg >= 80) grade = 'B';
//		else if( avg >= 70) grade = 'C';
//		else if( avg >= 60) grade = 'D';
//		else  grade = 'F';		
		
//		System.out.println(name + "님의 성적표 ***********");
//		System.out.println("국어 : " + kor + " 영어 : " + eng + " 전산 : " + com);
//		System.out.println("총점 : " + sum + " 평균 : " + avg + " 학점 : " + grade + "학점");
//	}
//}

/*
문제] 이름 입력 받고, 국어,영어,전산 점수 입력 받아서 
	  총점, 평균까지 구하는 프로그램 작성
	  
	  이도연님의 성적표**************
	  국어 : 100, 영어 : 100, 전산 : 100
	  총점 : 300, 평균 : 100.0
*/


//do-while 이용해서 0~100점만 입력 받기

		
Scanner sc = new Scanner(System.in);

System.out.println("이름을 입력해주세요 : ");
String name = sc.next();

int kor, eng, com;
do {
	System.out.println("국어, 영어, 전산 점수를 입력해주세요");
	kor = sc.nextInt();
	eng = sc.nextInt();
	com = sc.nextInt();
} while( (0 > kor || kor > 100) || (0 > eng || eng > 100) || (0 > com || com > 100));

	}
}	
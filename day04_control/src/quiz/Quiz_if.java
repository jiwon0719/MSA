/*
문제] 3과목(영어,국어,전산)입력 받아서 평균 60점 이상, 과목 과락(40점이하)이 아니면 "합격"
		아니면 "불합격"처리하는 프로그램 작성하세요. 

	결과> 60, 67, 80 ==>
		 50, 32, 55 ==>
		 60, 90, 39 ==> 평균 ?점인데, 전산점수 39점으로 과락 불합격
		 
		 
package quiz;

import java.util.Scanner;

public class Quiz_if {
	public static void main(String[] args) {
		int eng, kor, com;
		double avg = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("3과목(영어,국어,전산) 점수를 입력하세요: ");
		eng = sc.nextInt();
		kor = sc.nextInt();
		com = sc.nextInt();
		
		avg = (eng + kor + com) / 3.0;
		
		if (avg >= 60 && (eng >= 40 && kor >= 40 && com >= 40)) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}
}
*/

package quiz;

import java.util.Scanner;

public class Quiz_if {
	public static void main(String[] args) {
		System.out.println("kor = ");	int kor = new Scanner(System.in).nextInt();
		System.out.println("eng = ");	int eng = new Scanner(System.in).nextInt();
		System.out.println("com = ");	int com = new Scanner(System.in).nextInt();
		
		double avg = 
	}
}
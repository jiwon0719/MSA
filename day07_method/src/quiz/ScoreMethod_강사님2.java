package quiz;

import java.util.Scanner;

public class ScoreMethod_강사님2 {
	
	// main 함수
	public static void main(String[] args) {
		input();
	}
	
	// input 함수
	public static void input() {
		Scanner sc = new Scanner(System.in);
		String name = " ";
		int kor, eng, com;
		
		System.out.print("Enter your name : ");
		name = sc.nextLine();
		
		System.out.print("Enter your Korean score : ");
		kor = sc.nextInt();
		
		System.out.print("Enter your English score : ");
		eng = sc.nextInt();
		
		System.out.print("Enter your Computer score : ");
		com = sc.nextInt();
		
		System.out.println("\n\n");
		System.out.println(name + "님의 성적표....");
		System.out.println("kor : " + kor + ", eng: " + eng + ", com: " + com);

		total_cal(kor, eng, com);

	} // input end

	public static void total_cal(int kor, int eng, int com) {
		int total = 0;
		total = kor + eng + com;
		System.out.println("Your total score : " + total);

		avg_cal(total);

	} // total_cal end

	public static void avg_cal(int total) {
		double avg = 0.0;
		avg = (double) total / 3;
		System.out.println("Your average : " + avg);

		grade_cal(avg);
	} // avg_cal end

	public static void grade_cal(double avg) {
		int avg_tmp = 0;
		avg_tmp = (int) avg / 10;

		char grade = ' ';

		switch (avg_tmp) {
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
		}
		System.out.println("Your grade : " + grade);
	}// grade_cal end



	
}

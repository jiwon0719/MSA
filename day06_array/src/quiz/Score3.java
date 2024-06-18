package quiz;

import java.util.Scanner;

public class Score3 {
	public static void main(String[] args) {
		// 7명의 성적 처리 - 배열 이용 / 학생 성적표 한 번에 출력
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[3];
		int[][] score = new int[3][3]; // 학생1~7 : kor, eng, com
		int[] sum = new int[3];
		double[] avg = new double[3]; 
		char[] grade = new char[3];
			
		
		//1. for문 : 학생 1명씩 정보받기 
		for (int i = 0; i <score.length; i++) {
			System.out.print("학생 이름: ");
			name[i] = sc.next();
			
			do {
				System.out.print("\n국어 점수: ");
				score[i][0] = sc.nextInt();
			} while (score[i][0] < 0 || score[i][0] > 100);
			
			do {
				System.out.print("영어 점수: ");
				score[i][1] = sc.nextInt();
			} while (score[i][1] < 0 || score[i][1] > 100);
			
			do {
				System.out.print("전산 점수: ");
				score[i][2] = sc.nextInt();
			} while (score[i][2] < 0 || score[i][2] > 100);
		} // end for
		
		
		
		//2. for문: 학생별 sum, avg, grade 계산
		for (int j = 0; j < score.length; j++) {

			sum[j] = score[j][0] + score[j][1] + score[j][2]; 
			
			avg[j] = (double)sum[j] / 3.0;
			
			grade[j] = switch((int)avg[j]/10) {
				case 10, 9 -> 'A';
				case 8 -> 'B';
				case 7 -> 'C';
				case 6 -> 'D';
				default -> 'F';
			}; 
		} //end for

			
			
		//3. for문: 학생 정보 한번에 출력
		for(int k = 0; k < score.length; k++) {
			System.out.println("\n학생 " + name[k] + "님의 성적표****************");
			System.out.println("국어:" + score[k][0] + " 영어:" + score[k][1] + " 전산:" + score[k][2]);
			System.out.println("총점:" + sum[k] + " 평균:" + avg[k] + " 학점:" + grade[k]);
			System.out.println("************************************");
		} //end for	
			
			//4. !!!!! 랭킹 출력
			

		
	}
}
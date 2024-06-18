package quiz;

import java.util.Scanner;

public class ScoreMathod_태형 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 선언
		int n;
		System.out.println("인원수");
		n =sc.nextInt();
		String arr[][] = input(n);
		
		line();
		output(arr);
	}
	
	private static void output(String[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][0]+"님의 성적표");
			System.out.println("국어 :"+arr[i][1]+"  영어 :"+arr[i][2]+"  전산 :"+arr[i][3]);
			System.out.println("총점 :"+arr[i][4]+"\t평균점수 :"+arr[i][5]);
			System.out.println(arr[i][6]+"학점");
			line();
		}
	}

	public static String[][] input(int n) {
		Scanner sc = new Scanner(System.in);
		String[][] arr= new String[n][7];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("이름 : ");
			arr[i][0] = sc.next();
			System.out.println("국어 : ");
			arr[i][1] = String.valueOf(sc.nextInt());
			System.out.println("영어 : ");
			arr[i][2] = String.valueOf(sc.nextInt());
			System.out.println("전산 : ");
			arr[i][3] = String.valueOf(sc.nextInt());
			arr[i][4] = String.valueOf(Integer.parseInt(arr[i][1])+Integer.parseInt(arr[i][2])+Integer.parseInt(arr[i][3]));
			arr[i][5] = String.valueOf(Integer.parseInt(arr[i][4]) /3);
	
			char gread = ' ';
			switch (Integer.parseInt(arr[i][5])/10) {	
			case 10: 
			case 9: gread = 'A'; break;
			case 8: gread = 'B'; break;
			case 7: gread = 'C'; break;
			case 6: gread = 'D'; break;
			default: gread = 'F';
			}
			arr[i][6] = String.valueOf(gread);
		}
		return arr;
	}

	public static void line() {
		System.out.println("-------------------------------");
	}

	
}

package quiz;

import java.util.Scanner;

public class MainEntry_Score {
	public static void main(String[] args) {
		ScoreClass score = new ScoreClass();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 학생 수: ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			score.input();
			score.process();
			score.grade();
		} //end for
		
		for (int i = 0; i < num; i++) {
			score.output();
		} //end for
		
	} //end main 
}

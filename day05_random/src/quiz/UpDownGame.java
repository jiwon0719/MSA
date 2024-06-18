package quiz;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame {
	public static void main(String[] args) {

		Random rand = new Random();
		int dap = (rand.nextInt(99)) + 1; // 1~100 ((79))
//		System.out.println(dap);

		for (int i = 1; i < 6; i++) {

			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.print("UpDownGame 1~100중 하나의 수를 입력하세요(기회는 " + (6-i) + "번): ");
			int userNum = sc.nextInt(); // ((50))

			// 3. 입력 값에 맞는 Up, Down 알려주기
			if (userNum < dap) {
				System.out.println("오답입니다. 힌트: Up");
			} else if (userNum > dap) {
				System.out.println("오답입니다. 힌트: Down");
			} else {
				System.out.println("정답입니다. 정답: " + dap);
				System.exit(0);
			}

		} //end for
		
		System.out.println();
		System.out.println("오답입니다. 정답: " + dap);
	}
}

/*
 * 1~100 중에 난수 출력 예) dap = 난수값 사용자에게 5회 입력 기회 제공 답이 맞으면 탈출 틀렸으면 기회 상실 및 답 출력하기
 */
package ex05.multiFor;

public class ForStar {
	public static void main(String[] args) {

		//역트리 출력
		for(int i = 0; i < 5; i++) { //5행
			
			for(int j = 0;)
			
			for(int j = 0; j < i; j++) {
				System.out.println(" ");
			}
			
		}
		
		//트리 출력
		for(int i = 0; i < 5; i++) {
		
			for(int j = 0; j < 5-i; j++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < (i*2) +1; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		System.out.println();
		System.out.println("=============");
		System.out.println();
		
		// 공백 역삼각형 출력
		for (int i = 1; i <= 5; i++) { // 행(개행)
			for (int j = 1; j < i; j++) { // " "출력
				System.out.print(" ");
			} // end j

			for (int j = 1; j <= 6 - i; j++) { // '*' 출력
				System.out.print("*");
			} // end j

			System.out.println();
		} // end i

		System.out.println();
		System.out.println("=============");
		System.out.println();

		// 공백 삼각형 출력
		for (int i = 1; i <= 5; i++) { // 행(개행)

			for (int j = i; j <= 4; j++) { // 공백 출력
				System.out.print(" ");
			} // end j

			for (int j = 1; j <= i; j++) { // '*' 출력
				System.out.print("*");
			} // end j

			System.out.println();
		} // end i

		System.out.println();
		System.out.println("=============");
		System.out.println();

		// 역삼각형 출력
		for (int i = 1; i <= 5; i++) { // 행(개행)
			for (int j = 1; j <= 6 - i; j++) { // '*' 출력
				System.out.print("*");
			} // end j

			System.out.println();
		} // end i

		System.out.println();
		System.out.println("=============");
		System.out.println();

		// 삼각형 출력
		for (int i = 1; i <= 5; i++) { // 개행
			for (int j = 1; j <= i; j++) { // '*' 출력
				System.out.print("*");
			} // end j
			System.out.println();
		} // end i

		System.out.println();
		System.out.println("=============");
		System.out.println();

		// 정사각형 출력
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			} // end j
			System.out.println();
		} // end i

	}
}

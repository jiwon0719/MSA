package ex02.exception;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		int x, y, result = 0;
		Scanner sc = new Scanner(System.in); //객체생성, 메모리할당, 생성자함수자동호출
		
//		try {
			
			System.out.println("x, y = ");
			x = sc.nextInt();
			y = sc.nextInt();
			result = x / y; // 예외 발생 구간	
			System.out.println(x + "/" + y + "=" + result);
			
//		} catch (Exception e) {
//			System.out.println("0으로 나눌 수 없습니다!!"); //user message
//			System.out.println(e.getMessage()); //Maker 제공 message
//			e.printStackTrace(); //발생한 예외를 단계별로 찾아서 출력해줌
//		}
	}		
}		
		
		
/*		if(y == 0) {
			System.out.println("0으로 나눌수 없습니다.");
			System.exit(0); // 프로그램 강제 종료
		}
		
		if(y != 0) result = x / y;
		else {
			System.out.println("0으로 나눌수 없습니다.");
			System.exit(0); // 프로그램 강제 종료
		}
		
		result = x / y; // number/0 <== 불능
		
		System.out.println(x + "/" + y + "=" + result);
*/
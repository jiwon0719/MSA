package ex06.While;

public class DoWhileGuGudan {
	public static void main(String[] args) {
		
	//do~while 이용한 구구단 전체 출력
		int num1 = 1;
		int num2 = 1;
		
		do {
			num2 = 1;
			
			do {
//				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
				System.out.printf("%2d*%2d=%2d  ", num2, num1, (num1*num2));
				num2++;	
			} while (num2 < 10);
			
			System.out.println();
			num1++;
			
		} while (num1 < 10);
	}
}
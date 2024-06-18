package ex06.While;

public class MultiDoWhile {
	public static void main(String[] args) {
		int a = 1, b = 1;
		
		do {
			// 안쪽변수의 초기화 
			b = 1;
			do {
				System.out.print(b + "\t");
				b++;
			} while(b <= 3);
			
			System.out.println();
			a++;
			
			//안쪽변수의 초기화
		} while(a <= 2);
		
		
		
	}
}

package ex06.While;

public class MainEntry {
	public static void main(String[] args) {
		int a = 1; // 초기화
		
		while(a < 6) { // 조건식
			System.out.print(a + " ");
			a++; // 증감식
		} //end while
	
		System.out.println();
		System.out.println("==============");
		
		
		a = 1;
		do {
			System.out.print(a + " ");
			a++;
		} while(a < 6);// do while
	
	
	}
}

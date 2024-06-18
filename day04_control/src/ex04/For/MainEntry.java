package ex04.For;

public class MainEntry {
	public static void main(String[] args) {
		// 1~5까지 합 구하는 프로그램 작성
		
		int a = 1;
		int sum = 0;
		int b;
		
		// 무한루프 ==> 탈출구문이 반드시 필요함
		for ( ; ; ) {
			System.out.println(a++ + "\t");
			if(a == 3) break;
		}
		
		// 초기식, 증감식 생략 가능
		for( ; a <=5; ) {
			sum += a;
			a++;
		}
		System.out.println("sum = " + sum);
				
		// 초기식, 증감식 2개 이상 사용 가능
		for( a = 1, b = 2; a <= 50; a++, b+=2) {
			System.out.println(b + "\t");
		}		
	}
}

/*
package ex04.For;

public class MainEntry {
	public static void main(String[] args) {
		
		int a = 1;
		for(a = 1; a <=5; a++) {
			System.out.println("안녕" + a);
		}
	}
}
*/
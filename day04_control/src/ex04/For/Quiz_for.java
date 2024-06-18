package ex04.For;


public class Quiz_for {
	public static void main(String[] args) {
		//1~100중에서 짝수 출력하기
		
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			if (i % 20 == 0) {
				System.out.println(); //5개씩 끊어서 개행하기
			}
			} //end if
		} //end for
		
		//1~100중에서 3의 배수의 합과 개수를 구하는 프로그램
		System.out.println();
		int sum = 0;
		int count = 0;
		
		for (int i = 1; i < 101; i++) { //i를 또 선언할 수 있는 이유-> for문 안에서만 살아있으니까
			if (i % 3 == 0) {
				sum += i;
				count++; //count += 1 //count = count + 1
			} // end if
		} // end for
		
		System.out.println("3의 배수의 합: " + sum + ", 개수: " + count);
		
	} //end main 
} // end class
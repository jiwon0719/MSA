package ex01.array;

public class ArrayTest {
	public static void main(String[] args) {
		
		//1~50중에서 짝수를 배열에 저장해서 출력하는 프로그램 작성
		
		int[] arr = new int[25];
		int index = 0;
		
		for(int i = 1;i <= 50; i++) {
			
			if(i % 2 == 0) {
				arr[index] = i;
				System.out.print(arr[index] + " "); //
				index++;
			} 
		} //end for

		System.out.print(arr + " "); //
		
	}
}




/*
package ex01.array;

public class ArrayTest {
	public static void main(String[] args) {
		
		//배열 여러개 데이터중에서 7의 개수를 찾기
		int [] a = new int[] {7,3,5,7,8,1,7,9,7,4,7,99,22,7};
		int seek = 7;
		int count = 0;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] == seek) {
			count++; 
			}
		}
		
		System.out.println("배열 여러개 데이터중에서 7의 개수: " + count);
		
	}
}


/*
package ex01.array;

public class ArrayTest {
	public static void main(String[] args) {
		
		//배열에 5개 데이터 선언하고 배열의 합 구하기
//		int [] a = {3,5,8,1,9};
		int [] a = new int[] {3,5,8,1,9};
		int sum = 0; //누적할 함수는 초기화 하는게 좋다
		
		for(int i = 0; i < a.length; i++) {
			sum += a[i]; //sum = sum + a[i];
		}
		
		System.out.println("3,5,8,1,9의 합은 : " + sum);
		
	}
}
*/
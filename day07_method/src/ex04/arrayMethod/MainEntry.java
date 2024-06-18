package ex04.arrayMethod;


public class MainEntry {

	public static void main(String[] args) { // 시작점(진입점)
		int x = 3, y = 5;
		int result = methodEx(x, y);
		System.out.println(result); //8

		// 1차원 배열 함수
		int[] arrResult = methodEx2(); //함수 호출
	
		for(int i = 0; i < arrResult.length; i++) { 
			System.out.print(arrResult[i] +" "); //1 2 3 4 5 6 7 8
		}
		System.out.println();

		for (int item : arrResult) {
			System.out.print(item + " "); //1 2 3 4 5 6 7 8
		}
		
		//-------2차원 배열 함수 처리----------------
		int[][] arrResult2 = methodEx3();
		int sum = 0;
		for(int i = 0;i < arrResult2.length;i++) {
			for(int j = 0; j < arrResult2[i].length; j++) {
				
				sum += arrResult2[i][j];
			}
		}
		System.out.println("\nsum = " + sum); //sum = 36
		
		
		int[][] arrResult3 = methodEx3();
		for(int i = 0;i < arrResult3.length;i++) {
			for(int j = 0; j < arrResult3[i].length; j++) {
				
				System.out.print(arrResult3[i][j] + " "); // 1 2 3 4
			}											  // 5 6 7 8
			System.out.println();
		}
		
		System.out.println("=======================");
		int index = 0;
		for(int[] item : arrResult3) {
			System.out.println("index : " + index);
			System.out.println(item); //데이터 들어 있는 곳의 시작 주소 출력
			System.out.println(item.hashCode()); //메모리상의 주소(16진수형태)를 10진수 형태 메모리 주소로 출력
			System.out.println("======================");
		}
		
		System.out.println("*************foreach 문으로 2차원 배열 데이터 출력하기***************");
		
		for(int[] item : arrResult3) {
			
			for(int arrItem : item) {
				System.out.print(arrItem + " ");
			} //end arrItem
			System.out.println();
		} //end item

	} //end main

	public static int methodEx(int x, int y) {
		return x + y;
	}

	public static int[] methodEx2() {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		return arr;
	}
	
	public static int[][] methodEx3() {
		int [][] arr2 = { {1, 2, 3, 4}, {5, 6, 7, 8} }; //arr2 = x001; x001에 데이터 순서대로 저장
		return arr2; //x001을 반환
	}

}
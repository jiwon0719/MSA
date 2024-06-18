
/*
package ex05.multiFor;

public class GuGuDan {
	public static void main(String[] args) {
		//구구단 전체 출력
		
		System.out.println("구구단 전체 출력");
		
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 1; j <= 9; j++) {
		
				System.out.println(i + " * " + j + " = " + (i * j));
				
			} // end j
		
			System.out.println();
			
		} // end i
		
		
	} // end main
} // end GuGudan
*/

package ex05.multiFor;

public class GuGuDan {
	public static void main(String[] args) {
		//구구단 전체 출력
		
		System.out.println("구구단 전체 출력");
		
		for(int i = 1; i < 10; i++) {
			
			for(int j = 1; j < 10; j++) {
		
				System.out.println("%2d*%2d=%2d  ",j, i, (i * j));
				
			} // end j
		
			System.out.println();
			
		} // end i
		
		
	} // end main
} // end GuGudan
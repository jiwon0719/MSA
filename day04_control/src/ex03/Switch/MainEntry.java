/*
package ex03.Switch;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.print("1,2,3 중에서 숫자 입력 요망 : ");
		int point = new Scanner(System.in).nextInt();
		
		switch(point) { //long형 제외한 정수형과 문자형 올 수 있음. 실수형 올 수 없다. 
		case 1 :
			System.out.print("집 "); 
			break;
		case 2 : 
			System.out.print("피아노 "); 
			break;
		case 3 :	
			System.out.print("우산 "); 
			break;
		default :{
			System.out.println("범위에 없는 숫자 입니다. 다시 입력하세요.(1~3 중에서)");
			System.exit(0); //프로그램 강제 종료
			}
		} //switch end
		System.out.println("상품에 당첨 되셨습니다.!!");
	}
}
//*/

/*
package ex03.Switch;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.print("1,2,3 중에서 숫자 입력 요망 : ");
		int point = new Scanner(System.in).nextInt();
		
		switch(point) { //long형 제외한 정수형과 문자형 올 수 있음. 실수형 올 수 없다. 
		case 1 :
			System.out.print("집 "); 
			//break;
		case 2 : 
			System.out.print("피아노 "); 
			//break;
		case 3 :	
			System.out.print("우산 "); 
			//break;
//		default :{
//			System.out.println("범위에 없는 숫자 입니다. 다시 입력하세요.(1~3 중에서)");
//			System.exit(0); //프로그램 강제 종료
//			}
		} //switch end
		System.out.println("상품에 당첨 되셨습니다.!!");
	}
}
*/

package ex03.Switch;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.print("1,2,3 중에서 숫자 입력 요망 : ");
		int point = new Scanner(System.in).nextInt();
		
		switch(point) { //long형 제외한 정수형과 문자형 올 수 있음. 실수형 올 수 없다. 
			case 1 :
			case 11 :
			case 21 :
				System.out.print("1111"); 
		
			case 2 : 
			case 22 :
			case 32 : 
				System.out.print("2222"); 

			case 3 :				
				System.out.print("333"); 

			default :{
				System.out.println("범위에 없는 숫자 입니다. 다시 입력하세요.(1~3 중에서)");
				System.exit(0); //프로그램 강제 종료
			}
		} //switch end
	}
}
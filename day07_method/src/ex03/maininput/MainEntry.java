package ex03.maininput;

// return; //제어권 넘김
// main method로 입력 받기 처리 방법

public class MainEntry {

	public static void main(String[] args) {	
		
		if(args.length < 1) {
			System.out.println("using error : args에 값 넣어주세요 ");
			return; //제어권넘김
		}
		
		System.out.println("args[0] = " + args[0]); //Run As > Run Configurations > arguments
		System.out.println("args[1] = " +args[1]);
		System.out.println("args[2] = " +args[2]);
		System.out.println();
		
		//문자열 > 숫자로 변환하여 출력하기
		String s1 = args[0];
		String s2 = args[1];
		String s3 = args[2];
		

//		int num1 = Integer.parseInt(s1);
//		int num2 = Integer.parseInt(s2);
		
//		System.out.println(num1 + num2);
//		System.out.println();
//		System.out.println(args[0] + args[1]); //String 타입으로 문자열 결합

		System.out.println("plus = " + (Integer.parseInt(s1) + Integer.parseInt(s1) + Integer.parseInt(s3)) );
		
		
	}
}

package ex02.datatype;

public class DataType2 {
	public static void main(String[] args) {
		
		String str = "A";  // 문자열
		char ch = 'A';  // 문자
		char ch2 = 67;
		char ch3 = 'b';
		
		int su = 20; String nickname="happy"; double d = 12.34;
		
		System.out.println(ch);  // A
		System.out.println(str);  // A
		System.out.println((int)ch);  // ASCII code : 65
		
		System.out.println(ch2 + ch3); //?   
		System.out.printf("%c  %d \n", ch, (int)ch); // A, 65
		
		System.out.println("nickname : "+ nickname);
		System.out.println("실수형 데이터 : " + d);
		
		for(int i = 65; i <= 90; i++) {
			System.out.print( (char)i + " ");
		} // end for
		
		System.out.println("\n\n-----------------------------");
		for(int i = 'a'; i <= 'z'; i++) {
			System.out.print( (char)i + " ");
		} // end for
		
		System.out.println("\n\nboolean type");
		boolean flag = true;
//		int iflage = flag; // error 
		System.out.println(flag);
	}
}








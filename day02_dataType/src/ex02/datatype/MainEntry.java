package ex02.datatype;

public class MainEntry {
	
	static int y ;  // 정수형: 0, 실수형 : 0.0, 문자열 : NULL
	static String s;
	
	public static void main(String[] args) {
		
		System.out.println("y = " + y);
		System.out.println("s = " + s);
		
		int x = 10;  // 지역변수는 반드시 초기화 하고 사용한다.
		System.out.println(x);
		
		final int  NUM = 9;  // 상수화
		System.out.println(NUM);
		
//		NUM = 900;  // 9 = 900 
//		System.out.println(NUM);
		
		int su = 30;
		char ch = 'A';
		String str = "string kosa";
		double d = 12.34;
		
		System.out.println(su);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(d);     
		// 한줄 삭제 : Ctrl + D
		
		System.out.println("su="+su +"str : " + str);
		System.out.println(ch + ", "+ d+", "+su);
	}
}

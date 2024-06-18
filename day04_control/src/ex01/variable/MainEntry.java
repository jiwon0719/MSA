package ex01.variable;

public class MainEntry {
	public static void main(String[] args) {
		int x = 30;
		var y = 10;
		var str = "kasa";
		var z = 12.34;
	
		System.out.println(x);
		System.out.println(y);
		System.out.println(str);
		System.out.println(z);
		
		x = y; //
		System.out.println(x + ", " + y);
		
		z = y; // 자동(묵시적) 형변환 : 큰 <== 작은
		System.out.println(z + ", " + y); 
		
		int a = 500; //4byte
		short b = 3; //2byte
		
//		a = b;
		b = (short)a; // short <== int, 명시적 형변환, 데이터 손실 발생 할 수 있다. 
		
//		str = y; //string number type error
//		System.out.println(str + ", " + y);
	
	}
}

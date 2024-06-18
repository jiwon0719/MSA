package ex02.datatype;

public class DataType {
	
	public static void main(String[] args) {
		double d = 12.34;
		float f = 12.34f;   // F or f
		
		System.out.println("double val = " + d);  // 
		System.out.println("float val = " + f);  
		
		System.out.println(3.1459); // double
		
		int num = 3;
		short sh = 90;
		System.out.println(num); //4byte
		System.out.println(100); //??? int형으로 인식
		System.out.println(sh);   //2byte 
		byte bb = 127;  // -128 ~ 127
		System.out.println(bb);
		
		long l = 900;
		System.out.println(l);  // 8byte
		
		System.out.println(123L); // Long data : l or L 
	}
}







package ex02.operator;
//최단산쉬관논삼대콤
public class OperatorTest2 {
	
	public static void main(String[] args) {
		//대입연산자 : =, +=, -=, *=, /=, <<=, >>=,....
		int x = 2, y = 3, result;
		
		result = x + y;
		System.out.println(result);
		
//		x = x + y;
		x += y;  // =+ <== win X
		System.out.println(x);
		
		x *= y;
		System.out.println(x);
		
//		x = x + 1;
//		x += 1;
		x++;
		System.out.println(x);
		
	}
}

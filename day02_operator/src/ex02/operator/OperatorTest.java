//*
package ex02.operator;
//최단산쉬관논삼대콤
public class OperatorTest {
	//삼항(조건)연산자: ( 조건 ) ? 참 : 거짓 ;
	public static void main(String[] args) {
		 int x=3, y=5, z=10, result;
		 
//		 result = (x > y) ? x : y;
//		 result = (x < y) ? x : y;
		 
//		 if(x > y) result = x;
//		 else result = y;
		 
		 result = (x > y) ? x : 
			 				   (y > z) ? y : z;
		 
		 System.out.println(result);
	}
}
//*/

/*
package ex02.operator;
//최단산쉬관논삼대콤
public class OperatorTest {
	//논리연산자: &, &&(and), |, || (or), ^ (xor), ! 
	//10진논리 ==> 결과 : true, false (참, 거짓)
	public static void main(String[] args) {
		int x = 10, y = 20, z = 30;
		boolean flag = false;
		
//		flag = (x < y) && (y < z); 
		flag = (x > y) && (y < z); // '&&'연산일때 앞에 값이 '거짓'이면 뒤는 수행하지 않는다.
		System.out.println(flag);
		
//		flag = (x < y) || (y < z); // '||'연산일때 앞에 값이 '참'이면 뒤는 수행하지 않는다.
		flag = (x > y) || (y < z); 
		System.out.println(flag);
		
		System.out.println(!flag); // ! 
	}
}
//*/

/*
package ex02.operator;
//최단산쉬관논삼대콤
public class OperatorTest {
	//논리연산자: &, &&(and), |, || (or), ^ (xor), ! 
	// 2진논리 ==> 결과 : 값
	public static void main(String[] args) {
		int x = 4, y = 7;
		
		System.out.println(x & y);  // and: &
		System.out.println(4 & 7);
		
		System.out.println(x | y); 	// or : |
		System.out.println(x ^ y);	// xor : ^
	}
}
//*/





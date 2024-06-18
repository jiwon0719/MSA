package ex02.exception;
//import java.util.InputMismatchException;
import java.util.*;

public class ExceptionTest {
	public static void main(String[] args) {
		int x, y, result = 0;
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("x, y = ");
			x = sc.nextInt();
			y = sc.nextInt();
			result = x / y; // 예외 발생 구간	
			System.out.println(x + "/" + y + "=" + result);
			
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
		} catch (Exception e) {
			System.out.println("Expection"); 
		} finally {
			System.out.println("finally 무조건 실행된다");
		} // try end
	}		
}		
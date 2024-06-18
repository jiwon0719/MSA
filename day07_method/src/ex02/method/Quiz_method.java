package ex02.method;

public class Quiz_method {
	// add(int, int), sub(1,2,3), message() { return "인사말" }
	
	
	public static void main(String[] args) {
		add(1,2);
		sub(1,2,3);
		String msg = message();
		System.out.println(msg);
	}
	
	public static String message() {
		System.out.println("졸린 오후네요. ");
		System.out.println("그래도 우린 열공모드!!!");
		String str = "반가워요";
		return str;
	}
	
	public static void sub(int i, int j, int k) {
		int sub = i - j - k;
		System.out.println("sub = " + sub);
	}
	
	//returnType보다 함수의 리턴 타입이 우선시 된다.
//	public static int hap(double x, double d) {
//		return x + d;
//	}
	
	public static double hap(int x, int d) {
	return x + d; //int
	}

	
	
	public static void add(int i, int j) {
		System.out.println("hap = " + (i + j));
	}
	
}

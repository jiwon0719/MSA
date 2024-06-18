package ex08.argumentVariable;

public class MainEntry {
	
	public static void plus(int...x) { //가변길이 배열
		int sum = 0;
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
			sum += x[i];
		}
		System.out.println("sum = " + sum);
	}
	
	public static void main(String[] args) {
		plus(3,4);
		plus(200);
		plus(10, 20, 30, 40, 50, 70);
		plus("kbs ", "mbc ");
		plus("a ", "b ", "c ", "123", "124567");
	} //end main

	
	public static void plus(String...x) { //가변길이 배열
		String sum = "";
		for(int i = 0; i < x.length; i++) {
//			System.out.print(x[i] + " ");
			sum += x[i];
		}
		System.out.println("sum = " + sum);
	}
	
	
//	private static void plus(int i, int j, int k, int l, int m, int n) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void plus(int i) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private static void plus(int i, int j) {
//		// TODO Auto-generated method stub
//		
//	}
}

package ex01_randomMethod;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println(Math.random());

		int num = (int)(Math.random() * 5);
		System.out.println(num);
		
		System.out.println(Math.random() * 100);
		System.out.println((int)(Math.random() * 100));
		
		System.out.println( (int)(Math.random() * 5) + 1); //1~5
		System.out.println( (int)(Math.random() * 5) + 2); //2~6
	}
}
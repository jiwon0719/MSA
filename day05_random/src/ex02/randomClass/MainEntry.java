package ex02.randomClass;

import java.util.Random;

public class MainEntry {
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		System.out.println(rand.nextDouble());
		
		int num = rand.nextInt();
		System.out.println(num);
		
		System.out.println("==========================");
		
		// rand.nextInt(n); 
		System.out.println(rand.nextInt(5)); //0~4
		System.out.println(rand.nextInt(5) + 1); //1~5
	}
}
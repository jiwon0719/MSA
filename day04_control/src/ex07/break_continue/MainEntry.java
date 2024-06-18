package ex07.break_continue;

public class MainEntry {
	public static void main(String[] args) {
		//break, continue
		
		for(int i = 1; i < 11; i++) {
			
			if( i ==7) break; //for문에서 break를 만나면 for문을 빠져나간다.
			
			System.out.println(i);
		}
		
		
		System.out.println("=============");
		
		
		for(int i = 1; i < 11; i++) {
			
			if( i ==3 ) continue; //for문에서 continue를 만나면 바로 증감식으로 올라간다.
			
			System.out.println(i);
		}
		
	}
}
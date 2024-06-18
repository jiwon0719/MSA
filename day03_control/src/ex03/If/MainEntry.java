package ex03.If;

public class MainEntry {
	public static void main(String[] args) {
		int x = 3, y = 5, temp;
		
		System.out.println("x = "+x +", y= " + y);
		
		if( x < y ) {
			// 교환
			temp = x;
			x = y;
			y = temp;
		}
		
		System.out.println("x = "+x +", y= " + y);
		
	}
}

package ex07.Return;

public class MainEntry {
	public static void main(String[] args) {
		int x = 5;
		
		System.out.println(x);
		x *= 100;
		
		if( x == 500) {
			return; //제어권넘김 ==> 밑에 코드는 절대 출력하지 않음
		}
		
		System.out.println(x);
		System.out.println("여기까지 출력해줘~~~");
	}
}

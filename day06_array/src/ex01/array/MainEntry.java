package ex01.array;

public class MainEntry {
	public static void main(String[] args) {
	
		//1. 
		char[] ch; //배열선언
		ch = new char[4]; //배열생성, 메모리에 할당
		
		//2. 
		char[] ch2 = new char[4]; //배열선언 및 생성
		//배열 초기화
		
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		System.out.println(ch);
		
		//3. 
		char[] ch3 = {'J', 'A', 'V', 'A', 'k', 'o'};
		char[] ch4 = new char[] {'J', 'A', 'V', 'A', 'k', 'o'};
		
		System.out.println(ch3);
		
		//배열의 크기
		System.out.println("배열의 길이(크기) : " + ch2.length);
		System.out.println("배열의 길이(크기) : " + ch3.length);
	
		//배열의 내용 출력
		System.out.println("ch[2] = " + ch[2]);
		System.out.println("====================");
		
		for(int i = 0; i < 4; i++) {
			System.out.println("ch["+i+"] = "+ch[i]);
		}
		
		
		System.out.println("====================");
		
		for(int i = 0; i < ch3.length ; i++) {
			System.out.println("ch3["+i+"] = "+ch3[i]);
		}

	
	
	}
}

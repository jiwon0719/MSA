package quiz;

import java.util.Scanner;

public class MainEntry_Person {
	public static void main(String[] args) {
		PersonClass person = new PersonClass(); //객체생성, 메모리에 할당, 생성자자동함수호출
		
		Scanner sc = new Scanner(System.in);
		
//		person.setName("jiwon");
		System.out.print("name= ");
		person.setName(sc.next());
		person.setAdress("Seoul");
		person.setPhoneNum("010-0000-0000");
		person.setAge(20);
		person.setTall(180);
		person.setWeight(100);
		
		person.disp();
	}
}
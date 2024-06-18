package ex03.Switch;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		System.out.print("당신의 거주 지역은? (s, d, b, j) : ");
		String strResult = "";
		
		char area = new Scanner(System.in).next().charAt(0);
		
		switch (area) {
		case 's' : 
			strResult = "서울" ;
			break;
		case 'd' : 
			strResult = "대구" ;
			break;
		case 'b' : 
			strResult = "부산" ;
			break;
		case 'j' : 
			strResult = "제주" ;
			break;
		default :
			strResult = "우리 나라가 아니군요.";		
		}
		
		System.out.println("\n당신은 \"" + strResult + "\"에 거주하시는군요."); // \문자
	}

}

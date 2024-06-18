package ex03.Switch;

import java.util.Scanner;

public class Quiz_month {
	public static void main(String[] args) {
		//30일인 달과 31일인 달, 28일, 원하는 달(월)을 입력받아서 해당 월의 마지막 일수를 출력하는 프로그램 작성
		// jdk 14버전
		
		
		System.out.print("원하는 월 = ");
		int month = new Scanner(System.in).nextInt();
		int day = switch( month ) {
			case 1, 3, 5, 7, 8, 10, 12 -> {
				System.out.println("31일 입니다.");
				yield 31;  //day = 31;
			}
			case 4, 6, 9, 11 -> {
				System.out.println("30일 입니다.");
				yield 30;  //day = 30;
			}
			case 2 -> {
				System.out.println("year = ");
				int year = new Scanner(System.in).nextInt();
				
				if(( year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) yield 29;
			}
			default -> {
				System.out.println("1~12월 달(월)을 입력하세요. ");
				yield 0;
			}
			
		};
	}
}
		
//		System.out.print("원하는 월 = ");
//		int month = new Scanner(System.in).nextInt();
//		int day = 0;
//		
//		switch (month) {
//		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
//			day = 31; 
//			break;
//			
//		case 4 : case 6 : case 9 : case 11 : 
//			day = 30;
//			break; 
//		
//		case 2 : { //2월인 경우 윤년/평년인지 판정하여 일수 출력
//			System.out.print("year = ");
//			int year = new Scanner(System.in).nextInt();
//			
//			if(( year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
//			
//			day = 28;
//			break;
//			
//		default :
//			System.out.println("1~12월 달(월)을 입력하세요. ");
//			System.exit(0);
//		}
//		}
//		System.out.println("\n\n" + month + "월 ==> " + day + "일!");
//	}
//}

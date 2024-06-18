package quiz;

import java.util.Scanner;

public class Quiz_year {
	public static void main(String[] args) {
		System.out.print("year = ");
		int year = new Scanner(System.in).nextInt();
//		String str = "평년";		// str=null;
		String str = "";
		boolean flag = false;
		
//		if( year % 4 == 0 ) {
//		     if( ( year % 100 != 0 ) || ( year % 400 == 0 ) )
//		    	flag = true;
//		} 
		
		if( ( year % 4 == 0 ) && ( year % 100 != 0 ) || ( year % 400 == 0 ) ) {
		    	flag = true;
		} 
		
		str= (flag == true) ? "윤년":"평년";
		
		System.out.println("\n\n"+year + " ===> " + str);
	}
}

/*
 문제2] 윤년/평년 판정 프로그램 작성
  year = 1988

  if( year % 4 == 0 )
     if( year % 100 != 0 ) || ( year % 400 == 0 ) 
	"윤년"
*/
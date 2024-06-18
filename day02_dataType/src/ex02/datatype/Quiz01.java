package ex02.datatype;

public class Quiz01 {
	public static void main(String[] args) {
		// 변수 & 자료형 
		//1. 변수 선언
		String name ="kim yuna";  
		int kor = 98, eng = 80, com = 95;
		
		//2.메세지 출력 및 입력받기
		//3.처리(계산)
		int total = kor + eng + com;
//		double avg = total / 3.0;  
		double avg = (double)(total / 3);  
//		int avg = total / 3; 
		
		
		//4.출력(화면출력)
		System.out.println(name + "님의 성적표 *****");
		System.out.println("국어 : "+ kor +" |영어 : "+ eng + " |전산 : "+ com);
		System.out.println("총점 : "+ total +"\t평균 : "+ avg);
		
	}
}

/*
문제] 자신 이름 name, kor=90, eng=88, com =100;
 총점, 평균 
 
 result> 
 	이도님의 성적표 *****
 	국어 : 90, 영어 : 88, 전산 : 100
 	총점 : 278, 평균 : 92.666
*/
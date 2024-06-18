package ex03.array;

import java.util.Random;

public class MainEntry {
	public static void main(String[] args) {
	
		int[][][] arr = new int[2][2][3];
		int x = 0;
		
		System.out.println("면 = " + arr.length); //
		System.out.println("행 = " + arr[0].length); //
		System.out.println("열 = " + arr[0][0].length); //
		System.out.println("열 = " + arr[0][1].length); //
		
		//input
		System.out.println("int[2][2][3] 3차원 배열 데이터 입력: ");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				for(int k = 0; k < arr[0][0].length; k++) {
					
//					arr[i][j][k] = new Scanner(System.in).nextInt(); //배열에 사용자 값 입력하기 
//					arr[i][j][k] = ++x; //배열에 0부터 1씩 증가하여 값 넣기
//					arr[i][j][k] = (int)(Math.random()*100); //배열에 난수 넣기(1)
					arr[i][j][k] = new Random().nextInt(45) + 1; //배열에 난수 넣기(2) (1~45)
					
					
				} //end k
			} //end j
		} //end i
		
		
		//output
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				for(int k = 0; k < arr[0][0].length; k++) {
					
					System.out.print(arr[i][j][k] + "\t");
					
				} //end k
				System.out.println();
			} //end j
			System.out.println();
		} //end i		
		
		
	}
}

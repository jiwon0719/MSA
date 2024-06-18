package quiz;

public class ArrayEx03 {
	public static void main(String[] args) {

	//1. 열끼리 계산하기
	int[][] arr = new int[][] {{1,3,15,55},{10,7,28,70},{0,0,0,0}};	//3행 4열

	for(int i = 0; i < arr[0].length; i++) {
		arr[2][i] = arr[0][i] + arr[1][i];
		System.out.println("arr[2]["+i+"] = " + arr[2][i]);
	}
			
	
	System.out.println("==================");
	
	//2. 행끼리 계산하기
	int [][] arr2 = new int[][] {{1,10,0},{3,7,0},{5,7,0}}; //3행 3열	
		
	for(int i = 0; i < arr2.length; i++) {
		
		arr2[i][2] = arr2[i][0] + arr2[i][1];
		System.out.println("arr2["+i+"][2] = " + arr2[i][2]);
	}
	
	
	
		
		
	}
}

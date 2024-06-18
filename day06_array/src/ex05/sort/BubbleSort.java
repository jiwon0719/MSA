package ex05.sort;

public class BubbleSort {
	public static void main(String[] args) {
		//bubble sort: 근접한 데이터끼리 정렬
		
		int[] a = {7,3,5,2,8};
		int temp;
		
		System.out.println("sort 전 출력: ");
		for(int i = 0; i < a.length; i++) { //a.length = 5
			System.out.print(a[i] + " ");
		}
		
		//sort
		for(int i = 0; i <a.length;i++) {
			
			for(int j = 0; j < a.length-i-1; j++) {
				
				if (a[j] > a[j+1]) { //지금은 오른차순, 부등호 반대로 하면 내림차순
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				
			}
			
		}
		
		System.out.println("\nsort 후 출력: ");
		
		for(int i = 0;i <a.length; i++) {
			System.out.print(a[i] + " " );
		}
		
		
		
		
	}
}

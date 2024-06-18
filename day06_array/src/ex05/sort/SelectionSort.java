package ex05.sort;

import java.util.Iterator;

public class SelectionSort {
	public static void main(String[] args) {
		//selection sort : 기준이 있음.
		
		int[] a = {7,3,5,2,8};
		int temp;
		
		System.out.println("sort 전 출력: ");
		for(int i = 0; i < a.length; i++) { //a.length = 5
			System.out.print(a[i] + " ");
		}
		
		
		//sort
		for(int i = 0; i < a.length; i++) {
			
			for(int j = i+1; j < a.length; j++) {
				
				if ( a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		System.out.println("\nsort 후 출력: ");
		
		for(int i = 0;i <a.length; i++) {
			System.out.print(a[i] + " " );
		}
		
		int price = 580000;
		int answer = 0;
		        
		        if(price >= 100000) {
		            answer = (int)(price * 0.95);
		        } else if(price >= 300000) {
		            answer = (int)(price * 0.9);
		        } else {
		            answer = (int)(price * 0.8);
		        }
		       System.out.println(answer);
		    }

		
	}


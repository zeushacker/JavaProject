package com.day14.study;

public class ForExam02 {

	public static void main(String[] args) {
	
		int[] arr = {10,20,30,40,50};
		
		for(int i =0; i<5; i++)
			System.out.print(arr[i]+"\t\n");
		
	//	System.out.println("================");
		
		for(int temp : arr) {
			System.out.print(temp+"\t");
		}
		
		
		

	}

}

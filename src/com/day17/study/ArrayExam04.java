package com.day17.study;

/* 가변배열(레기드배열) 
 *   - 행만을 관리한다.(1차원)
 *   - 열은 행이 바뀌면서 메모리를 할당함
 *   
 */

public class ArrayExam04 {

	public static void main(String[] args) {
	
	//	int arr[][] = new int[4][];
		int arr[][] = {
				              {100,100,100},
		                      {30,40},
		                      {80,80,70,100},
		                      {90}
		                      };
		/*
		 * arr[0] = new int[2]; arr[1] = new int[2]; arr[2] = new int[5]; arr[3] = new
		 * int[3];
		 */
		int sum = 0;
		float avg =0;
		
		for(int i = 0; i<arr.length; i++) {// 행
			for(int value : arr[i]) {// 행에 해당하는 열
				System.out.print(value+"  ");
				sum += value;// 한행에 대한 총점
			}
			
			avg = (float)sum/arr[i].length; // 한 행에대한 평균
			
			System.out.printf("총점:%d, 평균:%.2f \n", sum, avg);
			
			// 행이 바뀌면서 총점을 초기화함
			sum = 0;
		}
	
	}

}

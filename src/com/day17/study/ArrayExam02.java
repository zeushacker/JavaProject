package com.day17.study;

/*   1 2 3 4 5
 *   6 7 8 9 10
 *   11 12 13 14 15
 *   16 17 18 19 20
 *   21 22 23 24 25
 */

public class ArrayExam02 {

	public static void main(String[] args) {
		
		// 배열 선언
		int arr[][];
		
		// 배열의 메모리할당
		arr = new int[5][5];
		
		int n =1,i,j;// 초기화 arr[0][0] = 1
		
		// 배열에 값 저장
		for(i=0; i<arr.length;i++) {// 행
			for(j =0; j<arr[i].length; j++) {//열
				arr[i][j] = n;
				n++;
				//arr[i][j] = n+j;
				//n++;
				
			}
			//n=i+2;
		//	n++;
		}
		System.out.println();
		
		// 배열에 저장된 값 출력
		for(i=0; i<arr.length;i++) {// 행
			for(j =0; j<arr[i].length; j++) {//열
		        System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	
	}

}

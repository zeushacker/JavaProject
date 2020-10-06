package com.day16.study;

import java.util.Scanner;

/*    문] 
 *    사용자로 부터 임의의 정수를 임의의 개수만큼
 *    입력받아 입력받은 수 중에서 가장 큰 수를 출력하는 프로그램을 구현하시오.
 *    
 *    단, 배열을 활용
 *    
 *    ex)
 *     입력할 데이터 개수: 9
 *     데이터 입력 : 4 7 9 1 3 2 5 6 8
 *     가장 큰 수 ==> 9
 *     
 */

public class ArrayExam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n,i, max=0; // 입력 받을때 쓰일 변수
		
		System.out.print("입력할 데이터 개수:");
		n = sc.nextInt();
		
		// 입력받은 데이터 개수만큼 배열의 크기를 지정한다.
		int[] arr = new int[n];
		
		System.out.print("데이터 입력 :");
		for(i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(i=0; i<arr.length; i++) {
		
			if(arr[i] > max)  // max 보다 큰값 고르기
				max = arr[i];
		}
		
		System.out.println("배열에 저장된 가장 큰 수 == >"+max);
		
	}

}

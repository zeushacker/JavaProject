package com.day12.study;

import java.util.Scanner;

/*  문] 
 *   양의 정수만 입력받아 입력받은 합의 평균의 구하여라
 *    단, 음의 정수를 입력하면 계산 , for문 사용
 *   
 */


public class ForEx01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum=0, input=0;
		int cnt = 0;
		
		for(   ; input >=0;   ) 
		{
			sum += input;
			System.out.print("양의 정수 입력:");
			input = sc.nextInt();
			cnt++;
		}
		System.out.println("지금까지 입력한 양의 정수 평균 :"+(int)(sum/cnt));
		
	}
	
}

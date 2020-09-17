package com.day07.study;

import java.util.Scanner;

public class Test003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b, c, imsi;
		
		System.out.print("첫번째 정수 입력");
		a = sc.nextInt();
		
		System.out.print("두번째 정수 입력");
		b = sc.nextInt();
		
		System.out.print("세번째 정수 입력");
		c = sc.nextInt();
		
		System.out.println("정렬 전 결과 :"+a+"  "+b+"  "+c);
		
		if( a > b) { //1. 첫번째 정수가 두번째 정수보다 큰경우
			/*
			 * imsi = a; a = b; b = imsi;
			 */
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
		}
		 if( a > c){// 2. 첫번째 정수가 세번째 정수보다 큰 경우
			/*
			 * imsi = a; a = c; c = imsi;
			 */
			a = a ^ c;
			c = c ^ a;
			a = a ^ c;
		
		
		} 
		if(b > c) { // 3. 두번째 정수가 세번째 정수보다 큰 경우
			/*
			 * imsi = b; b = c; c = imsi;
			 */
			b = b ^ c;
			c = c ^ b;
			b = b ^ c;
		}
	// 결과 
		
		System.out.println();
		System.out.println("정렬 후 결과 :"+a+"  "+b+"  "+c);
		
		
		
	
	
		
		
		
		
		
		
		

	}

}

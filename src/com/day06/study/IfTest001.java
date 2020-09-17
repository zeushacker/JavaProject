package com.day06.study;

import java.util.Scanner;

// 키보드로 부터 임의의 정수를 입력 받아 짝수인지 홀수인지를 판정하는 프로그램
// 입력은  Scanner 클래스로구현

public class IfTest001 {

	public static void main(String[] args) {
		Scanner sc =new  Scanner(System.in);
		// 1. 변수선언
		 int n;		
		 String result ="";
		// 2. 안내메시지 및 입력 저장처리
		System.out.print("임의의 정수입력:");
		n = sc.nextInt();
		// 3. 연산처리
		/*
		  if(n % 2==0) 
			  result="짝수";
		  else
			  result ="홀수";
	     */
		
		// 조건 삼항
		 result = n % 2==0 ? "짝수" : "홀수";  			  
	
		 // 4. 결과출력
		System.out.println("당신이 입력한 정수는 "+result+"입니다.");
		
	}

}

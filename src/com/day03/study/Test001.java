package com.day03.study;

import java.util.Scanner;

public class Test001 {

	public static void main(String[] args) {
		// 산술 연산자 : +,-,*,/,%
		
		// 1. 주요 변수선언
		int a,b, c,d, e, f, g;
		// a, b 값을 키보드로 부터 입력 받는다.
		// Scanner 
		Scanner sc = new Scanner(System.in);
		//a=10;
		//b=2;// 두개의 변수에 값을 대입
		 
		// 사용자에게 안내 메시지 출력
		// 2. 사용자가 입력한 데이터를 변수에 저장
		System.out.print("첫번째 정수 입력:");
		a = sc.nextInt();
		System.out.print("두번째 정수 입력:");
		b = sc.nextInt();
		
	   c=	a+b;// 덧셈연산
	   d=a-b; //뺄셈연산
	   e=a*b;// 곱셈연산
	   f=	a/b;// 나눗셈연산
	   g=a%b;//나머지 연산
		
	   System.out.printf("%d + %d =%d%n", a, b, c);
	   System.out.printf("%d - %d =%d%n", a, b, d);
	   System.out.printf("%d * %d =%d%n", a, b, e);
	   System.out.printf("%d / %d =%d%n", a, b, f);
	   System.out.printf("%d %% %d =%d%n", a, b, g);
	   
	   
		/*
		 * 10 + 2 =12 10 - 2 =8 10 * 2 =20 10 / 2 =5 10 % 2 =0
		 */
		
	
	   
	   
	   
	   
	   
		

	}

}

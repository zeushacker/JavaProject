package com.day04.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*   사용자로부터 임의의 정수를  두번 입력받아 
 *   사칙연산 및 나머지 연산을 구하는 프로그램을 작성하시오
 *   
 *   단, 데이터 입력은 BufferedReader 의 readLine()를 사용함
 *   
 *   
 *   첫번째 정수 : 10
 *   두번재 정수 :2
 *   
 *   출력결과:
 *   ------------------------
 *   10 + 2 = 12
 *   10 - 2 = 8
 *   10 * 2 = 20
 *   10 / 2 = 5
 *   10 % 2 = 0
 */

public class Test003 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		

		//1. 변수 선언
		int a, b, c, d, e, f, g;
	    char op;
		// 안내메시지 출력
		System.out.print("첫번째 정수 입력:");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("연산자 입력 :");
		op =(char)System.in.read();
		System.in.read();
		System.in.read();
		
		System.out.print("두번째 정수 입력:");
		b = Integer.parseInt(br.readLine());
		/*
		System.out.print("연산자 입력 :");
		op =(char)System.in.read();
		*/
		
		
		// 연산처리   c:+, d:-, e:*, f:/, g:%
		
		
		c  = a + b;
		d  = a - b;
		e  = a * b;
		f  = a / b;
		g  = a % b;
		
		// 결과 출력
		System.out.println("===== [ 연산 결과 ] ======");
		System.out.printf("%d + %d = %d\n", a, b, c);  
		System.out.printf("%d - %d = %d\n", a, b, d);
		System.out.printf("%d * %d = %d\n", a, b, e);
		System.out.printf("%d / %d = %d\n", a, b, f);
		System.out.printf("%d %% %d = %d\n", a, b, g);
		

	}

}

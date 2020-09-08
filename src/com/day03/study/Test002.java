package com.day03.study;

import java.util.Scanner;

public class Test002 {

	public static void main(String[] args) {
		 // 사각형의 넓이와  둘레를 구하는 프로그램을 구현하시오. 
		// 넓이연산 : 가로 * 세로
		 // 둘레연산 : 2 *(가로 + 세로) 
		//  단, 가로와 세로는 키보드로 입력받음
		  
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;
		System.out.print("가로의 길이 입력:");
		a = sc.nextInt();
		System.out.print("세로의 길이 입력:");
		b = sc.nextInt();
		
		// 사각형의 넓이
		c = a * b;
		// 사각형의 둘레
		d = 2 * (a+b);
		
		//System.out.println("사각형의 넓이:"+c);
		System.out.printf(" %d * %d = %d\n",a, b, c);
		System.out.println("사각형의 둘레:"+d);
		
		
		
		
		
		

	}

}

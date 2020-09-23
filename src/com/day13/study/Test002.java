package com.day13.study;

import java.util.Scanner;

/*
 *  문]
 *     3의 승수를 입력받아 구하는 프로그램을 작성하시오.
 *     
 *     
 * 
 */


public class Test002 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n, i, sum = 1;
		System.out.print("정수 입력:");
		n = sc.nextInt();
		
		for(i =1; i<=n; i++)
			sum *= 3;
		
		
		System.out.println("3의  "+n+"승은"+sum+"입니다.");
	}

}

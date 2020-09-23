package com.day13.study;

/*  문]
 *   임의의 정수를 입력받아 입력받은 정수의 팩토리얼을 구하는 프로그램을 작성하시오.
 *   단,  for문을 사용
 *   팩토리얼 구하는 공식: 1* 2* 3 *4 .... n
 */

import java.util.*;
public class Test001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i, sum = 1;
		System.out.print("정수 입력:");
		n = sc.nextInt();
		i =1;
		/*
		for(i =1; i<=n;i++)
			sum *= i;
		
		while(i<=n)
		{
			sum *= i;
			i++;
		}
		*/
		
		
		do
		{
			sum *= i;
			i++;
		}while(i<=n);
		
		System.out.println(n+"의 팩토리얼은 "+sum+"입니다.");
		
		
		

	}

}






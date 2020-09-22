package com.day12.study;

import java.util.Scanner;

/*  무한대로 두 정수를 입력받아 합을 구하는 프로그램을 구현하시오.
 *   for 문이용  0을 입력하면 그만
 */

public class ForEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		
		for(;;) {
			System.out.print("첫번째 정수 입력:");
			n1 = sc.nextInt();
			if( n1 == 0 )
				break;
			System.out.print("두번째 정수 입력:");
			n2 = sc.nextInt();
			
		   System.out.printf("%d + %d = %d\n", n1, n2, (n1+n2));
		}
	}

}

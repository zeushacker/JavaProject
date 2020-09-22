package com.day12.study;

import java.util.Scanner;

/*   문]
 *      두 개의 정수를 입력받아 그 사이에 존재하는 정수들의 합계를 구하는 
 *      프로그램을 구현하시오.
 *      
 *      첫번째 정수 : 3
 *      두번째 정수 : 5
 *      
 *       3+4+5 = 
 * 
 * 
 * 
 */



public class ForEx03 {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		
		int n1, n2, sum = 0;
		System.out.print("첫번째 정수 입력:");
		n1 = sc.nextInt();
		System.out.print("두번째 정수 입력:");
		n2 = sc.nextInt();
		
		if( n1 > n2) {
			n1 = n1 ^ n2;
			n2 = n2 ^ n1;
			n1 = n1 ^ n2;
		}
		
		for(int i =n1; i<=n2; i++)
			sum +=i;
		
		System.out.println("입력한 두 정수 사이의 합계:"+sum);
	}

}

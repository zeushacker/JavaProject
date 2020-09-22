package com.day12.study;

import java.util.Scanner;

/*   임의의 정수를 입력받아 입력받은 수만큼 3의 배수를 출력하는 프로그램을 구현하시오.
 *   
 *     5
 *     3 6 9 12 15
 * 
 */
public class Test003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, i =1;
		
		System.out.print("정수입력:");
		num = sc.nextInt();
		
		System.out.println("입력하신 수만큼 3의 배수를 출력합니다.");
		
		while(i<=num) {
					System.out.print(i*3+"\t");	
			i++;		
		}
		
		

	}

}

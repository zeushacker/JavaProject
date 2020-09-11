package com.day05.study;

import java.util.Scanner;

public class Test005 {

	public static void main(String[] args) {

        //  int a = 27; // 홀수인지 짝수인지 판정하는 프로그램
	
		/*   키보드로 부터 정수값을 입력받아 받은 값이 홀수인지 짝수인지를 판정하는 프로그램 구현 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 :");
		int a = sc.nextInt();
		
		// 홀수와 짝수의 판정은 어떤 수를 2로 나누어 나머지가 0이면 짝수 1이면 홀수
		if(a % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}

}

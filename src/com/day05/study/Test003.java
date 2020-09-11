package com.day05.study;

// 시프트 연산자
//    <<  : 값이 증가, >> : 값이 감소
 
public class Test003 {

	public static void main(String[] args) {
		
	// x = 128;
		// 십진수 -- > 이진수로 변환
		// int : 4byte -- > 1byte : 8bit     === > 32비트
		
		
		
		// 왼쪽으로 3번 시프트
		
		
		int x = 128;

		// 십진수 --> 2진수로 변환

		// 4byte --> 비트로 변환하면 1byte : 8bit 4바이트는 32비트

		// 왼쪽으로 3번 시프트

		System.out.printf("x << 3 : %d \n", x << 3);

		System.out.printf("X * 8 : %d \n", x  *  8);

	// 오른쪽으로 3번 시프트

		System.out.printf("x >> 3 : %d \n", x >> 3);

		System.out.printf("X / 8 : %d \n", x / 8);

		
	}
	
	
}

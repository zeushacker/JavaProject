package com.day05.study;

public class Test001 {

	public static void main(String[] args) {
		
		int a = 13, b = 7;
		//비트 연산자로 계산
		
		// 십진수를 이진수로 변환
		// 비트비트 를 각 연산자로 게산
		
		int c, d, e;
		c = a  & b;
		d = a  |  b;
		e = a  ^ b;
		
		System.out.printf("a & b :%d\n", c);
		System.out.printf("%d & %d : %d\n", a, b, c);
		System.out.println(c+","+d+","+e);
		
		System.out.printf("a | b :%d\n", d);
		System.out.printf("a ^ b :%d\n", e);
		
		System.out.printf("a & b : %d, a | ");
		
		
	}

}

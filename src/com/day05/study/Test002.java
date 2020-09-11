package com.day05.study;

public class Test002 {

	public static void main(String[] args) {
		
		int x=20, y=23, imsi=0;
		System.out.printf("x =%d, y = %d\n", x, y);
		
		// 스왑 ( 자리 바꿈) 
		/*
		imsi = x;
		System.out.println(imsi);
		x = y;
		System.out.println(x);
		y = imsi;
		System.out.println(y);
		*/
		
		 x = x ^ y;// 3   -> 00011
		 y = y ^ x;// 20 -> 10100
		 x = x ^ y;// 23 -> 10111
		System.out.printf("x =%d, y = %d\n", x, y);
		
		
	}

}

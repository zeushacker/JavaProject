package com.day03.study;

public class BitTest01 {

	public static void main(String[] args) {
	
		/*
		 * int a =10, b=-10; System.out.printf("~a : %d\n", ~a);
		 */
		
		byte p =10;
		System.out.printf("p=%d\t %s\n", p, toBinaryString(p));


		System.out.printf("~p=%d\t %s\n", ~p, toBinaryString(~p));
	}
	
	static String toBinaryString(int x) {
		String zero="00000000000000000000000000000000";
		String temp =zero +Integer.toBinaryString(x);
		return temp.substring(temp.length()-32);
	}
	
	
	
	
	
}

package com.day11.study;

//  구구단 중 4단을 출력하는 프로그램을 작성하시오.
public class ForEx02 {

	public static void main(String[] args) {
		int dan =4,i=1;
		
		/*
		 * for(i =1; i<=9; i++) { 
		 * System.out.printf("%d * %d = %d\n", dan, i, (dan*i));
		 * }
		 */
	/*	
		while( i<=9) 
		{
			System.out.printf("%d * %d = %d\n", dan, i, (dan*i));
			i++;
		}
	*/	
		do 
		{
			System.out.printf("%d * %d = %d\n", dan, i, (dan*i));
			i++;
		}while( i<=9);
		
		
		
		
		
	}

}

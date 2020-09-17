package com.day06.study;
/*
 *    사용자로 부터 임의의 년도를 입력받아
 *     입력 받은 년도가 윤년인지 평년인지를 판정하는 프로그램을 구현하시오.
 *     
 *     윤년의 판별 조건 
 *     
 *     - 입력받은 년도가4의 배수 이면서 100의 배수가 아니거나
 *       400의 배수이면 윤년  아니면 평년임 
 *       
 *       단, 입력은 BufferedReader
 *            조건은 삼항 연산자로 처리하시오. 
 */

import java.io.*;
public class IfTest003 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int year;
		String result;
		
		System.out.print("임의의 년도 입력:");
		year = Integer.parseInt(br.readLine());
		
		// 윤년 판별 조건
		
		result = (year % 4 == 0 ) && (year % 100 != 0) ||(year % 400 ==0) ? "윤년" : "평년";
		/*
		if((year % 4 == 0 ) && (year % 100 != 0) ||(year % 400 ==0))
			System.out.println(year+"====>윤년");
		else 
			System.out.println(year+"====>평년");
		*/
		System.out.println("년도는"+result+"입니다." );
	}

}

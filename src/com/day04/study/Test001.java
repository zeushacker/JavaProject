package com.day04.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*   
 *    사용자로 부터 밑변과 높이를  입력받아 
 *    삼각형의 넓이를 구하는 프로그램을 작성하시오.
 * 
 *     넓이 구하는 공식 : 높이 *  밑변  / 2
 *       
 *    밑변 : 20, 높이 : 15
 *    입력 방식 : Scanner 클래스 사용
 *    
 */

//import java.util.Scanner;



public class Test001 {

	public static void main(String[] args) throws IOException{

	//	Scanner sc = new Scanner(System.in);
	
	// 1. 주요 변수 선언
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		// 문자열을 입력받을 때는 
		String name = br.readLine();
		
		
		int   w, h;           // 밑변과 높이를 저장할 변수
		double  result;     // 결과를 저장할 변수
			
		// 2. 입력 안내메시지 및 데이터 입력 
		System.out.print("삼각형의 밑변 입력:");
		//w = sc.nextInt();
		w = Integer.parseInt(br.readLine());
		System.out.print("삼각형의 높이 입력:");
		//h = sc.nextInt();
		h = Integer.parseInt(br.readLine());
		// 3. 연산수행 및 처리
		
		result = w * h / 2.0;
		// 실수형태의 결과 값이 나올수 있도록 실수형 기반의 연산이 필요한 상황
		// 이때 정수 2가 아닌 2.0으로 실수 연산을 처리하면 됨
	
		// 4. 결과 출력
		System.out.println("삼각형의 넓이 :"+result);
		
		
	}

}

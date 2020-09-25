package com.day15.study;

/*    키보드로 부터 키와 몸무게를 입력받아 다음 조건을 이용하여 정상인지, 비만인지
 *    를 출력하는 프로그램을 작성하시오.
 * 
 *    단, 몸무게는 실수형태로 입력받는다
 *       조건 : 
 *         몸무게 <= (키 - 100) *0.9 이면 정상, 아니면 비만
 *         연산자는 조건삼항 연산자로 처리하시오.
 */

import java.util.*;
public class Test001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 키와 몸무게를 저장할 변수 선언
		double height, weight;
		String s ="";
		System.out.print("키 입력:");
		height = sc.nextDouble();
		
		System.out.print("몸무게 입력:");
		weight = sc.nextDouble();
		
		s = weight <= (height - 100) * 0.9 ? "정상" : "비만";
		
		System.out.printf("당신은 %s 입니다.\n", weight <= (height - 100) * 0.9 ? "정상" : "비만");
		System.out.printf("당신은 %s 입니다.\n", s);
		

	}

}

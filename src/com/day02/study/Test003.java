package com.day02.study;

/*  문]
 *   원의 넓이와 둘레를 구하는 프로그램을 구현하여 결과를 출력하시오.
 *    넓이공식 : 반지름 * 반지름 * 3.141592;
 *    둘레공식 : 반지름 * 2 * 3.14592;
 *    반지름 : 10
 */

public class Test003 {

	public static void main(String[] args) {
	
		// 변수선언과 초기화
		// 반지름 10
		int r = 10;
		
		// 넓이를 저장할 변수 a
		double a =  r *r *3.141592;
		
		// 둘레를 저장할 변수 b
		double b = r * 2 * 3.141592;
		
		System.out.printf("반지름의 길이 %d인 원의 넓이 : %.2f\n",r,a);
		System.out.printf("반지름의 길이 %d인 원의 둘레 : %.2f\n",r, b);
		
	}

}

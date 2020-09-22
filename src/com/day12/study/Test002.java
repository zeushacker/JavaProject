package com.day12.study;

/*   문]
 *       1/2 + 2/3 + 3/4+ .........9/10 까지의 결과를출력하시오.
 */

public class Test002 {

	public static void main(String[] args) {
		
		int n = 0;
		// 1 부터 1씩 증가하게 될 변수
		double sum = 0;
		// 누적의 합을 저장할 변수(실수형태로)
		
		while(n < 9) {
			//연산식
			sum += (double)(n+1)/(n+2);
			//증감
			n++;
		}
		// 결과 출력
		 System.out.printf("연산 결과 :%f",sum);
		
	}

}

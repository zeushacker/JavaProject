package com.day14.study;

/*   
 * 　
 *   while 문
 *      초기값을 선언한다음
 *     - 조건식 비교 하여 조건이 참일 경우 특정 영역을 반복 수행하는 문장으로
 *      반복 횟수가 정해져 있지 않은 경우나, 반복횟수가 많은 경우 주로 
 *      사용하는 반복문
 *  
 *    문]
 *     1 부터 1씩 증가 하여  100까지의 합계를 구함 
 *  
 */


public class WhileEx001 {

	public static void main(String[] args) {
	// 변수의 선언과 초기화
		int i = 1, sum = 0;
		
		while(i <= 100) {
			// 한번씩 돌때마다 누적변수에 더해짐
			sum += i;
			
			i++;
		}

		// 결과 출력
		System.out.println("1 ~ 100까지의 합계 :"+sum);
		
	}

}

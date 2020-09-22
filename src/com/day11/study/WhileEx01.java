package com.day11.study;

/*  문]
 *    1부터 100 까지의 정수의 합, 짝수의 합, 홀수의 합을 구하시오.
 *    단, 반복문은 while 문으로 구현한다.
 */

public class WhileEx01 {

	public static void main(String[] args) {

		// 변수 선언
		// 정수합 : sum, 짝수의 합: even, 홀수의 합 :odd
		// n : 1 ~ 100 까지의 범위 변수
		int n=1, sum=0, even=0, odd=0;
		//sum=even=odd=0;
		/* while(n <=100) */ 
	/*	do{
			sum += n;// 정수합 : sum
			
			if(n % 2 ==0)
				even +=n;// 짝수의 합
			else
				odd +=n;// 홀수의 합
			
			n++;
		}while(n <=100);
		
		// 결과출력
		System.out.println("1 부터 100까지의 정수의 합계 :"+sum);
		System.out.println("1 부터 100까지의 짝수의 합계 :"+even);
		System.out.println("1 부터 100까지의 홀수의 합계 :"+odd);
		*/
		System.out.println("==========================");
		for(n= 0; n<=100; n++) {
             sum += n;// 정수합 : sum
			if(n % 2 ==0)
				even +=n;// 짝수의 합
			else
				odd +=n;// 홀수의 합
			
		}
		
		System.out.println("1 부터 100까지의 정수의 합계 :"+sum);
		System.out.println("1 부터 100까지의 짝수의 합계 :"+even);
		System.out.println("1 부터 100까지의 홀수의 합계 :"+odd);
		
		
	}

}

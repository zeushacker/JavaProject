package com.day12.study;

/*   문]
 *   
 *    1 ~ 100까지의 합의 구하되
 *    10의 배수가 될때마다 결과를 출력하는 프로그램을 작성하시오.
 *    
 *    결과 출력 
 *   
 *    1 ~ 10 까지의 합계 :
 *    1 ~ 20 까지의 합계 :
 *    1 ~ 30 까지의 합계 :
 * 
 *    1 ~ 100 까지의 합계 :
 */



public class Test001 {

	public static void main(String[] args) {
	
		int n=1, sum=0;
		
		while(n <=100) {
		
		   sum +=n;
		   if(n % 10 == 0) 
		   System.out.println("1 부터 "+n+"까지의 정수의 합계 :"+sum);
		   n++;
		
		}
		
	}

}

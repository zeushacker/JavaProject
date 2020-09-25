package com.day14.study;

/*   1 부터 100 까지의 수중 짝수의 합을 구하시오
 *   단, if 조건문은 허용하지 않음
 *   while 문만을 이용하여 구현하시오.  
 */

public class WhileEx002 {

	public static void main(String[] args) {
		/*
		 * int n=2, sum = 0;
		 * 
		 * while(n <=100) { sum += n; n+=2; }
		 * 
		 * System.out.println("1 ~ 100까지의 수중 짝수의 합계 :"+sum);
		 */

		for(int i=1; i<=3; i++) {
			  for(int j = 1; j<=10; j++) { 
				  for(int k= 1;  k<=10;k++) {
					  System.out.println(" "+i+j+k); 
					  } 
				  } 
			  System.out.println(); 
		  }
	}
}

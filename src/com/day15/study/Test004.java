package com.day15.study;

/*   문]
 *     1 부터 n까지의 합중에서 5000을 넘지 않는  가장 큰 합과 그때의 n
 *     값을 출력하는 프로그램을 구현하시오.
 */
public class Test004 {
	 
	public static void main(String[] args) {
		
		int i = 0, sum =0; 
		int limit = 5000;
		do {
			sum += ++i;
		
			
		}while(sum <=limit);
	
		System.out.printf("1부터 n까지의 합중에서 %d를 넘지 않는 가장 큰 합은 ?\n", limit);
		System.out.printf("1부터 %d까지의 합이 %d 입니다.\n", i-1, sum-i);
		
	}

}

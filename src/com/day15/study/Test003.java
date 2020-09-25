package com.day15.study;

   /*  문3]  
    *   
    *    중첩 for 문을 이용하여 아래와 같이 출력하도록 프로그램을 구현하시오.
    * 
    *                 0
    *               101
    *             21012
    *           3210123
    *         432101234
    *       54321012345
    *     6543210123456
    *   765432101234567
    *   
    *   Math.abs()
    *   
    */
public class Test003 {

	public static void main(String[] args) {
		int i, j;
		int a = 9;
		
		for(i =0; i<=a; i++) {
			
			for( j = a; j>=-a; j--) {
				if(Math.abs(j) >i ) System.out.print("  ");
				else System.out.printf("%d", Math.abs(j));
			}
			System.out.println();
		}
		
		
	}

}









package com.day15.study;

   /*  ��3]  
    *   
    *    ��ø for ���� �̿��Ͽ� �Ʒ��� ���� ����ϵ��� ���α׷��� �����Ͻÿ�.
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









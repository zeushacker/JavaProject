package com.day13.study;
/*   ��ø(����) if��
 *     
 *     for(         ){
 *         for(       ) {
 *         
 *         }
 *     }
 */


public class Test003 {

	public static void main(String[] args) {
         int i, j;
         
         for( i = 1; i<=9; i++) {
        	 for(j =2; j<=9; j++)  {
        		 System.out.printf("%3d * %3d = %d",j, i,(i*j));
        		 
        	 }// ���� for
        	 System.out.printf("\n");
        }// �ٱ��� for
		
		
		

	}

}

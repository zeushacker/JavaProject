package com.day12.study;

/*   ��]
 *   
 *    1 ~ 100������ ���� ���ϵ�
 *    10�� ����� �ɶ����� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *    
 *    ��� ��� 
 *   
 *    1 ~ 10 ������ �հ� :
 *    1 ~ 20 ������ �հ� :
 *    1 ~ 30 ������ �հ� :
 * 
 *    1 ~ 100 ������ �հ� :
 */



public class Test001 {

	public static void main(String[] args) {
	
		int n=1, sum=0;
		
		while(n <=100) {
		
		   sum +=n;
		   if(n % 10 == 0) 
		   System.out.println("1 ���� "+n+"������ ������ �հ� :"+sum);
		   n++;
		
		}
		
	}

}

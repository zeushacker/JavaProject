package com.day14.study;

/*   1 ���� 100 ������ ���� ¦���� ���� ���Ͻÿ�
 *   ��, if ���ǹ��� ������� ����
 *   while ������ �̿��Ͽ� �����Ͻÿ�.  
 */

public class WhileEx002 {

	public static void main(String[] args) {
		/*
		 * int n=2, sum = 0;
		 * 
		 * while(n <=100) { sum += n; n+=2; }
		 * 
		 * System.out.println("1 ~ 100������ ���� ¦���� �հ� :"+sum);
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

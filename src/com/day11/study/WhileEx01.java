package com.day11.study;

/*  ��]
 *    1���� 100 ������ ������ ��, ¦���� ��, Ȧ���� ���� ���Ͻÿ�.
 *    ��, �ݺ����� while ������ �����Ѵ�.
 */

public class WhileEx01 {

	public static void main(String[] args) {

		// ���� ����
		// ������ : sum, ¦���� ��: even, Ȧ���� �� :odd
		// n : 1 ~ 100 ������ ���� ����
		int n=1, sum=0, even=0, odd=0;
		//sum=even=odd=0;
		/* while(n <=100) */ 
	/*	do{
			sum += n;// ������ : sum
			
			if(n % 2 ==0)
				even +=n;// ¦���� ��
			else
				odd +=n;// Ȧ���� ��
			
			n++;
		}while(n <=100);
		
		// ������
		System.out.println("1 ���� 100������ ������ �հ� :"+sum);
		System.out.println("1 ���� 100������ ¦���� �հ� :"+even);
		System.out.println("1 ���� 100������ Ȧ���� �հ� :"+odd);
		*/
		System.out.println("==========================");
		for(n= 0; n<=100; n++) {
             sum += n;// ������ : sum
			if(n % 2 ==0)
				even +=n;// ¦���� ��
			else
				odd +=n;// Ȧ���� ��
			
		}
		
		System.out.println("1 ���� 100������ ������ �հ� :"+sum);
		System.out.println("1 ���� 100������ ¦���� �հ� :"+even);
		System.out.println("1 ���� 100������ Ȧ���� �հ� :"+odd);
		
		
	}

}

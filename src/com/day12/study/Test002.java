package com.day12.study;

/*   ��]
 *       1/2 + 2/3 + 3/4+ .........9/10 ������ ���������Ͻÿ�.
 */

public class Test002 {

	public static void main(String[] args) {
		
		int n = 0;
		// 1 ���� 1�� �����ϰ� �� ����
		double sum = 0;
		// ������ ���� ������ ����(�Ǽ����·�)
		
		while(n < 9) {
			//�����
			sum += (double)(n+1)/(n+2);
			//����
			n++;
		}
		// ��� ���
		 System.out.printf("���� ��� :%f",sum);
		
	}

}

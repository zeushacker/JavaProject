package com.day15.study;

/*   ��]
 *     1 ���� n������ ���߿��� 5000�� ���� �ʴ�  ���� ū �հ� �׶��� n
 *     ���� ����ϴ� ���α׷��� �����Ͻÿ�.
 */
public class Test004 {
	 
	public static void main(String[] args) {
		
		int i = 0, sum =0; 
		int limit = 5000;
		do {
			sum += ++i;
		
			
		}while(sum <=limit);
	
		System.out.printf("1���� n������ ���߿��� %d�� ���� �ʴ� ���� ū ���� ?\n", limit);
		System.out.printf("1���� %d������ ���� %d �Դϴ�.\n", i-1, sum-i);
		
	}

}

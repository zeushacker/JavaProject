package com.day17.study;

/* �����迭(�����迭) 
 *   - �ุ�� �����Ѵ�.(1����)
 *   - ���� ���� �ٲ�鼭 �޸𸮸� �Ҵ���
 *   
 */

public class ArrayExam04 {

	public static void main(String[] args) {
	
	//	int arr[][] = new int[4][];
		int arr[][] = {
				              {100,100,100},
		                      {30,40},
		                      {80,80,70,100},
		                      {90}
		                      };
		/*
		 * arr[0] = new int[2]; arr[1] = new int[2]; arr[2] = new int[5]; arr[3] = new
		 * int[3];
		 */
		int sum = 0;
		float avg =0;
		
		for(int i = 0; i<arr.length; i++) {// ��
			for(int value : arr[i]) {// �࿡ �ش��ϴ� ��
				System.out.print(value+"  ");
				sum += value;// ���࿡ ���� ����
			}
			
			avg = (float)sum/arr[i].length; // �� �࿡���� ���
			
			System.out.printf("����:%d, ���:%.2f \n", sum, avg);
			
			// ���� �ٲ�鼭 ������ �ʱ�ȭ��
			sum = 0;
		}
	
	}

}

package com.day17.study;

/*   1 2 3 4 5
 *   6 7 8 9 10
 *   11 12 13 14 15
 *   16 17 18 19 20
 *   21 22 23 24 25
 */

public class ArrayExam02 {

	public static void main(String[] args) {
		
		// �迭 ����
		int arr[][];
		
		// �迭�� �޸��Ҵ�
		arr = new int[5][5];
		
		int n =1,i,j;// �ʱ�ȭ arr[0][0] = 1
		
		// �迭�� �� ����
		for(i=0; i<arr.length;i++) {// ��
			for(j =0; j<arr[i].length; j++) {//��
				arr[i][j] = n;
				n++;
				//arr[i][j] = n+j;
				//n++;
				
			}
			//n=i+2;
		//	n++;
		}
		System.out.println();
		
		// �迭�� ����� �� ���
		for(i=0; i<arr.length;i++) {// ��
			for(j =0; j<arr[i].length; j++) {//��
		        System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	
	}

}

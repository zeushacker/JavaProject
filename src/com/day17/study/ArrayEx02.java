package com.day17.study;

/*  ��] 
 *    ������ ���ڰ� ����ִ� �迭�� ���� �����͵� �� 
 *    �迭�� ��ü��Ҹ� ���
 *    ¦���� ��Ҹ� ��� ���
 *    3�� ����� ��Ҹ� ��� ����ϴ� ���α׷��� ���
 *   
 *    ������ ���� = 4 7 9 1 3 2 5 6 8
 * 
 */
public class ArrayEx02 {

	public static void main(String[] args) {

		 int arr[] = {4,7, 9, 1, 3, 2 ,5, 6, 8};
		
		 //System.out.println(arr);
		 /*  �Ϲ����� ������ ����� ������ ����ϴ� ����̴�.
		  *  �迭��  ����� �����͸� ����� �� ����.
		  */
		 
		 // �迭�� ���̸� Ȯ��
		 System.out.println(arr.length);
		
		 // �迭�� ����� ���� ���
			System.out.println("�迭�� ��ü ���  ");
		 for(int i =0; i<arr.length;i++) {
			 System.out.printf("%2d", arr[i]);
		 }
		System.out.println();
		
		System.out.println("�迭�� �����  ¦�� ��� ");
		 for(int i =0; i<arr.length;i++) {
			 if(arr[i]% 2 == 0) 
				 System.out.printf("%2d", arr[i]);
		}
		 System.out.println();
		 System.out.println("�迭�� �����  3�� ��� ��� ");
		 for(int i =0; i<arr.length;i++) {
			 if(arr[i]% 3 == 0) 
				 System.out.printf("%2d", arr[i]);
		}
		

	}

}

package com.day16.study;

import java.util.Scanner;

/*    ��] 
 *    ����ڷ� ���� ������ ������ ������ ������ŭ
 *    �Է¹޾� �Է¹��� �� �߿��� ���� ū ���� ����ϴ� ���α׷��� �����Ͻÿ�.
 *    
 *    ��, �迭�� Ȱ��
 *    
 *    ex)
 *     �Է��� ������ ����: 9
 *     ������ �Է� : 4 7 9 1 3 2 5 6 8
 *     ���� ū �� ==> 9
 *     
 */

public class ArrayExam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n,i, max=0; // �Է� ������ ���� ����
		
		System.out.print("�Է��� ������ ����:");
		n = sc.nextInt();
		
		// �Է¹��� ������ ������ŭ �迭�� ũ�⸦ �����Ѵ�.
		int[] arr = new int[n];
		
		System.out.print("������ �Է� :");
		for(i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(i=0; i<arr.length; i++) {
		
			if(arr[i] > max)  // max ���� ū�� ����
				max = arr[i];
		}
		
		System.out.println("�迭�� ����� ���� ū �� == >"+max);
		
	}

}

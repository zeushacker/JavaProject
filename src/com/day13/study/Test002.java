package com.day13.study;

import java.util.Scanner;

/*
 *  ��]
 *     3�� �¼��� �Է¹޾� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *     
 *     
 * 
 */


public class Test002 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n, i, sum = 1;
		System.out.print("���� �Է�:");
		n = sc.nextInt();
		
		for(i =1; i<=n; i++)
			sum *= 3;
		
		
		System.out.println("3��  "+n+"����"+sum+"�Դϴ�.");
	}

}

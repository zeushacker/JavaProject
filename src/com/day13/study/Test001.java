package com.day13.study;

/*  ��]
 *   ������ ������ �Է¹޾� �Է¹��� ������ ���丮���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *   ��,  for���� ���
 *   ���丮�� ���ϴ� ����: 1* 2* 3 *4 .... n
 */

import java.util.*;
public class Test001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, i, sum = 1;
		System.out.print("���� �Է�:");
		n = sc.nextInt();
		i =1;
		/*
		for(i =1; i<=n;i++)
			sum *= i;
		
		while(i<=n)
		{
			sum *= i;
			i++;
		}
		*/
		
		
		do
		{
			sum *= i;
			i++;
		}while(i<=n);
		
		System.out.println(n+"�� ���丮���� "+sum+"�Դϴ�.");
		
		
		

	}

}






package com.day03.study;

import java.util.Scanner;

public class Test002 {

	public static void main(String[] args) {
		 // �簢���� ���̿�  �ѷ��� ���ϴ� ���α׷��� �����Ͻÿ�. 
		// ���̿��� : ���� * ����
		 // �ѷ����� : 2 *(���� + ����) 
		//  ��, ���ο� ���δ� Ű����� �Է¹���
		  
		Scanner sc = new Scanner(System.in);
		int a, b, c, d;
		System.out.print("������ ���� �Է�:");
		a = sc.nextInt();
		System.out.print("������ ���� �Է�:");
		b = sc.nextInt();
		
		// �簢���� ����
		c = a * b;
		// �簢���� �ѷ�
		d = 2 * (a+b);
		
		//System.out.println("�簢���� ����:"+c);
		System.out.printf(" %d * %d = %d\n",a, b, c);
		System.out.println("�簢���� �ѷ�:"+d);
		
		
		
		
		
		

	}

}

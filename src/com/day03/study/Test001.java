package com.day03.study;

import java.util.Scanner;

public class Test001 {

	public static void main(String[] args) {
		// ��� ������ : +,-,*,/,%
		
		// 1. �ֿ� ��������
		int a,b, c,d, e, f, g;
		// a, b ���� Ű����� ���� �Է� �޴´�.
		// Scanner 
		Scanner sc = new Scanner(System.in);
		//a=10;
		//b=2;// �ΰ��� ������ ���� ����
		 
		// ����ڿ��� �ȳ� �޽��� ���
		// 2. ����ڰ� �Է��� �����͸� ������ ����
		System.out.print("ù��° ���� �Է�:");
		a = sc.nextInt();
		System.out.print("�ι�° ���� �Է�:");
		b = sc.nextInt();
		
	   c=	a+b;// ��������
	   d=a-b; //��������
	   e=a*b;// ��������
	   f=	a/b;// ����������
	   g=a%b;//������ ����
		
	   System.out.printf("%d + %d =%d%n", a, b, c);
	   System.out.printf("%d - %d =%d%n", a, b, d);
	   System.out.printf("%d * %d =%d%n", a, b, e);
	   System.out.printf("%d / %d =%d%n", a, b, f);
	   System.out.printf("%d %% %d =%d%n", a, b, g);
	   
	   
		/*
		 * 10 + 2 =12 10 - 2 =8 10 * 2 =20 10 / 2 =5 10 % 2 =0
		 */
		
	
	   
	   
	   
	   
	   
		

	}

}

package com.day07.study;

import java.util.Scanner;

public class Test003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b, c, imsi;
		
		System.out.print("ù��° ���� �Է�");
		a = sc.nextInt();
		
		System.out.print("�ι�° ���� �Է�");
		b = sc.nextInt();
		
		System.out.print("����° ���� �Է�");
		c = sc.nextInt();
		
		System.out.println("���� �� ��� :"+a+"  "+b+"  "+c);
		
		if( a > b) { //1. ù��° ������ �ι�° �������� ū���
			/*
			 * imsi = a; a = b; b = imsi;
			 */
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
		}
		 if( a > c){// 2. ù��° ������ ����° �������� ū ���
			/*
			 * imsi = a; a = c; c = imsi;
			 */
			a = a ^ c;
			c = c ^ a;
			a = a ^ c;
		
		
		} 
		if(b > c) { // 3. �ι�° ������ ����° �������� ū ���
			/*
			 * imsi = b; b = c; c = imsi;
			 */
			b = b ^ c;
			c = c ^ b;
			b = b ^ c;
		}
	// ��� 
		
		System.out.println();
		System.out.println("���� �� ��� :"+a+"  "+b+"  "+c);
		
		
		
	
	
		
		
		
		
		
		
		

	}

}

package com.day04.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*   ����ڷκ��� ������ ������  �ι� �Է¹޾� 
 *   ��Ģ���� �� ������ ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�
 *   
 *   ��, ������ �Է��� BufferedReader �� readLine()�� �����
 *   
 *   
 *   ù��° ���� : 10
 *   �ι��� ���� :2
 *   
 *   ��°��:
 *   ------------------------
 *   10 + 2 = 12
 *   10 - 2 = 8
 *   10 * 2 = 20
 *   10 / 2 = 5
 *   10 % 2 = 0
 */

public class Test003 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		

		//1. ���� ����
		int a, b, c, d, e, f, g;
	    char op;
		// �ȳ��޽��� ���
		System.out.print("ù��° ���� �Է�:");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("������ �Է� :");
		op =(char)System.in.read();
		System.in.read();
		System.in.read();
		
		System.out.print("�ι�° ���� �Է�:");
		b = Integer.parseInt(br.readLine());
		/*
		System.out.print("������ �Է� :");
		op =(char)System.in.read();
		*/
		
		
		// ����ó��   c:+, d:-, e:*, f:/, g:%
		
		
		c  = a + b;
		d  = a - b;
		e  = a * b;
		f  = a / b;
		g  = a % b;
		
		// ��� ���
		System.out.println("===== [ ���� ��� ] ======");
		System.out.printf("%d + %d = %d\n", a, b, c);  
		System.out.printf("%d - %d = %d\n", a, b, d);
		System.out.printf("%d * %d = %d\n", a, b, e);
		System.out.printf("%d / %d = %d\n", a, b, f);
		System.out.printf("%d %% %d = %d\n", a, b, g);
		

	}

}

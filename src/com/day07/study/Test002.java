package com.day07.study;

import java.util.Scanner;

/*   ����ڷ� ���� ������ �� ������ �Է¹޾� 
 *   �ش� �������� ó�� ����� ����ϴ� ���α׷��� �����Ͻÿ�.
 *    
 *   ��, if �����  �Է� : BufferedReader
 *   
 *   ���
 *    
 *    ù��° ���� : 10
        �ι�° ���� : 14
        ������ �Է� [+ - * / ] : +
       10 + 14 =24
       
*/
 
//import java.io.*;
public class Test002 {

	public static void main(String[] args) /* throws IOException */{
		
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int result = 0, num1, num2;
		char a;
		
		System.out.print("ù��° �����Է�:");
		num1 = sc.nextInt();
		//int num1 = Integer.parseInt(br.readLine());
		// �ƽ�Ű �ڵ�
		/*   ����Ű�� ������ ���Ͱ��� �Էµ�     �ƽ�Ű �ڵ� :13
		 *   ��Ű�� ������ �ƽ�Ű�ڵ� ���� �ԷµǸ�, ������ �ɶ� �ƽ�Ű �ڵ� �� 10���� ���� �Էµ�
		 */
	/*	
		System.in.read();
		System.in.read();
		*/
		//System.in.skip(2);
		System.out.print("�ι�° �����Է�:");
		num2 = sc.nextInt();
	//	int num2 = Integer.parseInt(br.readLine());
		System.out.print("�������Է� :");
		//op=(char)System.in.read(); 
		//char a =(char)System.in.read();
		a = sc.next().charAt(0);
		//String ch = sc.next();
		if( a == '+') {
			result = num1 + num2;
			//System.out.println(num1 +" "+a +" "+num2 +"="+result); 
		}else if( a == '-') {
			result = num1 - num2;
			//System.out.println(num1 +" "+a +" "+num2 +"="+result); 
		}else if( a == '*') {
			result = num1 * num2;
			//System.out.println(num1 +" "+a +" "+num2 +"="+result); 
		}else if( a == '/') {
			result = num1 / num2;
		//	System.out.println(num1 +" "+a +" "+num2 +"="+result); 
		}else {
			//System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�.");
		}
		//System.out.println(num1 +" "+a +" "+num2 +"="+result);
		System.out.printf("%d %c %d = %d\n",num1, a, num2, result);
	}

}

package com.day06.study;

import java.util.Scanner;

// Ű����� ���� ������ ������ �Է� �޾� ¦������ Ȧ�������� �����ϴ� ���α׷�
// �Է���  Scanner Ŭ�����α���

public class IfTest001 {

	public static void main(String[] args) {
		Scanner sc =new  Scanner(System.in);
		// 1. ��������
		 int n;		
		 String result ="";
		// 2. �ȳ��޽��� �� �Է� ����ó��
		System.out.print("������ �����Է�:");
		n = sc.nextInt();
		// 3. ����ó��
		/*
		  if(n % 2==0) 
			  result="¦��";
		  else
			  result ="Ȧ��";
	     */
		
		// ���� ����
		 result = n % 2==0 ? "¦��" : "Ȧ��";  			  
	
		 // 4. ������
		System.out.println("����� �Է��� ������ "+result+"�Դϴ�.");
		
	}

}

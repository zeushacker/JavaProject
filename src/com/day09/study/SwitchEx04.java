package com.day09.study;

import java.util.*;
public class SwitchEx04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ���� �Է� (1~5):");
		int n = sc.nextInt();
		
		switch(n) {
		
		case 1:
			System.out.println("��");
			//break;
		case 2:
			System.out.println("�ڡ�");
			//break;
		case 3:
			System.out.println("�ڡڡ�");
			//break;
		case 4:
			System.out.println("�ڡڡڡ�");
			//break;
		case 5:
			System.out.println("�ڡڡڡڡ�");
			break;
		default :
				System.out.println("�Է� ����!!!");
		}
		
	}

}

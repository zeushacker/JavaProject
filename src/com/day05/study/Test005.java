package com.day05.study;

import java.util.Scanner;

public class Test005 {

	public static void main(String[] args) {

        //  int a = 27; // Ȧ������ ¦������ �����ϴ� ���α׷�
	
		/*   Ű����� ���� �������� �Է¹޾� ���� ���� Ȧ������ ¦�������� �����ϴ� ���α׷� ���� */
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� :");
		int a = sc.nextInt();
		
		// Ȧ���� ¦���� ������ � ���� 2�� ������ �������� 0�̸� ¦�� 1�̸� Ȧ��
		if(a % 2 == 0) {
			System.out.println("¦��");
		}else {
			System.out.println("Ȧ��");
		}
	}

}

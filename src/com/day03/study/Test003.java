package com.day03.study;

import java.util.Scanner;

/*
 *   ��] Ű����� ���� ����, ����, ���� ������ �Է¹޾�
 *        ������ ���ϴ� ���α׷��� �����Ͻÿ�.
 */

public class Test003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		// ��������
		int kor, eng, mat, sum = 0;
				
		// �Է� �ȳ� �޽��� ���
		System.out.print("�������� :");
		kor= sc.nextInt();
		System.out.print("�������� :");
		eng = sc.nextInt();
		System.out.print("�������� :");
		mat = sc.nextInt();
		
		// ������ ���ϴ½�
		sum = kor + eng + mat;
		
		System.out.printf("�� ���� ������ �������� %d, �������� %d,"
				+ " �������� %d�̸�\n",	kor, eng, mat);
		System.out.printf("����� ������ %d �Դϴ�.\n", sum);

	}

}

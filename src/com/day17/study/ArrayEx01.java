package com.day17.study;

import java.util.Scanner;

/*  ó�� �Է¹��� �ο��� ��ŭ�� �л� �̸��� ��ȭ��ȣ�� �Է¹ް�
 *  �Է¹��� ���� ��ü�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *  
 *  ��, �迭�̿�
 *  
 *  ex)
 *  �Է� ó���� �л���(��): 3
 *  �̸� ��ȭ��ȣ �Է�(1)[���鱸��] : ȫ�浿 010-1234-1234
 *  �̸� ��ȭ��ȣ �Է�(2)[���鱸��] : ȫ�浿 010-1234-1234
 *  �̸� ��ȭ��ȣ �Է�(3)[���鱸��] : ȫ�浿 010-1234-1234
 */


public class ArrayEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i;// �ο����� ������ ����
		
		System.out.print("�Է� ó���� �л���(��):");
		n= sc.nextInt();// �л��ο���
		
		String[] name = new String[n];// �л��� �̸����庯��
		String[] phone = new String[n];// �л��� ��ȭ��ȣ ���庯��
		
		for(i = 0; i <name.length;i++) {
			System.out.print("�̸� ��ȭ��ȣ �Է�("+(i+1)+")[���鱸��]");
			name[i] = sc.next();
			phone[i] = sc.next();
		}
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println("          ��ü    �л��� :"+n+" ��");
		System.out.println("---------------------------------------");
		System.out.println(" �̸�                 ��ȭ��ȣ               ");
		System.out.println("---------------------------------------");
		for(i = 0; i <name.length;i++) {
			System.out.println(name[i]+"                 "+phone[i]);
		}
		System.out.println("---------------------------------------");
		
	}

}

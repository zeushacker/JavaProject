package com.day09.study;

import java.io.*;
public class SwitchEx01 {

	public static void main(String[] args) throws IOException{
		// Ű����� �Է� ����
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		// 1. ���� ����
		String name, grade="";
		int kor, eng, mat, sum =0;
		float avg;
		
		
		// 2. �ȳ��޽��� �� �ڷ� �Է�
		System.out.print("�̸� �Է�:");
		name=br.readLine();
		System.out.print("��������:");
		kor = Integer.parseInt(br.readLine());
		System.out.print("��������:");
		eng = Integer.parseInt(br.readLine());
		System.out.print("��������:");
		mat = Integer.parseInt(br.readLine());
		
		// ���ǿ� �ü� �ִ� �ڷ��� : ������, ������(char)
		// �������� �ü� ���� �ڷ��� : ���ڿ�, boolean, float, double���� ���Ұ�
		
		// ������ ����
		sum = kor + eng + mat;
		
		// ������ �̿��Ͽ� ����� ����
		avg = sum /3.f;
		System.out.println(" ���� :"+sum +", ���:"+(int)(avg) );
			
		//switch(���Ĺ� ����) case ���
		// case �� �ڿ� break�� 
		// ��� ó�� �� ����
		switch((int)(avg/10)) {// ���� �� ����
		case 10:
		case 9 :
			grade="A";
			
		//System.out.println("A");
		break;
		case 8 :
			grade="B";
			//System.out.println("B");
			break;
		case 7 :
			//System.out.println("C");
			grade="C";
			break;
		case 6 :
			grade="D";
			//System.out.println("D");
			break;
		default :
			grade="F";
		//	System.out.println("F");
			break;
		}
		System.out.println("�̸��� "+name+"�̰� ������ "+grade+"�Դϴ�.");
	}

}

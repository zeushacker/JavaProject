package com.day06.study;
/*
 *    ����ڷ� ���� ������ �⵵�� �Է¹޾�
 *     �Է� ���� �⵵�� �������� ��������� �����ϴ� ���α׷��� �����Ͻÿ�.
 *     
 *     ������ �Ǻ� ���� 
 *     
 *     - �Է¹��� �⵵��4�� ��� �̸鼭 100�� ����� �ƴϰų�
 *       400�� ����̸� ����  �ƴϸ� ����� 
 *       
 *       ��, �Է��� BufferedReader
 *            ������ ���� �����ڷ� ó���Ͻÿ�. 
 */

import java.io.*;
public class IfTest003 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int year;
		String result;
		
		System.out.print("������ �⵵ �Է�:");
		year = Integer.parseInt(br.readLine());
		
		// ���� �Ǻ� ����
		
		result = (year % 4 == 0 ) && (year % 100 != 0) ||(year % 400 ==0) ? "����" : "���";
		/*
		if((year % 4 == 0 ) && (year % 100 != 0) ||(year % 400 ==0))
			System.out.println(year+"====>����");
		else 
			System.out.println(year+"====>���");
		*/
		System.out.println("�⵵��"+result+"�Դϴ�." );
	}

}

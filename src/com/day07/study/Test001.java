package com.day07.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 *    ����ڷ� ���� ������ ������ �Է¹޾� 
 *    �Է¹��� ������ 2�� ������� 3�� �������, �Ǵ� 2�� 3�� �������
 *    �ƴ����� �����ϴ� ���α׷��� �����Ͻÿ�.
 *    
 *    �Է��� BufferedReader
 */
import java.io.*;
public class Test001 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ ���� �Է�:");
		int n = Integer.parseInt(br.readLine());
		
		if((n % 2 ==0) && (n % 3 ==0)) 
			System.out.println("2 �� 3�� ���");
		else if(n % 2 ==0) 
			System.out.println("2 �� ���");
		else if(n % 3 ==0) 
			System.out.println("3 �� ���");
		else 
			System.out.println("2�� 3�� ��� �ƴ�...");
	}
}

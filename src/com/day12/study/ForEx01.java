package com.day12.study;

import java.util.Scanner;

/*  ��] 
 *   ���� ������ �Է¹޾� �Է¹��� ���� ����� ���Ͽ���
 *    ��, ���� ������ �Է��ϸ� ��� , for�� ���
 *   
 */


public class ForEx01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum=0, input=0;
		int cnt = 0;
		
		for(   ; input >=0;   ) 
		{
			sum += input;
			System.out.print("���� ���� �Է�:");
			input = sc.nextInt();
			cnt++;
		}
		System.out.println("���ݱ��� �Է��� ���� ���� ��� :"+(int)(sum/cnt));
		
	}
	
}

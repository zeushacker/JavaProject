package com.day06.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*        ����ڷκ��� ������ ������ �Է¹޾� 
 *        �Է¹��� ������ �������, ��������, 0������ �����ϴ� 
 *        ���α׷��� �����Ͻÿ�.
 *       
 *       ��, �Է��� BufferedReader�� ó���Ͻÿ�.
 */

public class IfTest002 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br  = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int n;
		String result;
	        
			System.out.print("������ ���� �Է�:");
			n = Integer.parseInt(br.readLine());
			
			result = (  n < 0  ) ? "����"  :((n == 0) ? "��" : "���");
		
			System.out.println(n+"=====>   "+result);
			
	     
	}

}

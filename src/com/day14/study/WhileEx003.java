package com.day14.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*  ��]
 *      ����ڷκ��� ������ ������ �Է¹޾�
 *      �Է¹��� ������ �Ҽ����� �ƴ����� �����ϴ�
 *      ���α׷��� �����Ͻÿ�.
 *      
 *    �Ҽ�: 1�Ǵ� �ڽ��� �� �̿��� ����ε� ���� ������ ��
 *    �Է��� BufferedReader 
 *    
 *    
 *    1�� �Ҽ��� �ƴϴ�
 *    �Է°��� 1�� �ڱ� �ڽ��� ���� ������
 *     �� ������ ������ ���� ������ ������ �ϰ�
 *     ������ �������� �������� ������
 *    
 *    17 (2 ~ 16������ ���� ���� ��������)
 */

public class WhileEx003 {

	public static void main(String[] args) throws IOException{
		
	BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		// ��������
	    int num, i=2;
	    
	    System.out.print("�����Է�:");
	    num =Integer.parseInt(br.readLine());
		/*
		boolean flag = true; // �Ҽ�
		
		while( i <num) {
			if(num % i == 0)
				flag =false;// �Ҽ��� �ƴϴ�.
			i++;
		}
		
		// �Է°��� 1������ ���ε� �Բ� Ȯ���Ѵ�.
		if(flag && num != 1) 
			System.out.println(num +"==>�Ҽ�");
		else 
			System.out.println(num +"==>�Ҽ��� �ƴϴ�.");
			
		*/
	    
	    i=1;
	    
	    while(i < num) {
	    	i++;
	    	if(num % i ==0)
	    		break;
	    }
	    
	    if(i != num || num == 1) {
	    	System.out.println(num+" �Ҽ��� �ƴϴ�.");
	    }else {
	    	System.out.println(num+" �Ҽ���.");
	    }
	    
	}

}

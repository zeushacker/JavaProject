package com.day04.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*  ����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
 *  ������ ����� ���ϴ� ���α׷��� ����Ͻÿ�.
 *  
 *  ����� �Ǽ������� ����� ������ 2�ڸ����� ���
 *  
 *  ��, �̸��� ������ BufferedReader Ŭ������ ����Ͻÿ�.
 */

public class Test002 {

	public static void main(String[] args) throws IOException{
		// BufferedReader ��ü(�ν��Ͻ�)����
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		/*  '��' ��� ���ڸ� BufferedReader�� ���� �Է¹��� ���
		 *   2����Ʈ�� �����Ǿ� �ֱ� ������ 1����Ʈ�� �ɰ���.
		 *     InputStreamReader �� ����Ʈ ��Ʈ���� 
		 *     ���� ��Ʈ������ ��ȯ���� �ִ� ������ �ϰ� ��
		  */
		// �ֿ� ���� ����
		int kor, eng, mat, tot=0;
		float avg=0.0f;
		String name;
		
		System.out.print("�̸� �Է� :");
		name = br.readLine();
		
		System.out.print("��������:");
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("��������:");
		eng = Integer.parseInt(br.readLine());
		
		System.out.print("��������:");
		mat = Integer.parseInt(br.readLine());
		
		// ������ ����
		
		tot = kor + eng + mat;
		
		// ����� ����
		
		avg = tot /3;
		

		// ��� ���
		System.out.printf("�̸� :%s , ����:%d, ����:%d, ����: %d, ����:%d\n", name, kor, eng, mat, tot);
		System.out.printf("��� : %.2f\n", avg);
		
		
	}

}

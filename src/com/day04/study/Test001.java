package com.day04.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*   
 *    ����ڷ� ���� �غ��� ���̸�  �Է¹޾� 
 *    �ﰢ���� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 *     ���� ���ϴ� ���� : ���� *  �غ�  / 2
 *       
 *    �غ� : 20, ���� : 15
 *    �Է� ��� : Scanner Ŭ���� ���
 *    
 */

//import java.util.Scanner;



public class Test001 {

	public static void main(String[] args) throws IOException{

	//	Scanner sc = new Scanner(System.in);
	
	// 1. �ֿ� ���� ����
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		// ���ڿ��� �Է¹��� ���� 
		String name = br.readLine();
		
		
		int   w, h;           // �غ��� ���̸� ������ ����
		double  result;     // ����� ������ ����
			
		// 2. �Է� �ȳ��޽��� �� ������ �Է� 
		System.out.print("�ﰢ���� �غ� �Է�:");
		//w = sc.nextInt();
		w = Integer.parseInt(br.readLine());
		System.out.print("�ﰢ���� ���� �Է�:");
		//h = sc.nextInt();
		h = Integer.parseInt(br.readLine());
		// 3. ������� �� ó��
		
		result = w * h / 2.0;
		// �Ǽ������� ��� ���� ���ü� �ֵ��� �Ǽ��� ����� ������ �ʿ��� ��Ȳ
		// �̶� ���� 2�� �ƴ� 2.0���� �Ǽ� ������ ó���ϸ� ��
	
		// 4. ��� ���
		System.out.println("�ﰢ���� ���� :"+result);
		
		
	}

}

package com.day12.study;

import java.util.Scanner;

/*   ��]
 *      �� ���� ������ �Է¹޾� �� ���̿� �����ϴ� �������� �հ踦 ���ϴ� 
 *      ���α׷��� �����Ͻÿ�.
 *      
 *      ù��° ���� : 3
 *      �ι�° ���� : 5
 *      
 *       3+4+5 = 
 * 
 * 
 * 
 */



public class ForEx03 {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		
		int n1, n2, sum = 0;
		System.out.print("ù��° ���� �Է�:");
		n1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է�:");
		n2 = sc.nextInt();
		
		if( n1 > n2) {
			n1 = n1 ^ n2;
			n2 = n2 ^ n1;
			n1 = n1 ^ n2;
		}
		
		for(int i =n1; i<=n2; i++)
			sum +=i;
		
		System.out.println("�Է��� �� ���� ������ �հ�:"+sum);
	}

}

package com.day12.study;

import java.util.Scanner;

/*   ������ ������ �Է¹޾� �Է¹��� ����ŭ 3�� ����� ����ϴ� ���α׷��� �����Ͻÿ�.
 *   
 *     5
 *     3 6 9 12 15
 * 
 */
public class Test003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, i =1;
		
		System.out.print("�����Է�:");
		num = sc.nextInt();
		
		System.out.println("�Է��Ͻ� ����ŭ 3�� ����� ����մϴ�.");
		
		while(i<=num) {
					System.out.print(i*3+"\t");	
			i++;		
		}
		
		

	}

}

package com.day12.study;

import java.util.Scanner;

/*  ���Ѵ�� �� ������ �Է¹޾� ���� ���ϴ� ���α׷��� �����Ͻÿ�.
 *   for ���̿�  0�� �Է��ϸ� �׸�
 */

public class ForEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		
		for(;;) {
			System.out.print("ù��° ���� �Է�:");
			n1 = sc.nextInt();
			if( n1 == 0 )
				break;
			System.out.print("�ι�° ���� �Է�:");
			n2 = sc.nextInt();
			
		   System.out.printf("%d + %d = %d\n", n1, n2, (n1+n2));
		}
	}

}

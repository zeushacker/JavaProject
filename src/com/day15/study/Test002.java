package com.day15.study;

/*  ��]
 *       1 ���� 100������ ���� �߿��� 2,3,5,7�� ����� ������ ���� �� �࿡ 
 *       10���� ����ϴ� ���α׷��� �����Ͻÿ�.
 */


public class Test002 {

	public static void main(String[] args) {
		
		int cnt=1, i;
		
		for(i =1; i<=100; i++) {
			if((i%2 !=0) && (i%3 !=0) &&(i%5 !=0) &&(i%7 !=0))
				System.out.printf("%3d%c", i, (cnt++ % 10 !=0) ? ' ':'\n');
		}
		System.out.println();
			
	}

}

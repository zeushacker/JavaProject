package com.day05.study;

public class Test001 {

	public static void main(String[] args) {
		
		int a = 13, b = 7;
		//��Ʈ �����ڷ� ���
		
		// �������� �������� ��ȯ
		// ��Ʈ��Ʈ �� �� �����ڷ� �Ի�
		
		int c, d, e;
		c = a  & b;
		d = a  |  b;
		e = a  ^ b;
		
		System.out.printf("a & b :%d\n", c);
		System.out.printf("%d & %d : %d\n", a, b, c);
		System.out.println(c+","+d+","+e);
		
		System.out.printf("a | b :%d\n", d);
		System.out.printf("a ^ b :%d\n", e);
		
		System.out.printf("a & b : %d, a | ");
		
		
	}

}

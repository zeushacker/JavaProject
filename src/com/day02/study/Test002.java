package com.day02.study;

public class Test002 {

	public static void main(String[] args) {
		
		// �������� �� �ʱ�ȭ(�޸� �� �Ҵ�)
		int a =10, b = 5;
		// ���� ����� ������ �Է½� �ڷ����� �´� ���� �����ؾ���
		
		// ���� ����
		int c, d;
		//      =(���Կ�����)
		c = a + b; // a+b�� ������� c�� �����Ͽ���.
		d = a - b;  // a-b�� ������� d�� �����Ͽ���.
		
		System.out.println(a+" + "+b +" = "+c);
		System.out.println(a+" - "+b +" = "+d);
		
		System.out.printf("%d + %d = %d\n", a, b, c);
		System.out.format("%d - %d = %d%n", a, b, d);
	
		for(int i =0; i<=10; i++) {
			System.out.println("LOVE");
		}
		
		String[] aa = {"���","���","���","���","���"};
		
		for(String aaa : aa) {
			System.out.println(aaa);
		}
		
		
		
		
		

	}

}

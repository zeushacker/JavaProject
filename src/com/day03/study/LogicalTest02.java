package com.day03.study;

public class LogicalTest02 {
// �������� and, or, not
	public static void main(String[] args) {
		
		boolean a = false;
		boolean b = false;
		
		//���ǹ� if(���ǽ�) 
		if((a = 4 > 3) || ( b = 5 > 7)) {//���� ���
			// ������ ���� ��� ������ ������ �����
			System.out.printf("a :%b\n",a);
			System.out.printf("b :%b\n",b);
		}
	}
}

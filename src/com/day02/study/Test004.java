package com.day02.study;

// ���� ������ �ʱⰪ ����

public class Test004 {

	static int a;
	// Ŭ���������� ������ �߻����� ����
	// �� : Ŭ���������� ����� ���ÿ� �ڵ����� 0���� �ʱ�ȭ�� �̷����
	
	public void add() {// �Ϲ� �޼ҵ�
	      int a, b;// ������ ����
	     // ���� ����
	      a = 30;
	System.out.println(a);
	// ���������� �ʱ�ȭ ���� �ʰ� ����ϸ� ������ �߻���
	// ���������� �ʱ�ȭ�� �ؾ���
	}
	
	public static void main(String[] args) {// ���� �޼ҵ� 
		
       int a;
		a = 20;
		
		/* �Ϲ� �޼ҵ忡 ����Ǿ� �ִ� ���������� �����ϰ����Ҷ��� ��ü�� �����ؾ��Ѵ�.
		     ��ü�� �����ϴ� ���
		     Ŭ������   ��ü�� = new �������Լ�()
		     ������ �Լ� : Ŭ�������� �̿��Ͽ� �Լ��� ������ �� ����
		   
		  */
		Test004 dd = new Test004();
	//  Ŭ������   ��ü��          ������ �Լ�
		dd.add();
		System.out.println(a);
		System.out.println(Test004.a);
		System.out.println(dd.a);
		
		// int : 4byte
		short c;// 2byte
		// ��������ȯ(����� ����ȯ)
		c =(short)a;
		// 4����Ʈ ������ 2����Ʈ�� short������ ���� ��ȯ�� ������
		
		boolean t = true;
		boolean tt;
	
		int cc =10, ee = 5;
		
		tt = cc < ee; // 10 < 5
		
		
		System.out.println(t);
	    System.out.println(tt);
		
		
	}

}

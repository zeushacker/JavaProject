package com.day01.study;

/*   ���� 
 *    - �����͸� �����ϴ� �����
 *    - �޸��� �� �����̴�.
 *    int a =20 : �����ڸ� �߽����� �������� ���� ���ʿ� �Ҵ��Ѵ�.
 *    - �ڹ��� ������ ������ Ÿ��(�ڷ���)�� �Բ� �����ϰ� �ʱ�ȭ �� �� ���
 *    - ������ Ÿ�� ������ ������ �̸��� ��� �����Ѵ�.
 */






class Add {// ���ϱ�

      static int a;
	
	
	public void add() {
	
		int d;
		
		int a, b, c;
		a =10; b=20;
		c = a + b;
		System.out.printf("%d + %d = %d", a, b, c);
		
	}
	
}


class Sub { //����
	
	public void sub() {
		int a, b, c;
		a =10; b=20;
		c = a - b;
		System.out.printf("%d - %d = %d", a, b, c);
		
	}
	
}

class Mul { //����
	
	public void mul() {
		int a, b, c;
		a =10; b=20;
		c = a * b;
		System.out.printf("%d * %d = %7.3f%n", a, b, c);
		
	}
	
}

class Div { //������
	
	public void div() {
		int a, b, c;
		a =10; b=20;
		c = a / b;
		System.out.printf("%d / %d = %d", a, b, c);
		
	}
	
}
public class Variable {// ����
	
	public static void main(String[] args) {
		
		Add a = new Add();
		a.add();// ���ϱ�a
		System.out.println();
		Div d = new Div();
		d.div();
		System.out.println();
		
		System.out.println(Add.a);
		System.out.println(Add.a);
	}

}

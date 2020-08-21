package com.day01.study;

/*   변수 
 *    - 데이터를 보관하는 저장소
 *    - 메모리의 한 공간이다.
 *    int a =20 : 연산자를 중심으로 오른쪽의 값의 왼쪽에 할당한다.
 *    - 자바의 변수는 데이터 타입(자료형)과 함께 선언하고 초기화 한 후 사용
 *    - 변수의 타입 다음에 변수의 이름을 적어서 선언한다.
 */






class Add {// 더하기

      static int a;
	
	
	public void add() {
	
		int d;
		
		int a, b, c;
		a =10; b=20;
		c = a + b;
		System.out.printf("%d + %d = %d", a, b, c);
		
	}
	
}


class Sub { //빼기
	
	public void sub() {
		int a, b, c;
		a =10; b=20;
		c = a - b;
		System.out.printf("%d - %d = %d", a, b, c);
		
	}
	
}

class Mul { //곱셈
	
	public void mul() {
		int a, b, c;
		a =10; b=20;
		c = a * b;
		System.out.printf("%d * %d = %7.3f%n", a, b, c);
		
	}
	
}

class Div { //나누기
	
	public void div() {
		int a, b, c;
		a =10; b=20;
		c = a / b;
		System.out.printf("%d / %d = %d", a, b, c);
		
	}
	
}
public class Variable {// 계산기
	
	public static void main(String[] args) {
		
		Add a = new Add();
		a.add();// 더하기a
		System.out.println();
		Div d = new Div();
		d.div();
		System.out.println();
		
		System.out.println(Add.a);
		System.out.println(Add.a);
	}

}

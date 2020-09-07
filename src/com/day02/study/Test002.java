package com.day02.study;

public class Test002 {

	public static void main(String[] args) {
		
		// 변수선언 및 초기화(메모리 값 할당)
		int a =10, b = 5;
		// 변수 선언및 데이터 입력시 자료형에 맞는 값을 지정해야함
		
		// 변수 선언
		int c, d;
		//      =(대입연산자)
		c = a + b; // a+b의 결과값을 c에 대입하여라.
		d = a - b;  // a-b의 결과값을 d에 대입하여라.
		
		System.out.println(a+" + "+b +" = "+c);
		System.out.println(a+" - "+b +" = "+d);
		
		System.out.printf("%d + %d = %d\n", a, b, c);
		System.out.format("%d - %d = %d%n", a, b, d);
	
		for(int i =0; i<=10; i++) {
			System.out.println("LOVE");
		}
		
		String[] aa = {"사랑","사랑","사랑","사랑","사랑"};
		
		for(String aaa : aa) {
			System.out.println(aaa);
		}
		
		
		
		
		

	}

}

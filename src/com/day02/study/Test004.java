package com.day02.study;

// 지역 변수와 초기값 선언

public class Test004 {

	static int a;
	// 클래스변수는 에러가 발생하지 않음
	// 왜 : 클래스변수는 선언과 동시에 자동으로 0으로 초기화가 이루어짐
	
	public void add() {// 일반 메소드
	      int a, b;// 변수의 선언
	     // 지역 변수
	      a = 30;
	System.out.println(a);
	// 지역변수는 초기화 하지 않고 사용하면 에러가 발생함
	// 지역변수는 초기화를 해야함
	}
	
	public static void main(String[] args) {// 메인 메소드 
		
       int a;
		a = 20;
		
		/* 일반 메소드에 선언되어 있는 지역변수를 접근하고자할때는 객체를 생성해야한다.
		     객체를 생성하는 방법
		     클래스명   객체명 = new 생성자함수()
		     생성자 함수 : 클래스명을 이용하여 함수를 지정할 수 있음
		   
		  */
		Test004 dd = new Test004();
	//  클래스명   객체명          생성자 함수
		dd.add();
		System.out.println(a);
		System.out.println(Test004.a);
		System.out.println(dd.a);
		
		// int : 4byte
		short c;// 2byte
		// 강제형변환(명시적 형변환)
		c =(short)a;
		// 4바이트 정수를 2바이트인 short형으로 먼저 변환후 대입함
		
		boolean t = true;
		boolean tt;
	
		int cc =10, ee = 5;
		
		tt = cc < ee; // 10 < 5
		
		
		System.out.println(t);
	    System.out.println(tt);
		
		
	}

}

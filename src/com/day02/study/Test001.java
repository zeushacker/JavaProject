package com.day02.study;

public class Test001 {

	public static void main(String[] args) {
		
		/*  ctrl + shift + / (전체 주석 지정)
		 *  ctrl + shift + \ (전체 주석 해제)
		 *  
		 * System.out.println(7); 
		 * System.out.println(3.15);
		 * System.out.println("3+5="+8+"입니다.");
		 */
		
	// 문자열을 사용할 경우 " "(더블쿼터)
	// 문자를 사용할 경우 '  '(싱글쿼터)
	// 상수값은 그대로 사용함
	// 여러개의 문자열과 매개변수 를 사용할 경우는 + 연결 기호를 사용함	
		
		int a = 10;
		// 변수의 선언과 초기화
		//int b;// 변수의 선언
		//b= 20; // 변수에 값을 대입했다.
		//System.out.println("a ="+a+", b ="+b);
     /*
		System.out.printf("a=%d, b=%d\n", a, b);
		
		int c = a+b;
		System.out.printf("%d + %d = %d\n", a, b, c);
		float f =3.14f;
		System.out.printf("f :%.2f%n", f);
	*/	
		//System.out.printf("우리나라\n");
		//System.out.print("우리나라");
		
		String name="홍길동";
		// 변수 선언시 특수문자 사용가능 $, _만 가능
		String _tel ="010-1234-1356";
		String address ="서울시 영등포구 영등포빌딩 5층";
		
		System.out.printf("나의 이름은 %s이고 \n", name);
		System.out.println("전화번호는 "+_tel+"이며");
		System.out.printf("주소는 %s 입니다.", address);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

package com.day16.study;

public class ArrayExam02 {

	public static void main(String[] args) {
		
		char[] ch;// 문자형 배열 선언
		ch = new char[4];
		
		// 배열에 값 저장  (JAVA)
		ch[0] ='J';
		ch[1] ='A';
		ch[2] ='V';
		//ch[3] ='A';
		
		// 배열 내용 출력
		/*
		System.out.print(ch[0]);
		System.out.print(ch[1]);
		System.out.print(ch[2]);
		System.out.println(ch[3]);
		*/
		for(int i = 0; i<4; i++)
			System.out.println("ch["+i+"]:"+(int)ch[i]);
		

	}

}

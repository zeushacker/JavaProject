package com.day03.study;

public class LogicalTest02 {
// 논리연산자 and, or, not
	public static void main(String[] args) {
		
		boolean a = false;
		boolean b = false;
		
		//조건문 if(조건식) 
		if((a = 4 > 3) || ( b = 5 > 7)) {//조건 기술
			// 조건이 참일 경우 수행할 문장을 기술함
			System.out.printf("a :%b\n",a);
			System.out.printf("b :%b\n",b);
		}
	}
}

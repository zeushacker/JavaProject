package com.day09.study;

import java.util.*;

public class SwitchEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		char op;
		// (a+b) = a+ b;
		System.out.print("첫번째  수 :");
		a = sc.nextInt();
		System.out.print("두번째  수 :");
		b = sc.nextInt();
		System.out.print("연산자 입력  :");
		op = sc.next().charAt(0);

		switch (op) {
		case '+':
			System.out.printf("%d + %d = %d\n", a, b, (a + b));
			break;
		case '-':
			System.out.printf("%d - %d = %d\n", a, b, (a - b));
			break;
		case '*':
			System.out.printf("%d * %d = %d\n", a, b, (a * b));
			break;
		case '/':
			System.out.printf("%d / %d = %d\n", a, b, (a / b));
			break;
		default:
			System.out.println("입력 오류");
			break;
		}
	}
}

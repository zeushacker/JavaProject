package com.day09.study;

import java.util.*;

public class SwitchEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		char op;
		// (a+b) = a+ b;
		System.out.print("ù��°  �� :");
		a = sc.nextInt();
		System.out.print("�ι�°  �� :");
		b = sc.nextInt();
		System.out.print("������ �Է�  :");
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
			System.out.println("�Է� ����");
			break;
		}
	}
}

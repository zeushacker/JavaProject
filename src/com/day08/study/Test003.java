package com.day08.study;
import java.io.*;
import java.util.Scanner;
public class Test003 {

	public static void main(String[] args) throws IOException{
	// 숫자 하나 입력 받기

		Scanner sc = new Scanner(System.in);
		
		sc.next();  // 문자열을 입력받음  , 공백 기준
		sc.nextLine();  //엔터 키 기준
		
		
		int num1;
		
		int num2;
		System.out.print("숫자 1 :");
		num1 = System.in.read()-48;
		System.in.read();
		System.in.read();
		System.out.print("숫자 2 :");
		num2 = System.in.read()-48;
		
		
		
		
		
		
	}

}

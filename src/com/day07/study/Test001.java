package com.day07.study;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 *    사용자로 부터 임의의 정수를 입력받아 
 *    입력받은 정수가 2의 배수인지 3의 배수인지, 또는 2와 3의 배수인지
 *    아닌지를 판정하는 프로그램을 구현하시오.
 *    
 *    입력은 BufferedReader
 */
import java.io.*;
public class Test001 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("임의의 정수 입력:");
		int n = Integer.parseInt(br.readLine());
		
		if((n % 2 ==0) && (n % 3 ==0)) 
			System.out.println("2 와 3의 배수");
		else if(n % 2 ==0) 
			System.out.println("2 의 배수");
		else if(n % 3 ==0) 
			System.out.println("3 의 배수");
		else 
			System.out.println("2와 3의 배수 아님...");
	}
}

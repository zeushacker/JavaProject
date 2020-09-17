package com.day07.study;

import java.util.Scanner;

/*   사용자로 부터 임의의 두 정수를 입력받아 
 *   해당 연산자의 처리 결과를 출력하는 프로그램을 구현하시오.
 *    
 *   단, if 문사용  입력 : BufferedReader
 *   
 *   결과
 *    
 *    첫번째 정수 : 10
        두번째 정수 : 14
        연산자 입력 [+ - * / ] : +
       10 + 14 =24
       
*/
 
//import java.io.*;
public class Test002 {

	public static void main(String[] args) /* throws IOException */{
		
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int result = 0, num1, num2;
		char a;
		
		System.out.print("첫번째 정수입력:");
		num1 = sc.nextInt();
		//int num1 = Integer.parseInt(br.readLine());
		// 아스키 코드
		/*   엔터키를 눌러도 엔터값이 입력됨     아스키 코드 :13
		 *   엔키를 누를때 아스키코드 값이 입력되며, 개행이 될때 아스키 코드 값 10번이 같이 입력됨
		 */
	/*	
		System.in.read();
		System.in.read();
		*/
		//System.in.skip(2);
		System.out.print("두번째 정수입력:");
		num2 = sc.nextInt();
	//	int num2 = Integer.parseInt(br.readLine());
		System.out.print("연산자입력 :");
		//op=(char)System.in.read(); 
		//char a =(char)System.in.read();
		a = sc.next().charAt(0);
		//String ch = sc.next();
		if( a == '+') {
			result = num1 + num2;
			//System.out.println(num1 +" "+a +" "+num2 +"="+result); 
		}else if( a == '-') {
			result = num1 - num2;
			//System.out.println(num1 +" "+a +" "+num2 +"="+result); 
		}else if( a == '*') {
			result = num1 * num2;
			//System.out.println(num1 +" "+a +" "+num2 +"="+result); 
		}else if( a == '/') {
			result = num1 / num2;
		//	System.out.println(num1 +" "+a +" "+num2 +"="+result); 
		}else {
			//System.out.println("연산자를 잘못 입력하셨습니다.");
		}
		//System.out.println(num1 +" "+a +" "+num2 +"="+result);
		System.out.printf("%d %c %d = %d\n",num1, a, num2, result);
	}

}

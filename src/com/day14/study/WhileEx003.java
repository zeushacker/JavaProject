package com.day14.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*  문]
 *      사용자로부터 임의의 정수를 입력받아
 *      입력받은 정수가 소수인지 아닌지를 판정하는
 *      프로그램을 구현하시오.
 *      
 *    소수: 1또는 자신의 값 이외의 어떤수로도 나눌 수없는 값
 *    입력은 BufferedReader 
 *    
 *    
 *    1은 소수가 아니다
 *    입력값을 1과 자기 자신의 값을 제외한
 *     그 사이의 정수를 통해 나눗셈 연산을 하고
 *     나누어 떨어지는 수인지를 판정함
 *    
 *    17 (2 ~ 16까지의 수를 통해 나눗셈함)
 */

public class WhileEx003 {

	public static void main(String[] args) throws IOException{
		
	BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		// 변수선언
	    int num, i=2;
	    
	    System.out.print("정수입력:");
	    num =Integer.parseInt(br.readLine());
		/*
		boolean flag = true; // 소수
		
		while( i <num) {
			if(num % i == 0)
				flag =false;// 소수가 아니다.
			i++;
		}
		
		// 입력값이 1인지의 여부도 함께 확인한다.
		if(flag && num != 1) 
			System.out.println(num +"==>소수");
		else 
			System.out.println(num +"==>소수가 아니다.");
			
		*/
	    
	    i=1;
	    
	    while(i < num) {
	    	i++;
	    	if(num % i ==0)
	    		break;
	    }
	    
	    if(i != num || num == 1) {
	    	System.out.println(num+" 소수가 아니다.");
	    }else {
	    	System.out.println(num+" 소수다.");
	    }
	    
	}

}

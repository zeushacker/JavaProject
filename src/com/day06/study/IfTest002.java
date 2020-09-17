package com.day06.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*        사용자로부터 임의의 정수를 입력받아 
 *        입력받은 정수가 양수인지, 음수인지, 0인지를 판정하는 
 *        프로그램을 구현하시오.
 *       
 *       단, 입력은 BufferedReader로 처리하시오.
 */

public class IfTest002 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br  = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int n;
		String result;
	        
			System.out.print("임의의 정수 입력:");
			n = Integer.parseInt(br.readLine());
			
			result = (  n < 0  ) ? "음수"  :((n == 0) ? "영" : "양수");
		
			System.out.println(n+"=====>   "+result);
			
	     
	}

}

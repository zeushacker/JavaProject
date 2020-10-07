package com.day17.study;

import java.util.Scanner;

/*  처음 입력받은 인원수 만큼의 학생 이름과 전화번호를 입력받고
 *  입력받은 내용 전체를 출력하는 프로그램을 작성하시오.
 *  
 *  단, 배열이용
 *  
 *  ex)
 *  입력 처리할 학생수(명): 3
 *  이름 전화번호 입력(1)[공백구분] : 홍길동 010-1234-1234
 *  이름 전화번호 입력(2)[공백구분] : 홍길동 010-1234-1234
 *  이름 전화번호 입력(3)[공백구분] : 홍길동 010-1234-1234
 */


public class ArrayEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i;// 인원수를 저장할 변수
		
		System.out.print("입력 처리할 학생수(명):");
		n= sc.nextInt();// 학생인원수
		
		String[] name = new String[n];// 학생별 이름저장변수
		String[] phone = new String[n];// 학생별 전화번호 저장변수
		
		for(i = 0; i <name.length;i++) {
			System.out.print("이름 전화번호 입력("+(i+1)+")[공백구분]");
			name[i] = sc.next();
			phone[i] = sc.next();
		}
		System.out.println();
		System.out.println("---------------------------------------");
		System.out.println("          전체    학생수 :"+n+" 명");
		System.out.println("---------------------------------------");
		System.out.println(" 이름                 전화번호               ");
		System.out.println("---------------------------------------");
		for(i = 0; i <name.length;i++) {
			System.out.println(name[i]+"                 "+phone[i]);
		}
		System.out.println("---------------------------------------");
		
	}

}

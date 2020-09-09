package com.day03.study;

import java.util.Scanner;

/*
 *   문] 키보드로 부터 국어, 영어, 수학 점수를 입력받아
 *        총점을 구하는 프로그램을 구현하시오.
 */

public class Test003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		// 변수선언
		int kor, eng, mat, sum = 0;
				
		// 입력 안내 메시지 출력
		System.out.print("국어점수 :");
		kor= sc.nextInt();
		System.out.print("영어점수 :");
		eng = sc.nextInt();
		System.out.print("수학점수 :");
		mat = sc.nextInt();
		
		// 총점을 구하는식
		sum = kor + eng + mat;
		
		System.out.printf("각 과목별 점수는 국어점수 %d, 영어점수 %d,"
				+ " 수학점수 %d이며\n",	kor, eng, mat);
		System.out.printf("당신의 총점은 %d 입니다.\n", sum);

	}

}

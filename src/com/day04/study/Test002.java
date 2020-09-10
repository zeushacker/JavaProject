package com.day04.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*  사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
 *  총점과 평균을 구하는 프로그램을 출력하시오.
 *  
 *  평균은 실수형으로 출력은 수소점 2자리까지 출력
 *  
 *  단, 이름과 점수는 BufferedReader 클래스를 사용하시오.
 */

public class Test002 {

	public static void main(String[] args) throws IOException{
		// BufferedReader 객체(인스턴스)생성
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		/*  '대' 라는 문자를 BufferedReader를 통해 입력받을 경우
		 *   2바이트로 구성되어 있기 때문에 1바이트씩 쪼갠다.
		 *     InputStreamReader 가 바이트 스트림을 
		 *     문자 스트림으로 변환시켜 주는 역할을 하게 됨
		  */
		// 주요 변수 선언
		int kor, eng, mat, tot=0;
		float avg=0.0f;
		String name;
		
		System.out.print("이름 입력 :");
		name = br.readLine();
		
		System.out.print("국어점수:");
		kor = Integer.parseInt(br.readLine());
		
		System.out.print("영어점수:");
		eng = Integer.parseInt(br.readLine());
		
		System.out.print("수학점수:");
		mat = Integer.parseInt(br.readLine());
		
		// 총점을 구함
		
		tot = kor + eng + mat;
		
		// 평균을 구함
		
		avg = tot /3;
		

		// 결과 출력
		System.out.printf("이름 :%s , 국어:%d, 영어:%d, 수학: %d, 총점:%d\n", name, kor, eng, mat, tot);
		System.out.printf("평균 : %.2f\n", avg);
		
		
	}

}

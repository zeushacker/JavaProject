package com.day09.study;

import java.io.*;
public class SwitchEx01 {

	public static void main(String[] args) throws IOException{
		// 키보드로 입력 받음
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		// 1. 변수 선언
		String name, grade="";
		int kor, eng, mat, sum =0;
		float avg;
		
		
		// 2. 안내메시지 및 자료 입력
		System.out.print("이름 입력:");
		name=br.readLine();
		System.out.print("국어점수:");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어점수:");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학점수:");
		mat = Integer.parseInt(br.readLine());
		
		// 조건에 올수 있는 자료형 : 정수형, 문자형(char)
		// 조건으로 올수 없는 자료형 : 문자열, boolean, float, double형은 사용불가
		
		// 총점을 구함
		sum = kor + eng + mat;
		
		// 총점을 이용하여 평균을 구함
		avg = sum /3.f;
		System.out.println(" 총점 :"+sum +", 평균:"+(int)(avg) );
			
		//switch(수식및 조건) case 상수
		// case 문 뒤에 break문 
		// 등급 처리 및 연산
		switch((int)(avg/10)) {// 조건 및 수식
		case 10:
		case 9 :
			grade="A";
			
		//System.out.println("A");
		break;
		case 8 :
			grade="B";
			//System.out.println("B");
			break;
		case 7 :
			//System.out.println("C");
			grade="C";
			break;
		case 6 :
			grade="D";
			//System.out.println("D");
			break;
		default :
			grade="F";
		//	System.out.println("F");
			break;
		}
		System.out.println("이름은 "+name+"이고 학점은 "+grade+"입니다.");
	}

}

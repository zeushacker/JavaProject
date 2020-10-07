package com.day17.study;

public class ArrayExam01 {

	public static void main(String[] args) {
		
		// int test[][] = new int[2][3];// 2행 3열의 2차원배열
		//int test[][];
		//test = new int[2][3];
		int test[][] = {
		                          {100,200,300},
		                          {400,500,600}
		                         };
		//첫번째 행 에 값 저장
		/*
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
		*/
		//두번째 행 에 값 저장
		/*
		test[1][0] = 400;
		test[1][1] = 500;
		test[1][2] = 600;
		*/
		/*
		System.out.println(test[0][0]);
		System.out.println(test[0][1]);
		System.out.println(test[0][2]);
		System.out.println(test[1][0]);
		System.out.println(test[1][1]);
		System.out.println(test[1][2]);
		*/
		int i, j;
		for(i=0; i<test.length;i++) {// 행
			for(j = 0; j <test[i].length; j++) {// 열
				System.out.print("test["+i+"]["+j+"]:"+test[i][j]+"\t");
			}
			System.out.println();// 행 바꿈
		}
		
		
		

	}

}

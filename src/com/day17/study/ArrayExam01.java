package com.day17.study;

public class ArrayExam01 {

	public static void main(String[] args) {
		
		// int test[][] = new int[2][3];// 2�� 3���� 2�����迭
		//int test[][];
		//test = new int[2][3];
		int test[][] = {
		                          {100,200,300},
		                          {400,500,600}
		                         };
		//ù��° �� �� �� ����
		/*
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
		*/
		//�ι�° �� �� �� ����
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
		for(i=0; i<test.length;i++) {// ��
			for(j = 0; j <test[i].length; j++) {// ��
				System.out.print("test["+i+"]["+j+"]:"+test[i][j]+"\t");
			}
			System.out.println();// �� �ٲ�
		}
		
		
		

	}

}

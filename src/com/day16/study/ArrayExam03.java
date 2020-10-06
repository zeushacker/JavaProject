package com.day16.study;

/*
 *     char 자료형의 배열에 알파벳 대문자를 채우고
 *     채워진 배열의 전체 요소를 출력하는 프로그램을 구현하시오.
 *     
 *     단, char 자료형의 배열에 구성하는 과정에서는 반복문을 이용해서 초기화 하시오.
 *   
 */



public class ArrayExam03 {

	public static void main(String[] args) {
		// 첫번째 방법
		//char[] ch1 = new char[26];
		//	ch1[0]='A';
	   //	ch1[25]='Z';
		
		// 두번째 방법
		//char[] ch2 = {'A', 'B', ..... 'Z'};
		
		// 세번째 방법(반복문 이용해서 초기화)
		
		char[] arpha = new char[26];
		 int i, b;
		 /*
		 for(i = 0, b = 65; i<26;i++, b++)
			 arpha[i] = (char)b;// 배열에 저장
		*/
		 for(i = 0; i<arpha.length; i++)
			 arpha[i] = (char)('A'+i);
		 
		 
		 // 배열에 저장된 데이터 출력
		 for(i = 0; i<26; i++)
			 System.out.print(arpha[i]+"  ");
		 
		

	}

}

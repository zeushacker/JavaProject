package com.day16.study;

/* 배열
 *   - 배열이란 크기와 성격이 같은 일련의 원소들이 모여
 *     공동의 집합 구조를 갖는 자료의 집합체를 의미함
 *     
 *     같은 성격의 가진 자료들에 대해 개별적으로 자료형을 부여하지 않고
 *     하나의 이름을 가지고 처리할 목적으로 이용함
 *     
 *   - 자바에서의 배열은 다음과 같은 순서에 의해서 사용됨
 *      배열선언 -->  배열에 메모리 할당(크기) --> 배열 요소의 이용 
 *      
 *    - 형식과 구조
 *      자료형[] 변수명;
 *      변수명 = new 자료형[크기];
 *      변수명[인덱스] = 값;
 * 
 * 
 */




public class ArrayExam01 {

	public static void main(String[] args) {
        // 1차원 배열 선언
		int arr[];
		int[] aa;
		
		// 배열의 크기지정(메모리할당)
		arr = new int[10];// arr[0], arr[1],.....arr[9]
		
		// 배열은 선언과 동시에 메모리 할당 및 초기화가 가능하다.
		// int[] arr = {1,2,3,4,5,6,7,8,9,10};
		// int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		
		// 배열 요소 사용(접근)
		arr[0] =1;
		arr[1] =2;
		arr[2] =3;
		arr[3] =4;
		//arr[4] =5;
		//arr[5] =6;
		//arr[6] =7;
		//arr[7] =8;
		//arr[8] =9;
		//arr[9] =10;
		
		// *****  값을 할당하지 않은 나머지 배열 공간은
		//            자동으로 초기화한다.   0으로
		
		
		// 배열에 저장된 데이터의 값 출력
		System.out.println("arr[0] :"+arr[0]);
		System.out.println("arr[1] :"+arr[1]);
		System.out.println("arr[4] :"+arr[4]);
		
		// System.out.println("arr[10] :"+arr[10]);
		// java.lang.ArrayIndexOutOfBoundsException 예외가 출력됨
		
		// 반복문을 활용해서 배열에 저장된 데이터 전체를 출력
		for(int i=0; i<10;i++) {
			System.out.printf("%2d\t", arr[i]);
		}
		System.out.println();
		System.out.println("====================================");
		
		for(int tt : arr)
			System.out.printf("%2d\t", tt);
		
		

	}

}









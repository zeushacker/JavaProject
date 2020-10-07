package com.day17.study;

/*  문] 
 *    임의의 숫자가 들어있는 배열의 숫자 데이터들 중 
 *    배열의 전체요소를 출력
 *    짝수인 요소만 골라서 출력
 *    3의 배수인 요소만 골라서 출력하는 프로그램을 출력
 *   
 *    임의의 숫자 = 4 7 9 1 3 2 5 6 8
 * 
 */
public class ArrayEx02 {

	public static void main(String[] args) {

		 int arr[] = {4,7, 9, 1, 3, 2 ,5, 6, 8};
		
		 //System.out.println(arr);
		 /*  일반적인 변수에 저장된 내용을 출력하는 방법이다.
		  *  배열에  저장된 데이터를 출력할 수 없다.
		  */
		 
		 // 배열의 길이를 확인
		 System.out.println(arr.length);
		
		 // 배열에 저장된 값을 출력
			System.out.println("배열의 전체 요소  ");
		 for(int i =0; i<arr.length;i++) {
			 System.out.printf("%2d", arr[i]);
		 }
		System.out.println();
		
		System.out.println("배열에 저장된  짝수 출력 ");
		 for(int i =0; i<arr.length;i++) {
			 if(arr[i]% 2 == 0) 
				 System.out.printf("%2d", arr[i]);
		}
		 System.out.println();
		 System.out.println("배열에 저장된  3의 배수 출력 ");
		 for(int i =0; i<arr.length;i++) {
			 if(arr[i]% 3 == 0) 
				 System.out.printf("%2d", arr[i]);
		}
		

	}

}

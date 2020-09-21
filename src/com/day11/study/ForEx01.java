package com.day11.study;

/*  문] 
 *   1 부터 100 까지의 합계를 구하는 프로그램을 작성하시오.
 */
public class ForEx01 {

	public static void main(String[] args) {
		
		//1.  변수 선언
		//int sum = 0;
		
		// for(초기값; 조건(종료값); 증감값) 
		/*
		 * for( i =1; i<=100; i++) { sum+=i;
		 * 
		 * }
		 */
		
		/*  초기값  
		 *  while (조건) {
		 *   실행문 
		 *   증감값
		 * }
		 */
		
		// 초기값 선언
		/*  int i = 0;
		
		while(i<=100) {
			sum+=i;// 실행문
			 i++;// 증감값
		}
		*/
		
		
		// 변수 설정
		//int sum = 0, i = 0;
		/*  변수의 초기값의 설정
		 *  	int sum = 0, i = 0;
		 * do {
		 *     수행할 문장
		 * }while(조건기술);
		 */
		
		/*
		do {
			sum+=i;// 실행문
			 i++;// 증감값
		}while(i<=100);
		
		System.out.println("1 부터 100까지의 합계는 "+sum+"입니다.");
	*/
		// 무한 반복
		/*
		 * for(;;) { System.out.printf("사랑합니다. .."); }
		 */
		
		/*
		 * while(true) { System.out.println("사랑합니다."); }
		 */
		 
		do {
			System.out.println("사랑합니다.");
		}while(true);
		 
		
		

	}

}

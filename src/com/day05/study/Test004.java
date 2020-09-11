package com.day05.study;

/*   제어문 
 *      비교문 : 주어진 조건의 결과에 따라 실행 문장을 다르게 하여 전혀 다른 결과를 얻기 위해
 *                 사용되는 제어문 ( if, switch ~ case 문)
 *                 
 *      반복문 : 특정한 문장을 정해진 규칙에 따라 반복처리하기 위해 사용되는 제어문
 *                for, while, do ~ while
 *                
 *      break 문 : 반복문 내에서 반복실행하는 문장을 빠져나갈때 사용하는 제어문
 *      
 *      continue 문 : 현재 진행되는 반복 회차를 포기하고 다음 회차로 이동할려고 할때 사용하는 제어문                    
 
 *       if 문을 형식
 *       -   if(조건) {
 *           조건에 만족할때 수행할 문장
 *       }
 *       
 *       if ~ else 문
 *       형식 
 *        if (조건) {
 *           조건이 만족할때 수행하는 문장
 *        }else {
 *           조건이 만족하지 않을때 수행하는 문장
 *        }
 *       
 */



public class Test004 {

	public static void main(String[] args) {

		int score = 80;  // 점수  => B
		/*  100 ~ 90:A, 80 ~ 89: B , 70 ~ 79 : C, 60 ~ 69 : D , 60(0 ~ 59) 이하를 F로 처리       */
		String grade ="";// 널 값
		//String grade =null;// 널 값
		
		if(score >= 90 ) {// 조건기술
			grade="A학점";
		}else if( score >= 80) {
			grade = "B학점";
		}else if( score >= 70) {
			grade = "C학점";
		}else if( score >= 60) {
			grade = "D학점";
		}else {
			grade = "F학점";
		}
		
	//	System.out.println("당신의 학점은 "+grade+"입니다.");
		System.out.printf("당신의 학점은 %s 입니다.",grade);	
		
		
		
		

	}

}

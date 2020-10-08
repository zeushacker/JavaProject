package com.day17.study;

/*
 *   배열의 복사
 *     - 배열은 한번 생성된후 배열의 크기를 변경할 수 없음
 *     - 크기를 더 늘리고 싶을 경우 같은 자료형의 배열을 원하는 크기로 준비해야한다.
 *     - 기존 배열을 복사해서 작업을 완료함
 *     
 *     - System.arraycopy() 메소드를 이용함
 *     
 *     public static void arraycopy(
 *                   Object src,  int srcPos,    Object dest,  int destPos,  int length )  
                             
                             Object src : 기존배열
                             int srcPos : 기존 배열의 복사 시작위치
                             Object dest : 복사가 될 배열
                             int destPos : 복사 시작 위치
                             int length  : 복사되는 배열의 길이 (수)                         
                       
 */

public class ArrayExam05 {

	public static void main(String[] args) {

		// 배열 선언 (기존배열)
		String src[] = {"Java", "DataBase", "Jsp", "Servlet"};
		// Spring, html
		//배열의 크기를 변경해서 더 큰 배열을 선언
		String des[] = new String[6];
		des[0] = "Spring";
		des[1] ="HTML;";
		
		System.arraycopy(src, 0, des, 2, 4);
		
		
		for(int i =0; i<des.length; i++) {
		//	System.out.println("des의 값:"+des[i]);
			System.out.print("des의 값:"+des[i]+"   ");
		}
		
		System.out.println();
		
		for(String sub : des) 
			System.out.print("des의 값:"+sub+"   ");
		
		
		
		
		
		

	}

}

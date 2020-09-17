package com.day09.study;
import java.util.*;

/*    키보드로 부터 년과 월을 각각 입력받아
 *    해당년 월의 날 수를 출력하고 윤년인지를 판정하시오.
 */

/*
  윤년 판별 조건
      입력받은 년도가4의 배수 이면서 100의 배수가 아니거나
     400의 배수이면 윤년  아니면 평년임 
*/ 

public class SwitchEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int y, m, d;// 년, 월, 일
		System.out.print("년도 입력");
		y = sc.nextInt();
		System.out.print("월 입력");
		m = sc.nextInt();
		switch(m)
		{
		case 1:case 3:case 5:case 7: case 8:case 10:case 12:
		d = 31;
		break;
		
		case 4 : case 6: case 9: case 11 :
			d = 30;
		break;
		
		case 2:
			if((y % 4 == 0 ) && (y % 100 != 0) ||(y % 400 ==0)) {
				d = 29;
			}else {
				d = 28;
			}
	    break;			
		
	    default :
	    	d =0;
	    	break;
		}
		
		if(d != 0) {
		   System.out.println(y+"년 "+m+"월은 "+d+"일까지 있습니다.");
		}else {
			System.out.println("입력 오류!!!");
		}
		
		

	}

}

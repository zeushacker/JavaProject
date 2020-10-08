package com.day17.study;

/* 다차원 배열(3차원)
 * 
 *   선언 : 자료형[][][] 배열명;  
 *           자료형  배열명[][][];
 *           
 *           
 * 메모리 할당(배열의 크기지정) 
 *           배열명 = new 자료형[면][행][열];
 * 
 * 배열명 = {
 *                 {
 *                    {열 ,  ,  ,  },// 행
 *                    { ,  ,  ,  },
 *                    { ,  ,  ,   }
 *                  }, // 면구분
 *                 {               
 *                    { ,  ,  ,  },
 *                    { ,  ,  ,  },
 *                    { ,  ,  ,   }
 *                }
 *           };
  */

public class ArrayExam03 {

	public static void main(String[] args) {
		
		int apt[][][];// 배열선언
		apt = new int[2][3][4]; // 배열 크기 지정
		//  배열크기 : 24
		int val =1;
		int k, i, j;  // 면, 행, 열
		
		// 배열에 값 저장
		for(k=0;k<apt.length; k++) {//면
			for(i=0; i<apt[k].length; i++) {// 행
				for(j=0; j<apt[k][i].length;j++) { //열
					apt[k][i][j] = val;//apt[0][0][0]
					val++;
				}
			}
		}
		System.out.println();
		// 배열에 저장된 값 출력
		for(k=0;k<apt.length; k++) {//면
			for(i=0; i<apt[k].length; i++) {// 행
				for(j=0; j<apt[k][i].length;j++) { //열
					System.out.print("apt["+k+"]["+i+"]["+j+"]:"+apt[k][i][j]+"\t"); 
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}

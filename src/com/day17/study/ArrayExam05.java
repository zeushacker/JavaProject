package com.day17.study;

/*
 *   �迭�� ����
 *     - �迭�� �ѹ� �������� �迭�� ũ�⸦ ������ �� ����
 *     - ũ�⸦ �� �ø��� ���� ��� ���� �ڷ����� �迭�� ���ϴ� ũ��� �غ��ؾ��Ѵ�.
 *     - ���� �迭�� �����ؼ� �۾��� �Ϸ���
 *     
 *     - System.arraycopy() �޼ҵ带 �̿���
 *     
 *     public static void arraycopy(
 *                   Object src,  int srcPos,    Object dest,  int destPos,  int length )  
                             
                             Object src : �����迭
                             int srcPos : ���� �迭�� ���� ������ġ
                             Object dest : ���簡 �� �迭
                             int destPos : ���� ���� ��ġ
                             int length  : ����Ǵ� �迭�� ���� (��)                         
                       
 */

public class ArrayExam05 {

	public static void main(String[] args) {

		// �迭 ���� (�����迭)
		String src[] = {"Java", "DataBase", "Jsp", "Servlet"};
		// Spring, html
		//�迭�� ũ�⸦ �����ؼ� �� ū �迭�� ����
		String des[] = new String[6];
		des[0] = "Spring";
		des[1] ="HTML;";
		
		System.arraycopy(src, 0, des, 2, 4);
		
		
		for(int i =0; i<des.length; i++) {
		//	System.out.println("des�� ��:"+des[i]);
			System.out.print("des�� ��:"+des[i]+"   ");
		}
		
		System.out.println();
		
		for(String sub : des) 
			System.out.print("des�� ��:"+sub+"   ");
		
		
		
		
		
		

	}

}

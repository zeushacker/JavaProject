package com.day05.study;

/*   ��� 
 *      �񱳹� : �־��� ������ ����� ���� ���� ������ �ٸ��� �Ͽ� ���� �ٸ� ����� ��� ����
 *                 ���Ǵ� ��� ( if, switch ~ case ��)
 *                 
 *      �ݺ��� : Ư���� ������ ������ ��Ģ�� ���� �ݺ�ó���ϱ� ���� ���Ǵ� ���
 *                for, while, do ~ while
 *                
 *      break �� : �ݺ��� ������ �ݺ������ϴ� ������ ���������� ����ϴ� ���
 *      
 *      continue �� : ���� ����Ǵ� �ݺ� ȸ���� �����ϰ� ���� ȸ���� �̵��ҷ��� �Ҷ� ����ϴ� ���                    
 
 *       if ���� ����
 *       -   if(����) {
 *           ���ǿ� �����Ҷ� ������ ����
 *       }
 *       
 *       if ~ else ��
 *       ���� 
 *        if (����) {
 *           ������ �����Ҷ� �����ϴ� ����
 *        }else {
 *           ������ �������� ������ �����ϴ� ����
 *        }
 *       
 */



public class Test004 {

	public static void main(String[] args) {

		int score = 80;  // ����  => B
		/*  100 ~ 90:A, 80 ~ 89: B , 70 ~ 79 : C, 60 ~ 69 : D , 60(0 ~ 59) ���ϸ� F�� ó��       */
		String grade ="";// �� ��
		//String grade =null;// �� ��
		
		if(score >= 90 ) {// ���Ǳ��
			grade="A����";
		}else if( score >= 80) {
			grade = "B����";
		}else if( score >= 70) {
			grade = "C����";
		}else if( score >= 60) {
			grade = "D����";
		}else {
			grade = "F����";
		}
		
	//	System.out.println("����� ������ "+grade+"�Դϴ�.");
		System.out.printf("����� ������ %s �Դϴ�.",grade);	
		
		
		
		

	}

}

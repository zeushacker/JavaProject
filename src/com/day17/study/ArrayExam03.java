package com.day17.study;

/* ������ �迭(3����)
 * 
 *   ���� : �ڷ���[][][] �迭��;  
 *           �ڷ���  �迭��[][][];
 *           
 *           
 * �޸� �Ҵ�(�迭�� ũ������) 
 *           �迭�� = new �ڷ���[��][��][��];
 * 
 * �迭�� = {
 *                 {
 *                    {�� ,  ,  ,  },// ��
 *                    { ,  ,  ,  },
 *                    { ,  ,  ,   }
 *                  }, // �鱸��
 *                 {               
 *                    { ,  ,  ,  },
 *                    { ,  ,  ,  },
 *                    { ,  ,  ,   }
 *                }
 *           };
  */

public class ArrayExam03 {

	public static void main(String[] args) {
		
		int apt[][][];// �迭����
		apt = new int[2][3][4]; // �迭 ũ�� ����
		//  �迭ũ�� : 24
		int val =1;
		int k, i, j;  // ��, ��, ��
		
		// �迭�� �� ����
		for(k=0;k<apt.length; k++) {//��
			for(i=0; i<apt[k].length; i++) {// ��
				for(j=0; j<apt[k][i].length;j++) { //��
					apt[k][i][j] = val;//apt[0][0][0]
					val++;
				}
			}
		}
		System.out.println();
		// �迭�� ����� �� ���
		for(k=0;k<apt.length; k++) {//��
			for(i=0; i<apt[k].length; i++) {// ��
				for(j=0; j<apt[k][i].length;j++) { //��
					System.out.print("apt["+k+"]["+i+"]["+j+"]:"+apt[k][i][j]+"\t"); 
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}

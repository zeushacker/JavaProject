package com.day16.study;

/*
 *     char �ڷ����� �迭�� ���ĺ� �빮�ڸ� ä���
 *     ä���� �迭�� ��ü ��Ҹ� ����ϴ� ���α׷��� �����Ͻÿ�.
 *     
 *     ��, char �ڷ����� �迭�� �����ϴ� ���������� �ݺ����� �̿��ؼ� �ʱ�ȭ �Ͻÿ�.
 *   
 */



public class ArrayExam03 {

	public static void main(String[] args) {
		// ù��° ���
		//char[] ch1 = new char[26];
		//	ch1[0]='A';
	   //	ch1[25]='Z';
		
		// �ι�° ���
		//char[] ch2 = {'A', 'B', ..... 'Z'};
		
		// ����° ���(�ݺ��� �̿��ؼ� �ʱ�ȭ)
		
		char[] arpha = new char[26];
		 int i, b;
		 /*
		 for(i = 0, b = 65; i<26;i++, b++)
			 arpha[i] = (char)b;// �迭�� ����
		*/
		 for(i = 0; i<arpha.length; i++)
			 arpha[i] = (char)('A'+i);
		 
		 
		 // �迭�� ����� ������ ���
		 for(i = 0; i<26; i++)
			 System.out.print(arpha[i]+"  ");
		 
		

	}

}

package com.day15.study;

/*    Ű����� ���� Ű�� �����Ը� �Է¹޾� ���� ������ �̿��Ͽ� ��������, ������
 *    �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 *    ��, �����Դ� �Ǽ����·� �Է¹޴´�
 *       ���� : 
 *         ������ <= (Ű - 100) *0.9 �̸� ����, �ƴϸ� ��
 *         �����ڴ� ���ǻ��� �����ڷ� ó���Ͻÿ�.
 */

import java.util.*;
public class Test001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Ű�� �����Ը� ������ ���� ����
		double height, weight;
		String s ="";
		System.out.print("Ű �Է�:");
		height = sc.nextDouble();
		
		System.out.print("������ �Է�:");
		weight = sc.nextDouble();
		
		s = weight <= (height - 100) * 0.9 ? "����" : "��";
		
		System.out.printf("����� %s �Դϴ�.\n", weight <= (height - 100) * 0.9 ? "����" : "��");
		System.out.printf("����� %s �Դϴ�.\n", s);
		

	}

}

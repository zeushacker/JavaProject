package com.day11.study;

// ����� �Է¸޴� �����
import java.io.*;
public class DoWhileEx01 {

	public static void main(String[] args) throws IOException{
      int menu = 0;
      
      do {
    	  System.out.println("1. ȸ������ ");
    	  System.out.println("2. ȸ����ȸ ");
    	  System.out.println("3. ȸ������ ");
    	  System.out.println("4. ȸ��Ż�� ");
    	  System.out.println("0. ���α׷����� ");
    	  System.out.print("�޴� ���� :");
    	  menu = System.in.read()-48;
    	               System.in.skip(2);
      }while (menu !=1 &&menu !=2 &&menu !=3&& menu !=4 && menu !=0 );
	}

}

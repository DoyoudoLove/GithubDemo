package com.StudentDemo;

import java.util.Scanner;

/**
 * ������
 * @author SugarMan
 * @version 1.0
 * @time 2017��8��24�� ����10:49:06
 */
public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student();
		
		System.out.println("����������5λͬѧ������:");
		s.addName();
		System.out.println("****�����****");
		String[] newNames = s.getName();
		for (int i = 0; i < newNames.length; i++) {
			if (newNames[i] != null) {
				System.out.print(newNames[i] + "\t");
			}
		}
		
	}

}

package com.StudentDemo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ��д������ʵ��ѧ������������
 * @author SugarMan
 * @version 1.0
 * @time 2017��8��24�� ����10:42:00
 */
public class Student {
	Scanner input = new Scanner(System.in);
	//�������鱣��
	String[] names = new String[5];
	//�û�����
	public void addName() {
		for (int i = 0; i < names.length; i++) {
			names[i] = input.next() ;
		}
	}
	//����
	public String[] getName() {
		Arrays.sort(names);
		return names;
	}
}

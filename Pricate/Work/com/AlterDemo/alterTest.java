package com.AlterDemo;

import java.util.Scanner;

/**
 * ������
 * @author SugarMan
 * @version 1.0
 * @time 2017��8��23�� ����11:29:15
 */
public class alterTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//������ʵ��������
		alter al = new alter();
		//ѭ��¼��ѧ������
		for (int i = 0; i < 5; i++) {
			System.out.print("������ѧ������: ");
			String name = input.next();
			al.addName(name);
		}
		//��ӡ����ѧ��
		al.showName();
		System.out.println();
		//��ѯѧ���Ƿ����
		System.out.println("������Ҫ�޸ĵ�ѧ������: ");
		String findName = input.next();	
		System.out.println("�������µ�ѧ������: ");
		String newName = input.next();
		System.out.println("****�޸Ľ��****");
		if (al.search(newName, findName)) {			
			System.out.println("û���ҵ���ѧ����");
		} else
			System.out.println("�ҵ����޸ĳɹ���");
		
		//�޸�����
		
		al.showName();
	}
}

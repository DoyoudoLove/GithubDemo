package com.CustomerBiz;

import java.util.Scanner;

/**
 * ������
 * @author SugarMan
 * @version 1.0
 * @time 2017��8��22�� ����6:19:12
 */
public class CustomerTest {

	public static void main(String[] args) {
		// �û�����
		boolean cn = true;
		Scanner input = new Scanner(System.in);
		CustomerBiz cus = new CustomerBiz();
		
		while (cn) {
			System.out.print("������ͻ�������: ");
			String name = input.next();
			cus.addName(name);
			
			System.out.print("���������𣿣�y/n��: ");
			String result = input.next();
			if (!(result.equals("y"))) {
				cn = false;
			}
		}
		//��ӡ���
		cus.showNames();
		System.out.println();
		//���ҽ��
		System.out.println("��������ҵĿͻ�����: ");
		String findName = input.next();
		cus.search(findName);
		System.out.println("****���ҽ��****");
		boolean cho = true;
		if (cho) {
			System.out.println("�ҵ��ˣ�");
		} else
			System.out.println("û���ҵ���");
		
		
	}

}

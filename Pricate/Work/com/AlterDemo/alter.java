package com.AlterDemo;
/**
 * ¼��ѧ������ 
 * ʵ���޸�ѧ�������������¡��������������޸Ĳ���ʾ�Ƿ��޸ĳɹ�
 * @author SugarMan
 * @version 1.0
 * @time 2017��8��23�� ����11:21:09
 */

import java.util.Scanner;

public class alter {
	//����Scanner����
	Scanner input = new Scanner(System.in);
	//�������鱣���û�¼����Ϣ
	String[] names = new String[10];
	/**
	 * ʵ���û�����
	 * @param name ������û�������
	 */
	public void addName(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				names[i] = name;
				break;
			}
		}
	}
	public void showName() {
		System.out.println("����ѧ���б�");
		for (int i = 0; i < names.length; i++) {
			if (names[i] != null) {
				System.out.print(names[i] + "\t");
			}
		}
	}
	public boolean search(String newName,String findName) {
		boolean cn = true;
		for (int i = 0; i < names.length; i++) {
			if (findName.equals(names[i])) {
				names[i] = newName;
				cn = true;
				break;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
}

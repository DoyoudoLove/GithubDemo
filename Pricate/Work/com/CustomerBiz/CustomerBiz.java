package com.CustomerBiz;

import java.util.Scanner;

/**
 * �����ͻ�ҵ���� ----ʵ�ֿͻ���������Ӻ���ʾ
 * @author SugarMan
 * @version 1.0
 * @time 2017��8��22�� ����6:16:46
 */
public class CustomerBiz {
	//����
	String[] names = new String[10];
	public void addName(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				names[i] = name;
				break;
			}
		}
	}
	//��ӡ
	public void showNames() {
		System.out.println("***************************");
		System.out.println("\t�ͻ������б�");
		System.out.println("***************************");
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				break;
			}
			System.out.print( names[i] + "\t");
		}
		
	}
	//�ж�
	public boolean search(String findName) {
		for (int i = 0; i < names.length; i++) {
			if (findName.equals(names[i])) {
				names[i] = findName;
				break;
			}
		}
		
		return false;
	}
	
	
	
	
	
	
	
	
}

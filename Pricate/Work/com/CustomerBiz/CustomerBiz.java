package com.CustomerBiz;

import java.util.Scanner;

/**
 * 创建客户业务类 ----实现客户姓名的添加和显示
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月22日 下午6:16:46
 */
public class CustomerBiz {
	//输入
	String[] names = new String[10];
	public void addName(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				names[i] = name;
				break;
			}
		}
	}
	//打印
	public void showNames() {
		System.out.println("***************************");
		System.out.println("\t客户姓名列表：");
		System.out.println("***************************");
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				break;
			}
			System.out.print( names[i] + "\t");
		}
		
	}
	//判断
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

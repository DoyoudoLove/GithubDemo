package com.AlterDemo;
/**
 * 录入学生姓名 
 * 实现修改学生姓名，输入新、旧姓名，进行修改并显示是否修改成功
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月23日 上午11:21:09
 */

import java.util.Scanner;

public class alter {
	//创建Scanner对象
	Scanner input = new Scanner(System.in);
	//创建数组保存用户录入信息
	String[] names = new String[10];
	/**
	 * 实现用户输入
	 * @param name 传入的用户的名称
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
		System.out.println("本班学生列表");
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

package com.StudentDemo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 编写方法，实现学生的姓名排序
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月24日 上午10:42:00
 */
public class Student {
	Scanner input = new Scanner(System.in);
	//定义数组保存
	String[] names = new String[5];
	//用户输入
	public void addName() {
		for (int i = 0; i < names.length; i++) {
			names[i] = input.next() ;
		}
	}
	//排序
	public String[] getName() {
		Arrays.sort(names);
		return names;
	}
}

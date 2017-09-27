package com.AlterDemo;

import java.util.Scanner;

/**
 * 测试类
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月23日 上午11:29:15
 */
public class alterTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//声明并实例化对象
		alter al = new alter();
		//循环录入学生姓名
		for (int i = 0; i < 5; i++) {
			System.out.print("请输入学生姓名: ");
			String name = input.next();
			al.addName(name);
		}
		//打印本班学生
		al.showName();
		System.out.println();
		//查询学生是否存在
		System.out.println("请输入要修改的学生姓名: ");
		String findName = input.next();	
		System.out.println("请输入新的学生姓名: ");
		String newName = input.next();
		System.out.println("****修改结果****");
		if (al.search(newName, findName)) {			
			System.out.println("没有找到该学生！");
		} else
			System.out.println("找到并修改成功！");
		
		//修改姓名
		
		al.showName();
	}
}

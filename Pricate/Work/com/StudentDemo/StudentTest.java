package com.StudentDemo;

import java.util.Scanner;

/**
 * 测试类
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月24日 上午10:49:06
 */
public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student();
		
		System.out.println("请依次输入5位同学的姓名:");
		s.addName();
		System.out.println("****排序后****");
		String[] newNames = s.getName();
		for (int i = 0; i < newNames.length; i++) {
			if (newNames[i] != null) {
				System.out.print(newNames[i] + "\t");
			}
		}
		
	}

}

package com.verify.string;

import java.util.Scanner;
/**
 * 实现会员注册，要求用户名长度不小于3，密码长度不小于6
 * 注册时两次输入密码必须相同
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月22日 上午11:05:13
 */


public class Register {
	
	public static void main(String[] args) {
		verify();
	}
/**
 * 此方法对用户名、密码的输入进行了验证
 * 循环结果为false 跳出循环
 * @return  返回方法
 */
	public static boolean verify() {
		
		//用户名长度不小于3，密码长度不小于6
		Scanner input = new Scanner(System.in);
		boolean result = true;
		
		while(result) {
			
			System.out.print("请输入用户名: ");
			String name  = input.next();
			if (name.length() < 3 || name.length() < 6) {
				System.out.println("用户名长度不能小于3，密码长度不能小于6！");
				continue;
			}
			
			//两次输入密码必须相同
			System.out.print("请输入密码：");
			String passWord1 = input.next();
			System.out.print("请再次输入密码: ");
			String passWord2 = input.next();
			
			if (!passWord1.equals(passWord2)) {
				System.out.println("两次输入的密码不相同！");
				continue;
			} else {
				System.out.println("注册成功！请牢记用户名和密码。");
				return false;
			}
			
		}
		
		return true;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

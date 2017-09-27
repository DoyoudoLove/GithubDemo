package com.CustomerBiz;

import java.util.Scanner;

/**
 * 测试类
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月22日 下午6:19:12
 */
public class CustomerTest {

	public static void main(String[] args) {
		// 用户输入
		boolean cn = true;
		Scanner input = new Scanner(System.in);
		CustomerBiz cus = new CustomerBiz();
		
		while (cn) {
			System.out.print("请输入客户的姓名: ");
			String name = input.next();
			cus.addName(name);
			
			System.out.print("继续输入吗？（y/n）: ");
			String result = input.next();
			if (!(result.equals("y"))) {
				cn = false;
			}
		}
		//打印输出
		cus.showNames();
		System.out.println();
		//查找结果
		System.out.println("请输入查找的客户姓名: ");
		String findName = input.next();
		cus.search(findName);
		System.out.println("****查找结果****");
		boolean cho = true;
		if (cho) {
			System.out.println("找到了！");
		} else
			System.out.println("没有找到！");
		
		
	}

}

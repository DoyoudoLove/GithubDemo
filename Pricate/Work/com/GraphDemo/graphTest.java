package com.GraphDemo;

import java.util.Scanner;

/**
 * 测试类
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月23日 下午6:42:00
 */
public class graphTest {

	public static void main(String[] args) {
		// 
		Scanner input = new Scanner(System.in);
		graph g = new graph();
		System.out.print("请输入行高: ");
		int high = input.nextInt();
		System.out.print("请输入打印的字符: ");
		String shape =input.next();
		g.show(high, shape);
		
	}

}

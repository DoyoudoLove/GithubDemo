package com.StudentDemo.height;

import java.util.Scanner;

/**
 * 测试类 --- 调用height方法
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月24日 下午2:27:28
 */
public class HeightTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//用户输入身高属性的对象
		StudentHeight st = new StudentHeight();
		//计算平均身高的对象
		HeightDemo he 	= new HeightDemo();
		st.addHeight();
		System.out.println("****这5位学生的平均身高为:  " + he.avgHeight(st) + "cm****");

	}

}

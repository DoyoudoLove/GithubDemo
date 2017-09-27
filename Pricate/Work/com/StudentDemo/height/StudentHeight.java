package com.StudentDemo.height;

import java.util.Scanner;

/**
 * 计算学生的平均身高
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月24日 下午2:22:42
 */
public class StudentHeight {
	Scanner input = new Scanner(System.in);
	int[] height = new int[5];
	public void addHeight() {
		for(int i = 0; i < height.length; i++ ) {
			System.out.print("请输入第" + (i + 1) + "位学生的身高（cm）: ");
			height[i] = input.nextInt();
		}
	}
}

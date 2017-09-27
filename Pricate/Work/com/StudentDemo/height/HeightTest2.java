package com.StudentDemo.height;

import java.util.Scanner;

/**
 * 测试类 -- 升级版
 * @author SugarMan
 * @version 2.0
 * @time 2017年8月24日 下午3:20:14
 */
public class HeightTest2 {

	public static void main(String[] args) {
		
		HeightDemo2[] he = new HeightDemo2[5];
		
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < he.length; i++) {
			HeightDemo2 h2 = new HeightDemo2();
			he[i] = h2; //为数组开辟空间并赋值
			System.out.print("请输入第" + (i + 1) + "名学生的身高（cm）: ");
			if(he[i].Height == 0) {
				he[i].Height = input.nextDouble();
			}
		}
		HeightDemo2 h = new HeightDemo2();
		double avgHeight = h.getHeight(he);
		System.out.println("****这5名同学的平均身高为: " + avgHeight + "cm****");
			
	}

}

package com.chongwu;

import java.util.Scanner;

/**
 * 领养宠物实现类
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月5日 上午8:53:32
 */
public class TestMain {

	public static void main(String[] args) {
		String Strain;
		String Sex;
		System.out.println("欢迎来到宠物店 \n请选择要领养宠物的名字:");
		Scanner input = new Scanner(System.in);
		String name = input.next();
		System.out.print("请选择要领养的宠物类型：（1、狗狗 2、企鹅）");
		int choose = input.nextInt();
		switch (choose) {
		case 1:
			System.out.print("请选择狗的品种:(1、聪明的拉布拉多犬 2、酷酷的雪娜瑞)");
			choose = input.nextInt();
			if (choose == 1) {
				 Strain = "聪明的拉布拉多犬";
			} else
				 Strain = "酷酷的雪娜瑞";
			Dog d = new Dog(name, 100, 0, Strain);
			d.speak();
			break;
		case 2:
			
			System.out.print("请选择企鹅的性别：（1、Q仔 2、Q妹）");
			choose = input.nextInt();			
			if (choose == 1) {
				Sex = "Q仔";
			} else
				Sex = "Q妹";
			Penguin p = new Penguin(name, Sex, 100, 0);
			p.speak();
			break;
		default:
			System.out.println("输入有误！");
			break;
		}

	}

}

package com.chongwu;

import java.util.Scanner;

/**
 * 创建宠物对象
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月4日 下午7:28:22
 */
public class DogDemo {
	public static void main(String[] args) {
		String name;
		int choose;
		int health = 100;
		int love = 0;
		System.out.println("欢迎来到宠物店 \n请选择要领养宠物的名字:");
		Scanner input = new Scanner(System.in);
		name = input.next();
		System.out.print("请选择要领养的宠物类型：（1、狗狗 2、企鹅）");
		choose = input.nextInt();
		switch (choose) {
		case 1:
			System.out.print("请选择狗的品种:(1、聪明的拉布拉多犬 2、酷酷的雪娜瑞)");
			choose = input.nextInt();
			switch (choose) {
			case 1:
				String name1 = "聪明的拉布拉多犬";
				System.out.println("宠物的自白:");
				System.out.println("我的名字叫" + name + 
						"，我的健康值是" + health + 
						"，我和主人的亲密度为" + love +
						"，我的类型是" + name1);
				break;

			case 2:
				String name2 = "酷酷的雪娜瑞";
				System.out.println("宠物的自白:");
				System.out.println("我的名字叫" + name + 
						"，我的健康值是" + health + 
						"，我和主人的亲密度为" + love +
						"，我的类型是" + name2);
				break;
			}
			break;

		case 2:
			System.out.print("请选择企鹅的性别：（1、Q仔 2、Q妹）");
			choose = input.nextInt();
			switch (choose) {
			case 1:
				String name1 = "Q仔";
				System.out.println("宠物的自白:");
				System.out.println("我的名字叫" + name + 
						"，我的健康值是" + health + 
						"，我和主人的亲密度为" + love +
						"，我的性别是" + name1);
				
				break;

			case 2:
				String name2 = "Q妹";
				System.out.println("宠物的自白:");
				System.out.println("我的名字叫" + name + 
						"，我的健康值是" + health + 
						"，我和主人的亲密度为" + love +
						"，我的性别是" + name2);
				break;
			}
			break;
		}
		
	}
}

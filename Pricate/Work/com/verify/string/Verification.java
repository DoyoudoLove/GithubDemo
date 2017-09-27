package com.verify.string;

import java.util.Scanner;

/**
 * 验证身份证号、手机号、座机号是否正确
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月24日 下午4:48:22
 */
public class Verification {
	String idCard;
	String telephone;
	String phone;
	public static void main(String[] args) {
		System.out.println("***欢迎进入注册系统***\n");
		new Verification().验证();
	}

	public boolean 验证() {
		Scanner input = new Scanner(System.in);
		boolean result = true;
		while (result) {
			
			System.out.print("请输入身份证：");
			idCard = input.next();
			System.out.print("请输入手机号：");
			telephone = input.next();
			System.out.print("请输入座机号：");
			phone = input.next();
			
			int index = phone.indexOf("-");
			String index1 = phone.substring(index + 1, phone.length());
			
			if (idCard.length() == 16 || idCard.length() == 18) {
				if (telephone.length() == 11 ) {
					if (index == 4 && index1.length() == 7) {
						input.close();
						System.out.println("注册成功！");
						break;
					} else {
						System.out.println("座机号码区必须为4位，电话号码必须是7位");
					}
				} else {
					System.out.println("手机号码必须是11位");
				}
			} else {
				System.out.println("身份证号必须是16或是18位");
			}
			
		}
//		System.out.println("注册成功！");
		return true;
	}
	
	
}

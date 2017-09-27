package com.verify.string;

import java.util.Scanner;


/**
 * 输入一个字符串，输入一个字符，判断该字符在该字符串中出现的次数
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月25日 下午6:11:36
 */
public class Count {
	/** 要输入的字符串 */
	private String zifu;
	/** 要查找的字符 */
	private char findZiFU;
	int count;
	private Scanner input;
	
	public Count() {
		input = new Scanner(System.in);
	}
	
	public void find() {
		//1.实现输入字符串功能
		System.out.print("请输入一个字符串：");
		zifu = input.next();
		
		//2.输入查找的字符
		System.out.print("请输入查找的字符：");
		findZiFU = input.next().charAt(0);
		
		//3.统计字符出现的次数
		for (int i = 0; i < zifu.length(); i++) {
			if (findZiFU == zifu.charAt(i))
				count++;
		}
		System.out.println("“" + zifu  + "。”"+ "中包含" + count  + "个" +
						   "“"+ findZiFU + "”"  );
	}
	
}

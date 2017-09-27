package com.Customer;

import java.util.Scanner;

/**
 * 从键盘接收三门课分数，计算三门课的平均分和总成绩，编写成绩计算类实现功能
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月22日 上午10:01:04
 */
public class ScoreCalc {
	int sum;
	int avg;

	public int sum(int java, int c, int db) {
		sum = java + c + db;
		return sum;
	}
	public double avg(int sum) {
		avg = sum/3;
		return avg;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ScoreCalc sc = new ScoreCalc();
		System.out.print("请输入java成绩: ");
		int java = input.nextInt();
		System.out.print("请输入C#成绩: ");
		int c	= input.nextInt();
		System.out.print("请输入DB成绩: ");
		int db 	= input.nextInt();

		sc.sum(java, c, db);
		System.out.println("总成绩是: " + sc.sum);
		sc.avg(sc.sum);
		System.out.println("平均成绩是: " + sc.avg);
		
	}
}

package com.StudentDemo.score;

import java.util.Scanner;

/**
 * 测试类 ---  计算学生平均分
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月24日 上午11:13:42
 */
public class ScoreTest {
	public static void main(String[] args) {
		//带有学生属性的对象
		StudentScore sc = new StudentScore();
		//计算平均成绩的对象
		ScoreDemo scd = new ScoreDemo();
		//创建Scanner对象 输入三门成绩
		Scanner input = new Scanner(System.in);
		System.out.print("请输入Java成绩: ");
		sc.java = input.nextDouble();
		System.out.print("请输入PHP成绩: ");
		sc.php  = input.nextDouble();
		System.out.print("请输入Android成绩: ");
		sc.android = input.nextDouble();
		//打印学生平均分
		System.out.print("该学生的平均分分为:  " + scd.calScore(sc));
	}
}

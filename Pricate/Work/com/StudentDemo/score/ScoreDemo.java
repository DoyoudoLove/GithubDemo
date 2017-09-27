package com.StudentDemo.score;
/**
 * 定义学生成绩计算类，添加方法，传递对象参数
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月24日 上午11:05:28
 */

import java.util.Scanner;

public class ScoreDemo {
	Scanner input = new Scanner(System.in);
	double[] score = new double[3];
	//计算平均分的方法
	public double calScore(StudentScore sc) {
		double avg = 0.0;
		avg = (sc.android + sc.java + sc.php) / 3;
		return avg;
	}

}
	
	
	



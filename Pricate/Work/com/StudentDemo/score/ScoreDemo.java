package com.StudentDemo.score;
/**
 * ����ѧ���ɼ������࣬��ӷ��������ݶ������
 * @author SugarMan
 * @version 1.0
 * @time 2017��8��24�� ����11:05:28
 */

import java.util.Scanner;

public class ScoreDemo {
	Scanner input = new Scanner(System.in);
	double[] score = new double[3];
	//����ƽ���ֵķ���
	public double calScore(StudentScore sc) {
		double avg = 0.0;
		avg = (sc.android + sc.java + sc.php) / 3;
		return avg;
	}

}
	
	
	



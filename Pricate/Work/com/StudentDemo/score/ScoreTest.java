package com.StudentDemo.score;

import java.util.Scanner;

/**
 * ������ ---  ����ѧ��ƽ����
 * @author SugarMan
 * @version 1.0
 * @time 2017��8��24�� ����11:13:42
 */
public class ScoreTest {
	public static void main(String[] args) {
		//����ѧ�����ԵĶ���
		StudentScore sc = new StudentScore();
		//����ƽ���ɼ��Ķ���
		ScoreDemo scd = new ScoreDemo();
		//����Scanner���� �������ųɼ�
		Scanner input = new Scanner(System.in);
		System.out.print("������Java�ɼ�: ");
		sc.java = input.nextDouble();
		System.out.print("������PHP�ɼ�: ");
		sc.php  = input.nextDouble();
		System.out.print("������Android�ɼ�: ");
		sc.android = input.nextDouble();
		//��ӡѧ��ƽ����
		System.out.print("��ѧ����ƽ���ַ�Ϊ:  " + scd.calScore(sc));
	}
}

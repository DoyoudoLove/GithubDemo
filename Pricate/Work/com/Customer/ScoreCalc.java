package com.Customer;

import java.util.Scanner;

/**
 * �Ӽ��̽������ſη������������ſε�ƽ���ֺ��ܳɼ�����д�ɼ�������ʵ�ֹ���
 * @author SugarMan
 * @version 1.0
 * @time 2017��8��22�� ����10:01:04
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
		System.out.print("������java�ɼ�: ");
		int java = input.nextInt();
		System.out.print("������C#�ɼ�: ");
		int c	= input.nextInt();
		System.out.print("������DB�ɼ�: ");
		int db 	= input.nextInt();

		sc.sum(java, c, db);
		System.out.println("�ܳɼ���: " + sc.sum);
		sc.avg(sc.sum);
		System.out.println("ƽ���ɼ���: " + sc.avg);
		
	}
}

package com.GraphDemo;

import java.util.Scanner;

/**
 * ������
 * @author SugarMan
 * @version 1.0
 * @time 2017��8��23�� ����6:42:00
 */
public class graphTest {

	public static void main(String[] args) {
		// 
		Scanner input = new Scanner(System.in);
		graph g = new graph();
		System.out.print("�������и�: ");
		int high = input.nextInt();
		System.out.print("�������ӡ���ַ�: ");
		String shape =input.next();
		g.show(high, shape);
		
	}

}

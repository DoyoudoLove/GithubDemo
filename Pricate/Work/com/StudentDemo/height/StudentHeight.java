package com.StudentDemo.height;

import java.util.Scanner;

/**
 * ����ѧ����ƽ�����
 * @author SugarMan
 * @version 1.0
 * @time 2017��8��24�� ����2:22:42
 */
public class StudentHeight {
	Scanner input = new Scanner(System.in);
	int[] height = new int[5];
	public void addHeight() {
		for(int i = 0; i < height.length; i++ ) {
			System.out.print("�������" + (i + 1) + "λѧ������ߣ�cm��: ");
			height[i] = input.nextInt();
		}
	}
}

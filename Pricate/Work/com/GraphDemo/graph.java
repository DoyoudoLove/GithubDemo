package com.GraphDemo;
/**
 * ͼ��������
 * @author SugarMan
 * @version 1.0
 * @time 2017��8��23�� ����6:34:13
 */

public class graph {
	
	public void show(int a, String b) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(b);
			}
			System.out.println();
		}
	}
}

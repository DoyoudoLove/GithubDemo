package com.StudentDemo.height;

import java.util.Scanner;

/**
 * ������ -- ������
 * @author SugarMan
 * @version 2.0
 * @time 2017��8��24�� ����3:20:14
 */
public class HeightTest2 {

	public static void main(String[] args) {
		
		HeightDemo2[] he = new HeightDemo2[5];
		
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < he.length; i++) {
			HeightDemo2 h2 = new HeightDemo2();
			he[i] = h2; //Ϊ���鿪�ٿռ䲢��ֵ
			System.out.print("�������" + (i + 1) + "��ѧ������ߣ�cm��: ");
			if(he[i].Height == 0) {
				he[i].Height = input.nextDouble();
			}
		}
		HeightDemo2 h = new HeightDemo2();
		double avgHeight = h.getHeight(he);
		System.out.println("****��5��ͬѧ��ƽ�����Ϊ: " + avgHeight + "cm****");
			
	}

}

package com.StudentDemo.height;

import java.util.Scanner;

/**
 * ������ --- ����height����
 * @author SugarMan
 * @version 1.0
 * @time 2017��8��24�� ����2:27:28
 */
public class HeightTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//�û�����������ԵĶ���
		StudentHeight st = new StudentHeight();
		//����ƽ����ߵĶ���
		HeightDemo he 	= new HeightDemo();
		st.addHeight();
		System.out.println("****��5λѧ����ƽ�����Ϊ:  " + he.avgHeight(st) + "cm****");

	}

}

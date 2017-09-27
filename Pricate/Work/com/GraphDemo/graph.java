package com.GraphDemo;
/**
 * 图形生成器
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月23日 下午6:34:13
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

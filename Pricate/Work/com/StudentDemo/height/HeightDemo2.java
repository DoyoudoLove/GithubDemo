package com.StudentDemo.height;
/**
 * 定义方法 --- 传递学生对象数组，求平均身高
 * @author SugarMan
 * @version 2.0
 * @time 2017年8月24日 下午3:15:38
 */
public class HeightDemo2 {
	double Height = 0.0;
	public double getHeight(HeightDemo2[] he) {
		double avg = 0.0;//计算平均身高
		double sum = 0.0;//身高求和
		int count  = 0;	//统计学生数量 
		
		for (int i = 0; i < he.length; i++) {
			if (he[i] != null) {
				sum += he[i].Height;
				count++;
			}
		}
		
		avg = sum / count;
		
		return avg;
	}
}

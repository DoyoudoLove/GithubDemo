package com.StudentDemo.height;
/**
 * ���巽�� --- ����ѧ���������飬��ƽ�����
 * @author SugarMan
 * @version 2.0
 * @time 2017��8��24�� ����3:15:38
 */
public class HeightDemo2 {
	double Height = 0.0;
	public double getHeight(HeightDemo2[] he) {
		double avg = 0.0;//����ƽ�����
		double sum = 0.0;//������
		int count  = 0;	//ͳ��ѧ������ 
		
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

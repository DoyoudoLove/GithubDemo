package com.StudentDemo.height;
/**
 * ���巽�� --- ����ѧ��������ƽ�����
 * @author SugarMan
 * @version 1.0
 * @time 2017��8��24�� ����2:25:23
 */
public class HeightDemo {
	/**
	 * �����û��������� -- ����ƽ�����
	 * @param st ���ö������
	 * @return ����ƽ�����
	 */
	public double avgHeight(StudentHeight st) {
		double d = 0;
		int[] sum = st.height;
		for (int i = 0; i < sum.length; i++) {
			d += sum[i];
		}
		double avg = d / sum.length; 
		return avg;
	}
}

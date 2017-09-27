package com.StudentDemo.height;
/**
 * 定义方法 --- 传递学生对象，求平均身高
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月24日 下午2:25:23
 */
public class HeightDemo {
	/**
	 * 调用用户输入的身高 -- 计算平均身高
	 * @param st 调用对象参数
	 * @return 返回平均身高
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

package com.Exception;
/**
 * 程序异常处理
 * 计算两个数相除的商
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月23日 上午8:53:24
 */
public class ExceptionDemo {
	int sum1, sum2;
	public static int division(int sum1, int sum2) {
		int result = Integer.MAX_VALUE;
		try {
			 result = sum1 / sum2;
			
		} catch (Exception e) {
			System.err.println( "异常信息 " + e.getMessage());
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int result = division(5, 0);
		System.out.println("result= " + result);
	}
}

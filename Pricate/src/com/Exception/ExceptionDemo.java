package com.Exception;
/**
 * �����쳣����
 * �����������������
 * @author SugarMan
 * @version 1.0
 * @time 2017��8��23�� ����8:53:24
 */
public class ExceptionDemo {
	int sum1, sum2;
	public static int division(int sum1, int sum2) {
		int result = Integer.MAX_VALUE;
		try {
			 result = sum1 / sum2;
			
		} catch (Exception e) {
			System.err.println( "�쳣��Ϣ " + e.getMessage());
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int result = division(5, 0);
		System.out.println("result= " + result);
	}
}

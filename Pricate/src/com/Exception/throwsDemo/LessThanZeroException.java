package com.Exception.throwsDemo;
/**
 * 
 * @author SugarMan
 * @version 1.0
 * @time 2017��9��8�� ����3:01:40
 */
public class LessThanZeroException extends Exception {
	
	private int value;
	
	public LessThanZeroException() {
		//
		super("����ֵ���ܵ���0");
	}
	public LessThanZeroException(int value) {
		super("�������ֵΪ��" + value + ",����ʧ��");
	}
}

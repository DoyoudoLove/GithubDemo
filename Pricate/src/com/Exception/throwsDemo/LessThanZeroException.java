package com.Exception.throwsDemo;
/**
 * 
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月8日 下午3:01:40
 */
public class LessThanZeroException extends Exception {
	
	private int value;
	
	public LessThanZeroException() {
		//
		super("经验值不能低于0");
	}
	public LessThanZeroException(int value) {
		super("您输入的值为：" + value + ",输入失败");
	}
}

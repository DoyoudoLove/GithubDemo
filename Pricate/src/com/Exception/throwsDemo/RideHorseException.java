package com.Exception.throwsDemo;
/**
 * 自定义异常 --- 健康值低于50自动触发
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月24日 下午7:24:22
 */
public class RideHorseException extends Exception {
	
	private static int value;
	public RideHorseException() {
		super("健康值不能低于50");
	}
	public RideHorseException(int value) {
		super("当前健康值为" + value + ",健康值不能低于50，骑马失败！");
	}

	

	
}

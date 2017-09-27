package com.IoputDemo.decorator;
/**
 * 抽象组件类，用来定义组件做具有的基本方法
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月30日 下午7:22:55
 */
public abstract class Component {
	/**
	 * 假设组件中定义了一个通用的read读取方法，要求子类进行实现
	 */
	public abstract void read();
}

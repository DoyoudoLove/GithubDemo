package com.Collection;
 
/**
 * 使用泛型后 类型在编译期间出现异常
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月14日 下午7:25:44
 */
public class ElementDemo<E> {
	Object obj = new Object[999];
	
	public static void main(String[] args) {
		//运行给定时的类型
		ElementDemo<Integer> demo = new ElementDemo<>();
		demo.add(12);
		
		
		
	}
	/**
	 * 向对象数组中添加给定类型的元素
	 * @param t
	 */
	
	public void add(E t) {
		
		
	}
	
	
	
}

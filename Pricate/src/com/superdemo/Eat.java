package com.superdemo;
/**
 * 接口与抽象类的比较:
 * 
 * 类中可以定义成员变量，接口不允许存在成员变量
 * 接口中所有的方法都需要类去实现（java 8前）
 * 接口可以被多继承
 * 使设计和实现完全分离
 * 能够更自然的使用多态
 * 可以更容易搭建程序框架
 * 可以更容易实现
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月22日 上午9:31:23
 */
public interface Eat {
	//接口中成员变量的定义 public static final
	String name = "接口类的定义域";
	//default 实现接口中方法
	default void mouth(){
		System.out.println("接口中所有的方法都需要类去实现");
	}
}

package com.IoputDemo.decorator;
/**
 * 装饰器实现类B   
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月30日 下午7:39:13
 */
public class ComponentImplB extends Decorator {
	
	
	public ComponentImplB(Component component) {
		super(component);
	}
	@Override
	public void read() {
		//在原始的read方法前后，分别调用自定义的方法
		//实现了对原read方法的功能扩展
		this.extendsReadA();
		super.read();  //原始的read方法
		this.extendsReadB();
	}
	
	private void extendsReadA() {
		System.out.println("ComponentImplB实现的扩展方法：extendsReadA");
	}
	
	private void extendsReadB() {
		System.out.println("ComponentImplB实现的扩展方法：extendsReadB ");
	}
	
	
}

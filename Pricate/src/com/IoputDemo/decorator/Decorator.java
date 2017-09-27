package com.IoputDemo.decorator;
/**
 * 装饰器类 --- 父类
 * 用来为基本的组件实现基本的扩展
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月30日 下午7:31:36
 */
public class Decorator extends Component{
	private Component component;
	
	public Decorator(Component component) {
		this.component =component; 
	}
	
	@Override
	public void read() {
		//谁实现read功能
		//将请求转发给component对象，转发后可执行一些扩展操作 
		component.read();
	}
}

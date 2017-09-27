package com.IoputDemo.decorator;
/**
 *  真正"干活的"组件类
 *  实现了基本的read方法
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月30日 下午7:28:00
 */
public class TrueComponet extends Component {
	@Override
	public void read() {
		System.out.println("TrueComponet实现的read方法");
		
	}
}

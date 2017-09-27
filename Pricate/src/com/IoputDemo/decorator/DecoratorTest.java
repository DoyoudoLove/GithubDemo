package com.IoputDemo.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
/**
 *   
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月30日 下午9:10:59
 */
public class DecoratorTest {

	public static void main(String[] args) throws FileNotFoundException {
		// 创建要被装饰的原始对象
		Component component = new TrueComponet();
		//为原始对象透明的增加功能
		ComponentImplA componentA = new ComponentImplA(component);
//		componentA.read();
		ComponentImplB componentB = new ComponentImplB(componentA);
		componentB.read(); 
		
//		InputStream inStream = new FileInputStream("");
//		//使用带缓存的的流对象装饰输入对象
//		BufferedInputStream bInStream = new BufferedInputStream(inStream);
		
	}

}

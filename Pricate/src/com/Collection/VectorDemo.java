package com.Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * Vector ---向量类
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月16日 下午5:26:51
 */
public class VectorDemo {
	
	public static void main(String[] args) {
		/*
		 * vector从Java1.0就已经存在,ArrayList从1.2才开始存在
		 * vector使用场景：javaME一些微小的版本都可以使用，但是ArrayList不可以
		 * 在Java1.2之前，Vector就被广泛的应用在Java设计中---因为他可以实现可变大小的数组
		 * 大多数的Swing的数据模型都使用了Vector
		 * 
		 * 
		*/
		Vector<String> vec = new Vector<>();
		/** boolean */
		vec.add("从你的全世界路过");
		/** void */
		vec.addElement("让我留在你身边");
		vec.add("那些年我们一起追过的女孩");
		
		System.out.println("size: " + vec.size());
		System.out.println("容量：" + vec.capacity());
		
		/** 修改向量的容量为当前大小 */
		vec.trimToSize();
		System.out.println("trim后的容量：" + vec.capacity());
		
		/** 为当前容量增加至指定大小 */
		vec.ensureCapacity(300);
		System.out.println("ensureCapacity后的容量" + vec.capacity());
		
		/** vector遍历 */
		for (int i = 0; i < vec.size(); i++) {
			System.out.print(vec.get(i) + ",");
		}
		System.out.println();
		
		/** 使用迭代器 */
		Iterator<String> vecIt = vec.iterator();
		while (vecIt.hasNext()) {
			System.out.print(vecIt.next() + ",");
		}
		System.out.println();
		
		/** 使用枚举遍历 -- 早期版本的方式 */
		Enumeration<String> vecEnum = vec.elements();
		while (vecEnum.hasMoreElements()) {
			
			System.out.print(vecEnum.nextElement() + ",");
		}
		System.out.println();
		/** 使用Lambda遍历 */
		vec.forEach(Str -> System.out.print(Str + ",") );
		System.out.println();
		
		System.out.println("第一个元素：" + vec.firstElement());
		System.out.println("最后一个元素：" + vec.lastElement());
		System.out.println("下标为1的元素：" + vec.get(1) + "\t" + vec.elementAt(1));
		System.out.println("删除下标为1的元素：");
		vec.removeElementAt(1);
		vec.forEach(str -> System.out.print(str + ","));
		
		
		
	}
	
}

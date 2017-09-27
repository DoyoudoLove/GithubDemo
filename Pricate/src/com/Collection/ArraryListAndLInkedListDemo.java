package com.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 使用ArrayList 和 LinkedList的区别
 * 	随机访问和删除、插入
 * 	建议使用父接口List,不用关心具体实现
 * 	具体的的情况下，传入或转换成相对应的子类型即可
 * 
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月16日 上午11:13:32
 */
public class ArraryListAndLInkedListDemo {
	public static void main(String[] args) {
//		list.addAll两个集合之间的转换
		System.out.println("使用ArrayList耗时：" + CostTime(new ArrayList<>()));
		
		System.out.println("使用LinkedList耗时：" + CostTime(new LinkedList<>()));
	}
	
	public static long CostTime(List<Object> list) {
		Object obj = new Object();
		long conent = 150000;
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < conent; i++) {
			//在集合最后一个位置添加元素
			list.add(obj);
			//向集合0号位置添加元素
			list.add(0, obj);
		}
		
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}
	
}

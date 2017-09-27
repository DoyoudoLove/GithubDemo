package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * 使用迭代器的好处 ： 在遍历集合时 不依赖某个类的实现
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月14日 下午7:40:08
 */
public class CollectionDemo {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("张飞");
		list1.add("刘备");
		list1.add("貂蝉");
		list1.add("曹丕");
		list1.add("周武");
		System.out.println(list1);
		//在第一个下标元素下插入数据
		list1.add(1 ,"王羲之");
		//替换下标所在的元素
		list1.set(2, "曾巩");
		System.out.println(list1);
		List<String> list2 = new ArrayList<>();
		list2.add("张在山");
		list2.add("王安石");
		list1.addAll(list2);
		//集合遍历 --- 1
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i) + ",");
		}
		System.out.println();
		//foreach ---- 2
		for (String str : list1) {
			System.out.print(str + ",");
		}
		System.out.println();
		//使用迭代器 --- 3
		Iterator<String> it = list1.iterator();
		//迭代器遍历 --- 内容相对固定
		while (it.hasNext()) {
			System.out.print(it.next() + ",");
		}
		System.out.println();
		//使用ListIterator --- 4
		ListIterator<String> listIt = list1.listIterator();
		while (listIt.hasNext()) {
			System.out.print(listIt.next() + ",");
		}
		System.out.println();
		/**
		 * 使用ListIterator 迭代器与 传统迭代器的区别
		 * 1.ListIterator不止可以向后访问，也可以向前访问
		 * 2.ListIterator 可以修改集合中的元素
		 */
		System.out.println("使用ListIterator实现元素的逆序输出");
		ListIterator<String> listIt2 = list1.listIterator(list1.size());
		while (listIt2.hasPrevious()) {
			System.out.print(listIt2.previous() + ",");
		}
		System.out.println();
		//使用迭代器修改元素
		ListIterator<String> listIt3 = list1.listIterator(3);
		if (listIt3.hasPrevious()) {
			listIt3.previous();
			listIt3.set("库克");
		}
		System.out.println(list1);
		
		System.out.println("删除下标为4的元素");
		list1.remove(4);
		System.out.println(list1);
		
		System.out.println("sublist(3,5)");
		System.out.println(list1.subList(3, 5));
	}
	
	
	
	
	
	
	
	

}

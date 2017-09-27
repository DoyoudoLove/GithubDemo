package com.Collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
/**
 * collections工具包装类的使用
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月17日 下午1:41:02
 */
public class CollectionsDemo {
	/**
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		List<Integer> inCollections = new ArrayList<>();
		
		inCollections.add(123);
		inCollections.add(104);
		inCollections.add(168);
		inCollections.add(112);
		inCollections.add(107);
		inCollections.add(256);
		inCollections.add(12);
		
		inCollections.forEach(value -> System.out.print(value + ","));
		System.out.println("\n排序后");
		Collections.shuffle(inCollections, new Random(20));
		inCollections.forEach(value -> System.out.print(value + ","));
		
		System.out.println("\n排序后");
		Collections.shuffle(inCollections, new Random(20));
		inCollections.forEach(value -> System.out.print(value + ","));
		//使用Collection的复制功能
		System.out.println("\n复制：");
		List<Integer> longCollection = new ArrayList<>();
		longCollection.add(0);
		longCollection.add(0);
		longCollection.add(0);
		longCollection.add(0);
		longCollection.add(0);
		longCollection.add(0);
		longCollection.add(0);
		longCollection.add(104);
		Collections.copy(longCollection, inCollections);
		longCollection.forEach(value -> System.out.print(value + ","));
		
		//查看集合中出现相同元素的次数
		System.out.println("\n返回集合中相同元素的次数" + Collections.frequency(longCollection, 104));
		
		//使用Arrays.list转换成list集合中，无法使用add方法
		List<String> list = Arrays.asList("abc","234");
//		list.add("123");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

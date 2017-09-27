package com.Collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * set接口的两大特点： 1.不允许重复相同数据 2.无序
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月17日 上午8:23:59
 */
public class SetDemo {

	public static void main(String[] args) {
		treeSetDemo();
	}
	
	public static void treeSetDemo() {
		
		TreeSet<String> setCity = new TreeSet<>(new Comparator<String>() {
					/** 使用treeSet中的比较方法 实现反序 */
					@Override
					public int compare(String o1, String o2) {
						if (o1.compareTo(o2) > 0) return -1;
						if (o1.compareTo(o2) < 0) return 1;
						return 0;
					}
		});
		
		setCity.add("New York");
		setCity.add("Toyko");
		setCity.add("Bei Jing");
		setCity.add("Shang Hai");
		setCity.add("Guang Zhou");
		setCity.forEach(str -> System.out.print(str + ","));
		System.out.println();
		
		System.out.println(setCity.higher("G"));
		System.out.println(setCity.lower("G"));
		System.out.println("Guang Zhou之前的元素：" + setCity.headSet("Guang Zhou"));
		System.out.println("Guang Zhou之后的元素：" + setCity.tailSet("Guang Zhou"));
		
		//setCity.pollFirst() 返回并删除第一个元素
		System.out.println("删除第一个元素" + setCity.pollFirst());
		setCity.forEach(str -> System.out.print(str + ","));
		System.out.println();
		System.out.println("删除最后一个元素" + setCity.pollLast());
		setCity.forEach(str -> System.out.print(str + ","));
	}
	
	
	
	
	
	
	
	
	
	
	
	

	public static void hashSetDemo() {
		//
		Set<String> setCity = new HashSet<>();
		
		setCity.add("New York");
		setCity.add("Toyko");
		setCity.add("Bei Jing");
		setCity.add("Shang Hai");
		setCity.add("Guang Zhou");
		setCity.forEach(str -> System.out.print(str + ","));
		
	}
	
	
	public static void LinkedSetDemo() {
		
		Set<String> setCity = new LinkedHashSet<>();
		
		setCity.add("New York");
		setCity.add("Toyko");
		setCity.add("Bei Jing");
		setCity.add("Shang Hai");
		setCity.add("Guang Zhou");
		setCity.forEach(str -> System.out.print(str + ","));
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

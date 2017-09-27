package com.Collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 本课笔记：
 * 	--了解Queue的使用方法 -- 用来存储一组队列方式的对象信息 以及 ArrayDeque的用法
 * 特点： 先进先出？
 * 	  入队 offer 出队 poll
 * 	  入栈 push 出栈 pop
 * 	offer：向队列中插入一个元素（类似add方法）
 * 	poll：获取并删除队列头元素，如果队列为空返回null
 * 	remove：获取并删除队列头元素，如果队列为空抛出异常
 * 	peek：获取但不删除队列头元素，如果队列为空返回null
 * 	element：获取但不删除队列头元素，如果队列为空抛出异常
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月17日 下午3:15:53
 */
public class QueueDemo {

	public static void main(String[] args) {
	
		ArrayDueueDemo();
		
	}
	
	public static void linkedListDemo() {
		
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("Jack");
		queue.offer("Nick");
		queue.offer("Lucy");
		queue.offer("Danny");
		queue.offer("Paul");
		
		queue.forEach(str -> System.out.print(str + ","));
		
		System.out.println("\n出队操作：" + queue.poll());
		queue.forEach(str -> System.out.print(str + ","));
		//peek出队找到并不删除元素
		System.out.println("\npeek出队操作:" + queue.peek());
		queue.forEach(str -> System.out.print(str + ","));
		
		//PriorityQueue优先队列
		//可以使用Comparable以元素的自然顺序排序，也可以使用Comparator子类按指定的顺序排序
		//拥有最小值的元素被赋予最高级，优先被删除
		queue = new PriorityQueue<>();
		
		
		
	}
	
	public static void ArrayDueueDemo() {
		//ArrayDueue是一个基于数组实现的双端队列，默认数组长度为16，不仅可以作为队使用 也可以作为栈使用
		//所以当元素超过集合的容量时，系统会在底层重新分配一个Object数组来存储数组
		
		ArrayDeque<String> arrayDeque = new ArrayDeque<>();
		
//		arrayDeque.offer("Jack");
//		arrayDeque.offer("Nick");
//		arrayDeque.offer("Lucy");
//		arrayDeque.offer("Danny");
//		arrayDeque.offer("Paul");
//		
//		System.out.println("出队操作" + arrayDeque.poll());
//		arrayDeque.forEach(str -> System.out.print(str + ","));
		
		//使用ArrayDequed当做栈结构使用，避免使用Stack,因为Stack比较古老，性能差
		//栈的特点：先入 后出 入栈---push 出栈---pop
		System.out.println("入栈");
		arrayDeque.push("Jack");
		arrayDeque.push("Nick");
		arrayDeque.push("Lucy");
		arrayDeque.push("Danny");
		arrayDeque.push("Paul");
		arrayDeque.push("Mark");
		
		arrayDeque.forEach(str -> System.out.print(str + ","));
		System.out.println("\n出栈" + arrayDeque.pop());
		arrayDeque.forEach(str -> System.out.print(str + ","));
		
		
	}
	
	
	

}

package com.Collection;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


/**
 * 三种图的用法
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月18日 上午10:46:20
 */
public class MapDemo {

	
	
	public static void main(String[] args) {

		//Map的使用用法();
		统计关键字出现的次数();		
	}
	private static void 统计关键字出现的次数() {
		final String fileName = "src/com/Collection/MapDemo.java";
		final String keyWords = "package, import, public, class, void, "
								+ "static, new, null, while, if, catch, try";
		//1.获取java源文件中的字符串（行的集合）
		List<String> contnetList = readerSourceFile(fileName);
		Set<String> keyWordSet = new HashSet<>();
		//将字符串转换成数组集合 keyWords.split(",")以逗号分隔转换成数组 -->转换成集合Arrays.asList()-->Set
		keyWordSet.addAll(Arrays.asList(keyWords.split(",")));
		
		//String[] keyWordArry = keyWords.split(",");  简单的做法
		//2.遍历关键字集合，统计每个源文件中关键字出现的次数 -- 将关键字以键值得方式存在Map集合中
		Map<String, Integer> keywordsMap = new HashMap<>();
		for (String keyword : keyWordSet) {//外循环遍历关键字的集合
			//去掉关键字之间的空格
			keyword = keyword.trim();
			for (String line : contnetList) {//内循环遍历源文件所有行
				//统计每一行keyword出现的次数（进行累加）
				int count = getLineKeyword(line, keyword);
				if (count == 0) continue;
				//将count放到Map集合
				if (keywordsMap.containsKey(keyword)) {
					//获取重复出现的次数 赋予oldCount
					int oldCount = keywordsMap.get(keyword).intValue();
					//再次将值 重新添加到keywordsMap.put中
					keywordsMap.put(keyword, new Integer(count + oldCount));
					
				} else {//关键字次数只出现一次
					keywordsMap.put(keyword, count);
				}
				
			}
		}
		
		//3.遍历集合Map
		for (Entry<String, Integer> entry : keywordsMap.entrySet()) {
			
			System.out.println(entry.getKey() + "---" + entry.getValue());
			
		}
		System.out.println("-------------------------------");
		//4.排序显示
		Map<String, Integer> trreeMap = new TreeMap<>(new compareByMap(keywordsMap));
		trreeMap.putAll(keywordsMap);
		for (Entry<String, Integer> entry : trreeMap.entrySet()) {
			System.out.println(entry.getKey() + "---" + entry.getValue());
		}
		
	}
	
	/**
	 * 统计每一行keyword出现的次数（进行累加）
	 * @param line
	 * @param keyword
	 * @return
	 */
	private static int getLineKeyword(String line, String keyword) {
		//没有或者长度为0 跳过
		if (line == null || line.length() == 0) return 0;
		//判断跳过注释
		if (line.startsWith("/*") || line.startsWith("*") || 
			line.startsWith("*/") || line.startsWith("//")
			) {
			return 0;
		}
		//判断字符串中的关键字
//		if (line.) {
//			
//		}
		int count = 0;
		//复制line的方法
		String strLine = new String(line);
		int index = -1;
		while ((index = strLine.indexOf(keyword)) != -1) {
			count++;
			//这里截取关键字长度 + 1 位置的关键字 int sum = 0; int sum1 = 0;
			strLine = strLine.substring(index + keyword.length() + 1);
		}
		return count;
	}
	/**
	 * 获取java源文件中的字符串
	 * @param fileName
	 * @return
	 */
	private static List<String> readerSourceFile(String fileName) {
		List<String> contentList = new ArrayList<>();
		try (
			FileReader filereader = new FileReader(fileName);
			BufferedReader bReader = new BufferedReader(filereader);	
			){
			String line = null;
			while ((line = bReader.readLine()) != null) {
				//如果前后还有空格 那么继续执行此操作
				if (line.trim().length() == 1) continue;
				contentList.add(line.trim());
			}
			
		} catch (Exception e) {
			
		}
		
		return contentList;
	}
	
	
	
	
	
	public static void Map的使用用法() {
		
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("M云飞", 18);
		hashMap.put("N斌", 19);
		hashMap.put("S启阳", 25);
		hashMap.put("N水生", 26);
		hashMap.put("R本发", 21);
		
		System.out.println("hashMap: " + hashMap);
	
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("周云飞", 19);
		linkedHashMap.put("吴斌", 17);
		linkedHashMap.put("万启阳", 21);
		linkedHashMap.put("余水生", 20);
		linkedHashMap.put("徐本发", 26);
		
		System.out.println("linkedHashMap: " + linkedHashMap);
		/**
		 * TreeMap<>() 可实现用户自定义排序
		 */
		Map<String, Integer> treeMap = new TreeMap<>();
		treeMap.putAll(linkedHashMap);
		System.out.println("treeMap: " + treeMap);
		System.out.println("排序后：");
		
		Map<String, Integer> treeMap1 = new TreeMap<>(new compareByMap(hashMap));
		treeMap1.putAll(hashMap);
		System.out.println("treeMap1: " + treeMap1);
	
		
		//遍历Map的方法 -- 1.通过keySet --- 常用：需要二次取值
		System.out.println("通过keySet遍历集合元素：");
		for (String key : treeMap.keySet()) {
			System.out.println(key + "--" + treeMap.get(key));
		}
		//2.通过entrySet 使用迭代器遍历key /value
		System.out.println("通过entrySet遍历集合元素：");
		Set<Map.Entry<String, Integer>> entrySet = treeMap.entrySet();
		//使用迭代器打印
		Iterator<Map.Entry<String, Integer>> entryIt = entrySet.iterator();
		while (entryIt.hasNext()) {
			Map.Entry<String, Integer> entryed  = entryIt.next();
			System.out.println(entryed.getKey() + "---" + entryed.getValue());
		}
		//3.使用Map.entrySet集合 --- 容量大时
		System.out.println("直接遍历Map.entrySet集合");
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + "---" + entry.getValue());
		}
	}
	

}

/**
 * Comparator<String> 实现的是键（key）的比较 string类型
 * ---2.实现值得比较 自定义属性
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月18日 上午11:00:00
 */
class compareByMap implements Comparator<String>{
	private Map<String, Integer> map;
	public compareByMap(Map<String, Integer> map) {
		this.map = map;
	}
	
	
	@Override
	public int compare(String key1, String key2) {
//		if (key1.compareTo(key2) > 0) return -1;
//		if (key1.compareTo(key2) < 0) return 1;
		/** 根据value值进行比较 */
		if (map.get(key1).intValue() > map.get(key2).intValue()) {
			return 1;
		}
		if (map.get(key1).intValue() < map.get(key2).intValue()) {
			return -1;
		}
		
		return 0;
	}
	
	
	
	
}





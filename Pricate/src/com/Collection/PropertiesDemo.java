package com.Collection;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;

/**
 * 配置文件的用法
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月19日 上午8:50:52
 */
public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		
		Properties proper = new Properties();
		//配置文件的加载方法 -- 固定
		proper.load(PropertiesDemo.class.getResourceAsStream("config.properties")); 
		//配置文件的读取方法 -- 当前文件没有就返回123
		String value = proper.getProperty("user1" ,"123");//通过key获取value值
		System.out.println(value);
		//写入
		proper.setProperty("user", "user-user1");
		proper.setProperty("name", "刘磊");
		FileOutputStream outStream = new FileOutputStream("bin/com/Collection/config.properties");
		proper.store(outStream, "comments注释");
		
		proper.load(PropertiesDemo.class.getResourceAsStream("config.properties")); 
		for (Entry<Object, Object> entry : proper.entrySet()) {
			System.out.println(entry.getKey() + "---" + entry.getValue());
		}
		
		
	}
	
}

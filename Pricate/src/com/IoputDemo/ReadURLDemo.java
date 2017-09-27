package com.IoputDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * 使用URL读取网页中的文件
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月6日 下午6:18:07
 */
public class ReadURLDemo {
	static final String filePath = "/Users/Super/Documents/163.html";
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://mc.163.com/index.html");
		StringBuffer content = new StringBuffer();
		
		//InputStreamReader字节流与字符流之间的装饰器
//		File file = new File(filePath);
//		if (!file.exists()) {
//			System.out.println("文件不存在");
//		}
		try (
				BufferedReader bReader = new BufferedReader(new InputStreamReader(url.openStream()))
			) {
			String line = null;
			while ((line = bReader.readLine()) != null) {
				content.append(line);
				content.append(System.getProperty("line.separator"));
			}
			
			//使用ReplaceLyricsDemo类中的方法写入文件
			ReplaceLyricsDemo.WriterFileByPrintWriter(content.toString(), filePath, false);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

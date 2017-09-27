package com.IoputDemo;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用字符流对文件进行基本的读写操作
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月31日 下午6:21:51
 */
public class ReadAndWriterDemo {
	private static final String filePath1 = "src/com/IoputDemo/FileDemo.java";
	private static final String filePath2 = "src/com/IoputDemo/BufferedWriter.txt";
	
	public static void main(String[] args) {
		
		//BufferedReaderByFile();
		BufferedWriterByFile();
	
	}
	/**
	 * 字符流文件读入方法
	 */
	private static void BufferedReaderByFile() {
		//使用前提：资源类必须实现Closeable接口
		try (BufferedReader bReader = new BufferedReader(new FileReader(filePath1))) {
			//固定的读取格式：
			String line = null;
			while ((line = bReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 字符流文件的写入操作
	 */
	private static void BufferedWriterByFile() {
		
		String conent = "Be the burning fire\n";
		conent += "File make your higher\n";
		conent += "Litter town has a big dream\n";
		conent += "That's one love";
		//使用了jdk7以后新增的自动关闭资源的写法
		//使用前提：资源类必须实现Closeable接口
		try (BufferedWriter bWriter = new BufferedWriter(new FileWriter(filePath2))) {
			//字符串写入缓存中
			bWriter.write(conent);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			//注意：由于bWriter.close会抛出IOException，这里的异常就被新结构抑制了
			//以下的代码用来查看被抑制的异常信息
			if (e.getSuppressed() != null) {
				Throwable[] throwables = e.getSuppressed();
				for (Throwable t : throwables) {
					System.err.println("异常信息:" + t.getMessage() + "cased by" + t.getClass().getSimpleName());
				}
			}
		}
	}
}

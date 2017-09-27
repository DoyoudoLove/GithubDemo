package com.IoputDemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


/**
 * 使用带缓冲的流量增加读写效率
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月29日 下午3:11:12
 */
public class BufferStreamDemo {
	/**
	 * 使用缓存流实现复制粘贴功能
	 * @param args
	 * @throws IOException
	 */
	private static final String filePath1 = "/Users/Super/Documents/Adobe/Premiere Pro/11.0/Android.mp4";
	private static final String filePath2 = "/Users/Super/Documents/Adobe/Premiere Pro/11.0/已复制.mp4";
	private static final FilterInputStream BinStream = null;
	
	public static void main(String[] args) throws IOException {
		
		long time =   copyFileByBufferendStream();
		System.out.println("文件拷贝用时" + time + "毫秒");
		
//		BufferedInputStream bInStream = new BufferedInputStream(System.in);
//		byte[] bytes = new byte[200];
//		System.out.println("请输入字符串:");
//		bInStream.read(bytes);
//		System.out.println("用户输入的字符串内容是: " + new String(bytes));

		
	}
	/**
	 * 使用缓存流拷贝文件 
	 * @return 返回用时 （毫秒）
	 */
	private static long copyFileByBufferendStream() {
		File file = new File(filePath1);//要复制的文件对象
		if (!file.exists()) {
			System.out.println("文件拷贝失败，请检查路径是否正确！");
			return 0;
		}
		long startTime = System.currentTimeMillis();
		//输入流
		InputStream inStream = null;
		//缓存流
		BufferedInputStream bInStream = null;
		//输出流
		OutputStream outStram = null;
		//缓存流
		BufferedOutputStream bOutStream = null;
		try {
			inStream = new FileInputStream(file);
			//装饰器 
			bInStream = new BufferedInputStream(inStream);
			outStram = new FileOutputStream(filePath2);
			bOutStream = new BufferedOutputStream(outStram);
			int i = -1; //读取出的临时变量
			while ((i = bInStream.read()) != -1) {
				bOutStream.write(i);
				
				//读取一个字节  就写入到缓存中去
				//需要 清空缓存区
			}
			System.out.println("文件复制成功");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//bOutStream.flush();
				//可以直接调用close方法
				bOutStream.close();
				outStram.close();
				bInStream.close();
				inStream.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
		long endTime = System.currentTimeMillis();
		
		return endTime - startTime;
	}
	
	
	
	
	
//	static final String filePath1 = "src/com/IoputDemo/FileStreamDemo.java";
//	static final String filePath2 = "src/com/IoputDemo/BufferTest.txt";
//	public static void main(String[] args) {
//		
//		FileInputStream fInputStream = null;
//		BufferedInputStream bInputStream = null;
//		try {
//			fInputStream = new FileInputStream(filePath1);
//			bInputStream = new BufferedInputStream(fInputStream);
//			byte[] bytes = new byte[bInputStream.available()];
//			//核心读入操作
//			bInputStream.read(bytes);
//			System.out.println(new String(bytes));
//		} catch (FileNotFoundException e) {
//			//捕获文件未找到异常
//			e.printStackTrace();
//		} catch (IOException e) {
//			//捕获文件读入异常
//			e.printStackTrace();
//		} finally {
//			try {
//				bInputStream.close();
//				fInputStream.close();
//			} catch (IOException e) {
//				// 显示异常
//				e.printStackTrace();
//			}
//		}
//		
//		BufferedOutputStream bOutputStream = null;
//		try {
//			bOutputStream = new BufferedOutputStream(new FileOutputStream(filePath2));
//			//核心 ： 写入操作
//			bOutputStream.write(" Be the Burning Fire \n Fire make your higher \n Litter town has a big dream \n That's one love".getBytes());
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				bOutputStream.close();
//			} catch (IOException e) {
//				// 显示异常
//				e.printStackTrace();
//			}
//		}

//		
//	}
}

package com.IoputDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用FileInputStream进行文件复制
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月31日 上午9:42:52
 */
public class FileStreamByBufferDemo {
	private static final String filePath1 = "/Users/Super/Documents/Adobe/Premiere Pro/11.0/Android.mp4";
	private static final String filePath2 = "/Users/Super/Documents/Adobe/Premiere Pro/11.0/fileInputStream复制.mp4";
	public static void main(String[] args) {
		
		long time = CopyFileByFileStream();
		System.out.println("使用FileInputStream用时" + time + "毫秒");

	}
	private static long CopyFileByFileStream() {
		long startTime = System.currentTimeMillis();
		//进行文件复制
		File file = new File(filePath1);
		if (!file.exists()) {
			System.out.println("文件复制失败！请检路径是否输入正确！");
		}
		FileInputStream inStream = null;
		FileOutputStream outStream = null;
		try {
			//读取file文件内容 --- 输入流
			inStream = new FileInputStream(file);
			//写入到filePath2中去  --- 输出流
			outStream = new FileOutputStream(filePath2);
			
//			byte[] bytes = new byte[102400];
			int i= -1;
			while ((i = inStream.read()) != -1) {
				outStream.write(i);
			}
			System.out.println("文件复制成功");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				outStream.close();
				inStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		long endTime = System.currentTimeMillis();
		
		return endTime - startTime;
	}

}

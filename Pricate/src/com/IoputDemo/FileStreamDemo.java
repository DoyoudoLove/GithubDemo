package com.IoputDemo;
/**
 * 演示文件的输入输出流的基本用法
 * 	目前读写方法较为原始，熟悉InputStream/OutputStream的一些常用方法
 * 	InputStream/OutputStream 均为抽象类 需要子类去实现
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月29日 上午9:02:42
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamDemo {
	private static final String filePath = "src/com/IoputDemo/FileDemo1.java";
	public static void main(String[] args) throws IOException {
		WriteFile();
		ReadFile();
		
	}
	/**
	 * 写入文件内容
	 * 这里通过 OutputStream 写入文件
	 * @throws IOException
	 */
	public static void WriteFile() throws IOException {
		//FileDemo1.java默认不存在
		final String filePath1 = "src/com/IoputDemo/FileDemo1.java";
//		OutputStream outStream = new FileOutputStream(filePath1);
		/**
		 * 是否追加写入 true 追加
		 * 			  false 覆盖写入
		 */
		OutputStream outStream = new FileOutputStream(filePath1, false);
		String content ="package com.IoputDemo;\n";
		content += "class FileDemo1{\n";
		content += "public static void main (String[] args) {\n";
		content += "\tSystem.out.println(\" Hello World! \");\n\t}\n}";
		outStream.write(content.getBytes());//核心语句：将字符串转换成字节数组，写入到文件中
		//写入结束后 关闭打开的资源
		outStream.close();
		
	}
	/**
	 * 读取文件
	 * @throws IOException
	 */
	public static void ReadFile() throws IOException {
		File file = new File(filePath);
		//系统报错： 提示用户异常 抛出未找到文件异常
		InputStream inputStream = new FileInputStream(file);
		//读取文件的基本操作
		//inputStream.available() 读取文件大小（字节）----一般情况下出现读取数组异常时 设置指定长度即可
		byte[] bytes = new byte[3800];
		inputStream.read(bytes);
//		int count = 0;
//		while ((bytes[count] = (byte)inputStream.read()) != -1) {
//			count++;
//		}
		String content = new String(bytes);
		System.out.println(content);
		inputStream.close();
	}
}

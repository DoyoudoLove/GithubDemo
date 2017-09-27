package com.IoputDemo;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * 修改歌词内容 ---字符流--实际上就是对文件的读写操作
 * 先读出文件
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月1日 下午2:28:11
 */
public class ReplaceLyricsDemo {
	static final String filePath = "/Users/Super/Documents/lyrics.txt";
	static final String filePath1 = "src/com/IoputDemo/newlyrics.txt";
	/**
	 * 字符流
	 * 读取文件的操作分装在方法中，方便以后的使用
	 * @param filePath
	 * @return
	 */
	public static void main(String[] args) {
		
		String content = ReadFileByReader(filePath);
		//WriterFileByWritter(content);
		WriterFileByPrintWriter(content, filePath1, false);
		
	}
	/**
	 * 使用printWriter对象写入文件
	 * 对应的读取操作是Scanner
	 * @param filePath
	 * @param isAppend
	 */
	public static void WriterFileByPrintWriter(String content,String filePath, boolean isAppend) {
		/**
		 * 这里的FileOutputStream方法中filePath的文件名称为要读写的文件，isAppend表示是否对文件进行追加
		 */
		try (
				FileOutputStream outStream = new FileOutputStream(filePath, isAppend);
				PrintWriter writer = new PrintWriter(outStream);
			){
			writer.print(content);
			System.out.println("写入成功");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 使用带字符流读取文件中的内容
	 * @param filePath
	 * @return
	 */
	public static String ReadFileByReader(String filePath) {

		
		StringBuffer conent = new StringBuffer();
		FileReader reader = null;
		BufferedReader breader = null;
		try {
			 reader = new FileReader(filePath);
			 breader = new BufferedReader(reader);
			 //循环读取文件中的内容
			 String line = null;
			 while ((line = breader.readLine()) != null) {
				 conent.append(line);
				 conent.append(System.getProperty("line.separator"));
			 } 
			 //删除最后的系统分割符
			 conent.delete(conent.toString().lastIndexOf(System.getProperty("line.separator")), conent.toString().length());
			 System.out.println("读取成功");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				breader.close();
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		return conent.toString();
	}
	/**
	 * 使用带字符流复制文件中的内容
	 */
	//	public static void WriterFileByWritter(String content) {
//		Writer writer = null;
//		BufferedWriter bWriter = null;
//		
//		try {
//			writer = new FileWriter(filePath1);
//			bWriter = new BufferedWriter(writer);
//			bWriter.write(content);
//			
//			System.out.println("写入成功");
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				bWriter.flush();
//				bWriter.close();
//				writer.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			
//		}
//		
//		
//	}
	
	
	/**
	 * 歌词替换
	 * 第一种方式 字符流
	 */
//	public static void main(String[] args) {
//		//使用字符流进行操作 Reader是父类 所以不能是实例化 需要子类去实例
//		Reader reader = null;
//		BufferedReader bReader = null;
//		Writer writer = null;
//		BufferedWriter bWriter = null;
//		StringBuffer lyrics = new StringBuffer();
//		try {
//			reader = new FileReader(filePath);
//			//使用带缓冲的字符流
//			bReader = new BufferedReader(reader);
//			//得到歌词 替换
//			String line = null;
//			while ((line = bReader.readLine())  != null) {
//				lyrics.append(line);
//				//固定格式 拼接系统默认分隔符
//				lyrics.append(System.getProperty("line.separator"));
//			}
//			System.out.println("读取成功");
////			System.out.println(lyrics);
//			/**
//			 * --将读取的内容转换为字符串
//			 *   通过toString方法中的replaceAll方法替换文本中的内容
//			 */
//			String newlyrics = lyrics.toString().replaceAll("魏玲花", "魏玲花：").replaceAll("曾毅", "曾毅：");
//			//将歌词写入文件
//			writer = new FileWriter(filePath);
//			bWriter = new BufferedWriter(writer);
//			bWriter.write(newlyrics);
//			System.out.println("替换成功！");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				bReader.close();
//				reader.close();
////				bWriter.flush();
//				bWriter.close();
//				writer.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			
//		}
//		
//		
//		
//	}
	

}

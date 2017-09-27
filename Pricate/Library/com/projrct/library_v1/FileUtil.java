package com.projrct.library_v1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 * 使用IO流进行图书的读写操作
 * 文件工具类，包含对文件的读写静态方法，方便使用
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月14日 上午8:38:37
 */
public class FileUtil {
	/** 图书存放的位置  */
	private static final String fileBook = "Library/com/projrct/library_v1/bookInfo.txt";
	/** 系统默认的属性分隔符 */
	private static final String sepAttribute = ",";
	/** 系统默认的换行分隔符 separator --> 分离器*/
	private static final String sepLine = System.getProperty("line.separator");
	/**
	 * 传入图书对象数组 ---- 本方法会覆盖原来的文件内容
	 * @param bookArray
	 */
	public static void saveBooks(Book ... bookArray) {
		//假设传入的图书对象数组不存在 或者为null
		if (bookArray == null || bookArray.length == 0) {
			return;
		}
		BookBiz bookBiz = new BookBiz();
		//创建字符串的缓存
		StringBuilder strContent = new StringBuilder();
		File file = new File(fileBook);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		/**
		 * 对出传入的图书对象数组元素进行写入操作
		 */
		try(
			FileWriter write = new FileWriter(file);
			BufferedWriter bWrite = new BufferedWriter(write);
			) {
			//实现简单的属性拼接
			int bookCount = bookBiz.getBookCount(bookArray);//获取当前对象图书对象个数
			for (int i = 0; i < bookCount; i++ ) {
				strContent.append(bookArray[i].getBookId());  	strContent.append(sepAttribute);
				strContent.append(bookArray[i].getBookName()); 	strContent.append(sepAttribute);
				strContent.append(bookArray[i].getISBN());	strContent.append(sepAttribute);
				strContent.append(bookArray[i].getPrice());	strContent.append(sepAttribute);
				strContent.append(bookArray[i].getCount());		strContent.append(sepLine);
			}
			bWrite.write(strContent.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	/**
	 *从文件读取内容，将内容进行拆解，重新整合对象、对象数组并返回 
	 * @return
	 */
	public static Book[] loadBooks() {
		File file = new File(fileBook);
		if (!file.exists()) {
			return null;
		}
		//读取的数组长度只限于999
		Book[] bookArray = new Book[999];
		try (
				FileReader reader = new FileReader(file);
				BufferedReader bReader = new BufferedReader(reader);
			) {
			String line = null;
			int count = 0;
			while ((line = bReader.readLine()) != null) {
				Book currBook = new Book();
				//读取字符串中的属性分隔符
				String[] attrs = line.split(sepAttribute);
				//将读取的一行内容以属性分割符的形式
				currBook.setBookId(attrs[0].trim());
				currBook.setBookName(attrs[1].trim());
				currBook.setISBN(attrs[2].trim());
				currBook.setPrice(Double.parseDouble(attrs[3].trim()));
				currBook.setCount(Integer.parseInt(attrs[4].trim()));
				//将构建成功的图书对象添加到对象数组中，以便返回
				bookArray[count++] = currBook; 
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return bookArray;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

package Util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.entity.BookInfo;

/**
 * 文件工具类
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月23日 下午10:23:33
 */
public class FileUtil {

	public static final String BookInfoFilePath = "BookInfo.dat";//默认相对本程序的工程根目录
	/**
	 * 将传入的BookInfo的map信息存放到对应的文件中
	 * @param bookInfoMap
	 */
	public static void SaveBookInfos(Map<String, BookInfo> bookInfoMap) {
		SaveObject(bookInfoMap, BookInfoFilePath);
		
	}
	/**
	 * 将文件读取成对象
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static Map<String, BookInfo> ReadBookInfoMap() {
		
	   Object obj = ReadObject(BookInfoFilePath);
	   if (null == obj) return null;
	   return (Map<String, BookInfo>)obj;
		
	}
	
	
	/**
	 * 通用的保存对象 
	 * @param object 传入的对象
	 * @param filePath 要保存的文件路径	
	 */
	 public static void SaveObject(Object object, String filePath) {
		 try (
				FileOutputStream fout = new FileOutputStream(filePath, false); 
				ObjectOutputStream out = new ObjectOutputStream(fout);  
			) {
			out.writeObject(object);
		} catch (IOException e) {
			e.printStackTrace();
		}
	 }
	 /**
	  * 从文件中获取对象
	  * @param filePath
	  * @return
	  */
	
	 public static Object ReadObject(String filePath) {
		 
		 try (
				 FileInputStream fin = new FileInputStream(filePath);
				 ObjectInputStream in = new ObjectInputStream(fin);
			) {
			return in.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		 
		 return null;
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	
}

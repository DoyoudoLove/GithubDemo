package com.IoputDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用随机读取文件流RandomAccessFile
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月7日 上午9:36:17
 */
public class RandomAccessFileDemo {
	static final String filePath = "src/com/IoputDemo/RandFile.txt";
	static final String filePath1 = "/Users/Super/Documents/163.html";
	
	private static void copyFile() {
		//源文件
		File srcFile = new File(filePath1);
		//要复制到哪里的文件
		File newFile = new File(filePath);
		try (
				RandomAccessFile randomFile = new RandomAccessFile(srcFile, "r");
				RandomAccessFile newRandomFile = new RandomAccessFile(newFile, "rw");
			) {
			long fileLength = srcFile.length();//获取复制文件大小
			byte[] bytes = new byte[(int)fileLength];
			randomFile.readFully(bytes);
			//将字节数组写入到新文件中即可
			newRandomFile.setLength(0); //复制前切记把文件中的内容清除
			newRandomFile.write(bytes);
			System.out.println("文件复制成功");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		copyFile();
		 
		
//		File file = new File(filePath);
//		if (!file.exists()) {
//			file.createNewFile();
//		}
//		//读取文件内容
//		try (
//				RandomAccessFile randomFile = new RandomAccessFile(filePath, "rw");
//				
//			) {
////			randomFile.setLength(0); //强制文件归零 --  删除文件内容
//			//写入200整型数据
//			for (int i = 0; i < 200; i++) {
//				randomFile.writeInt(i + 200);
//			}
//			System.out.println("当前文件大小：" + randomFile.length() + "字节");
//			randomFile.seek(4 * 8);
//			System.out.println("移动8个整型空间后（32）字节的值为" + randomFile.readInt());
//			randomFile.seek(4 * 80);   //移动到80个整型处
//			randomFile.writeInt(800);  //将第80个整型修改为800
//			randomFile.seek(4 * 80);	   //再次将文件指针移动到第80个整型处
//			System.out.println("移动800个整型空间后（320）字节的值为" + randomFile.readInt());
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
//
	}

}

package com.IoputDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JPopupMenu.Separator;

/**
 * 
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月6日 上午10:34:31
 */
public class PrinterWriterDemo {
	private static final String filePath = "src/com/IoputDemo/FileDemo2.java";
	public static void main(String[] args) {
		
		printWriter();
		printReader();
	}
	/**
	 * PrinterWriter
	 */
	static String separator = System.getProperty("line.separator");//
	public static void printWriter() {
		//
		String conent = "package com.IoputDemo;" + separator;
		conent += "public class FileDemo2 {" + separator;
		conent += "\tpublic static void main(String[] args) {" + separator;
		conent += "\t\tSystem.out.println(\" Hello World! \");" + separator;
		conent += "\t}" + separator;
		conent += "}";
		try (PrintWriter writer1 = new PrintWriter(new FileWriter(filePath))) {
			writer1.write(conent);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	/**
	 * printWriter写入数据
	 */
	public static void printReader() {
		try (Scanner input = new Scanner(new File(filePath))) {
			StringBuffer value = new StringBuffer();
			String line = null;
			while(input.hasNextLine()) {
				value.append(input.nextLine());
				value.append(separator);
			}
			System.out.println(value.toString());
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}

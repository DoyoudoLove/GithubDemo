package com.IoputDemo;
/**
 * ��ʾ�ļ�������������Ļ����÷�
 * 	Ŀǰ��д������Ϊԭʼ����ϤInputStream/OutputStream��һЩ���÷���
 * 	InputStream/OutputStream ��Ϊ������ ��Ҫ����ȥʵ��
 * @author SugarMan
 * @version 1.0
 * @time 2017��8��29�� ����9:02:42
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
	 * д���ļ�����
	 * ����ͨ�� OutputStream д���ļ�
	 * @throws IOException
	 */
	public static void WriteFile() throws IOException {
		//FileDemo1.javaĬ�ϲ�����
		final String filePath1 = "src/com/IoputDemo/FileDemo1.java";
//		OutputStream outStream = new FileOutputStream(filePath1);
		/**
		 * �Ƿ�׷��д�� true ׷��
		 * 			  false ����д��
		 */
		OutputStream outStream = new FileOutputStream(filePath1, false);
		String content ="package com.IoputDemo;\n";
		content += "class FileDemo1{\n";
		content += "public static void main (String[] args) {\n";
		content += "\tSystem.out.println(\" Hello World! \");\n\t}\n}";
		outStream.write(content.getBytes());//������䣺���ַ���ת�����ֽ����飬д�뵽�ļ���
		//д������� �رմ򿪵���Դ
		outStream.close();
		
	}
	/**
	 * ��ȡ�ļ�
	 * @throws IOException
	 */
	public static void ReadFile() throws IOException {
		File file = new File(filePath);
		//ϵͳ���� ��ʾ�û��쳣 �׳�δ�ҵ��ļ��쳣
		InputStream inputStream = new FileInputStream(file);
		//��ȡ�ļ��Ļ�������
		//inputStream.available() ��ȡ�ļ���С���ֽڣ�----һ������³��ֶ�ȡ�����쳣ʱ ����ָ�����ȼ���
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

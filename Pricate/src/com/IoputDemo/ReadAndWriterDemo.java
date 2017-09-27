package com.IoputDemo;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ʹ���ַ������ļ����л����Ķ�д����
 * @author SugarMan
 * @version 1.0
 * @time 2017��8��31�� ����6:21:51
 */
public class ReadAndWriterDemo {
	private static final String filePath1 = "src/com/IoputDemo/FileDemo.java";
	private static final String filePath2 = "src/com/IoputDemo/BufferedWriter.txt";
	
	public static void main(String[] args) {
		
		//BufferedReaderByFile();
		BufferedWriterByFile();
	
	}
	/**
	 * �ַ����ļ����뷽��
	 */
	private static void BufferedReaderByFile() {
		//ʹ��ǰ�᣺��Դ�����ʵ��Closeable�ӿ�
		try (BufferedReader bReader = new BufferedReader(new FileReader(filePath1))) {
			//�̶��Ķ�ȡ��ʽ��
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
	 * �ַ����ļ���д�����
	 */
	private static void BufferedWriterByFile() {
		
		String conent = "Be the burning fire\n";
		conent += "File make your higher\n";
		conent += "Litter town has a big dream\n";
		conent += "That's one love";
		//ʹ����jdk7�Ժ��������Զ��ر���Դ��д��
		//ʹ��ǰ�᣺��Դ�����ʵ��Closeable�ӿ�
		try (BufferedWriter bWriter = new BufferedWriter(new FileWriter(filePath2))) {
			//�ַ���д�뻺����
			bWriter.write(conent);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			//ע�⣺����bWriter.close���׳�IOException��������쳣�ͱ��½ṹ������
			//���µĴ��������鿴�����Ƶ��쳣��Ϣ
			if (e.getSuppressed() != null) {
				Throwable[] throwables = e.getSuppressed();
				for (Throwable t : throwables) {
					System.err.println("�쳣��Ϣ:" + t.getMessage() + "cased by" + t.getClass().getSimpleName());
				}
			}
		}
	}
}

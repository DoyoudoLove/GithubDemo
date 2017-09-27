package com.IoputDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ʹ��FileInputStream�����ļ�����
 * @author SugarMan
 * @version 1.0
 * @time 2017��8��31�� ����9:42:52
 */
public class FileStreamByBufferDemo {
	private static final String filePath1 = "/Users/Super/Documents/Adobe/Premiere Pro/11.0/Android.mp4";
	private static final String filePath2 = "/Users/Super/Documents/Adobe/Premiere Pro/11.0/fileInputStream����.mp4";
	public static void main(String[] args) {
		
		long time = CopyFileByFileStream();
		System.out.println("ʹ��FileInputStream��ʱ" + time + "����");

	}
	private static long CopyFileByFileStream() {
		long startTime = System.currentTimeMillis();
		//�����ļ�����
		File file = new File(filePath1);
		if (!file.exists()) {
			System.out.println("�ļ�����ʧ�ܣ����·���Ƿ�������ȷ��");
		}
		FileInputStream inStream = null;
		FileOutputStream outStream = null;
		try {
			//��ȡfile�ļ����� --- ������
			inStream = new FileInputStream(file);
			//д�뵽filePath2��ȥ  --- �����
			outStream = new FileOutputStream(filePath2);
			
//			byte[] bytes = new byte[102400];
			int i= -1;
			while ((i = inStream.read()) != -1) {
				outStream.write(i);
			}
			System.out.println("�ļ����Ƴɹ�");
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

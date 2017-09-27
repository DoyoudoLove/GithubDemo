package com.IoputDemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


/**
 * ʹ�ô�������������Ӷ�дЧ��
 * @author SugarMan
 * @version 1.0
 * @time 2017��8��29�� ����3:11:12
 */
public class BufferStreamDemo {
	/**
	 * ʹ�û�����ʵ�ָ���ճ������
	 * @param args
	 * @throws IOException
	 */
	private static final String filePath1 = "/Users/Super/Documents/Adobe/Premiere Pro/11.0/Android.mp4";
	private static final String filePath2 = "/Users/Super/Documents/Adobe/Premiere Pro/11.0/�Ѹ���.mp4";
	private static final FilterInputStream BinStream = null;
	
	public static void main(String[] args) throws IOException {
		
		long time =   copyFileByBufferendStream();
		System.out.println("�ļ�������ʱ" + time + "����");
		
//		BufferedInputStream bInStream = new BufferedInputStream(System.in);
//		byte[] bytes = new byte[200];
//		System.out.println("�������ַ���:");
//		bInStream.read(bytes);
//		System.out.println("�û�������ַ���������: " + new String(bytes));

		
	}
	/**
	 * ʹ�û����������ļ� 
	 * @return ������ʱ �����룩
	 */
	private static long copyFileByBufferendStream() {
		File file = new File(filePath1);//Ҫ���Ƶ��ļ�����
		if (!file.exists()) {
			System.out.println("�ļ�����ʧ�ܣ�����·���Ƿ���ȷ��");
			return 0;
		}
		long startTime = System.currentTimeMillis();
		//������
		InputStream inStream = null;
		//������
		BufferedInputStream bInStream = null;
		//�����
		OutputStream outStram = null;
		//������
		BufferedOutputStream bOutStream = null;
		try {
			inStream = new FileInputStream(file);
			//װ���� 
			bInStream = new BufferedInputStream(inStream);
			outStram = new FileOutputStream(filePath2);
			bOutStream = new BufferedOutputStream(outStram);
			int i = -1; //��ȡ������ʱ����
			while ((i = bInStream.read()) != -1) {
				bOutStream.write(i);
				
				//��ȡһ���ֽ�  ��д�뵽������ȥ
				//��Ҫ ��ջ�����
			}
			System.out.println("�ļ����Ƴɹ�");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//bOutStream.flush();
				//����ֱ�ӵ���close����
				bOutStream.close();
				outStram.close();
				bInStream.close();
				inStream.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
		long endTime = System.currentTimeMillis();
		
		return endTime - startTime;
	}
	
	
	
	
	
//	static final String filePath1 = "src/com/IoputDemo/FileStreamDemo.java";
//	static final String filePath2 = "src/com/IoputDemo/BufferTest.txt";
//	public static void main(String[] args) {
//		
//		FileInputStream fInputStream = null;
//		BufferedInputStream bInputStream = null;
//		try {
//			fInputStream = new FileInputStream(filePath1);
//			bInputStream = new BufferedInputStream(fInputStream);
//			byte[] bytes = new byte[bInputStream.available()];
//			//���Ķ������
//			bInputStream.read(bytes);
//			System.out.println(new String(bytes));
//		} catch (FileNotFoundException e) {
//			//�����ļ�δ�ҵ��쳣
//			e.printStackTrace();
//		} catch (IOException e) {
//			//�����ļ������쳣
//			e.printStackTrace();
//		} finally {
//			try {
//				bInputStream.close();
//				fInputStream.close();
//			} catch (IOException e) {
//				// ��ʾ�쳣
//				e.printStackTrace();
//			}
//		}
//		
//		BufferedOutputStream bOutputStream = null;
//		try {
//			bOutputStream = new BufferedOutputStream(new FileOutputStream(filePath2));
//			//���� �� д�����
//			bOutputStream.write(" Be the Burning Fire \n Fire make your higher \n Litter town has a big dream \n That's one love".getBytes());
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				bOutputStream.close();
//			} catch (IOException e) {
//				// ��ʾ�쳣
//				e.printStackTrace();
//			}
//		}

//		
//	}
}

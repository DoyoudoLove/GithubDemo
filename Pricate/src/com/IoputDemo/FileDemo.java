package com.IoputDemo;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Date;

import javax.swing.JFileChooser;

/**
 * ��ʾFile�����ʹ�ü�����
 * @author SugarMan
 * @version 1.0
 * @time 2017��8��26�� ����10:42:03
 */
public class FileDemo {
	//private static final String fileName =  ".";
	
	public static void main(String[] args) throws IOException {
		//�����ļ�ѡ��Ի��� Ĭ��·��Ϊ��Ŀ¼
		JFileChooser fileChooser = new JFileChooser(new File("."));
		//���û�����ѡ���ļ���
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		fileChooser.setFileFilter(new MyFileletter());
		//��ʾ��ѡ���ļ��ĶԻ���(null��ʾ�޸�����)
		fileChooser.showOpenDialog(null);
		//��ȡ�û�ѡ����ļ�
		File file = fileChooser.getSelectedFile();
		//����û�ѡ����ļ� ����ʹ��ʱ�ж�file�Ƿ�Ϊnull�����Ϊnull��ʾ�û�����ȡ���İ�ť
		if (null == file) {
			System.out.println("�û�δѡ���κ��ļ���ϵͳǿ���˳�");
			System.exit(0);;
		}
		System.out.println("�ļ�/�ļ����Ƿ����: " + file.exists());
		System.out.println("�Ƿ���һ���ļ�: " + file.isFile());
		System.out.println("�Ƿ���һ���ļ���: " + file.isDirectory());
		System.out.println("�ļ�/�ļ�������: " + file.getName() );
		System.out.println("�ļ��еľ���·��: " + file.getAbsolutePath());
		System.out.println("�ļ���·��: " + file.getPath());
		System.out.println("�ļ������޸�ʱ��: " + new Date(file.lastModified()).toLocaleString());
		System.out.println("�Ƿ�����: " + file.isHidden());
		System.out.println("�Ƿ�ɶ�: " + file.canRead());
		System.out.println("�Ƿ��д: " + file.canWrite());
		System.out.println("��ռ�ռ�: " + file.length() / 1024 + "KB");
		
		//ʹ��file�ഴ���ļ�
//		if(!file.exists()) {//����ļ�/�ļ��� ������
//			System.out.println("�����ļ�");
//			if (file.isFile()) { //������ļ�
//				file.createNewFile(); //�����ļ�
//				//System.out.println("�����ɹ�");
//			} else
//				file.mkdirs();
//				System.out.println("�����ɹ�");
//			
//		} else 
//			System.out.println("�ļ��Ѿ�����!");
//		
		
		//ɾ���ļ�
//		if (file.exists()) {//����ļ�����
//			file.delete();	//������ɾ��
//			//file.deleteOnExit();	//�����˳���ɾ��
//			System.out.println("�ļ�ɾ���ɹ�!");
//		}
		
		//�г��ļ� 
		if (file.isDirectory()) {
			System.out.println(file.getAbsolutePath() + "�µ������ļ�:");
			String[] list = file.list(new DirFilter());
			for (int i = 0; i < list.length; i++) {
				System.out.println(list[i]);
			}
		}
	
	}
	/**
	 * �̳�javax.swing.filechooser.FileFilter���� ʵ�ֶԻ������
	 * @author SugarMan
	 * @version 1.0
	 * @time 2017��8��26�� ����1:15:22
	 */
	static class MyFileletter extends javax.swing.filechooser.FileFilter{

		@Override
		public boolean accept(File f) {
			if (f.getName().endsWith("java")) {
				return true;
			}
			
			return false;
		}

		@Override
		public String getDescription() {
			// ɸѡ�Ժ�׺����β���ļ� ��.*wav .*txt
			return ".*, *class";
		}
		
	}

	//�ļ�ɸѡ
	/**
	 * �Զ�����ļ���������������ʵ��FilenameFilter�ӿ�
	 * @author SugarMan
	 * @version 1.0
	 * @time 2017��8��26�� ����1:14:37
	 */
	static class DirFilter implements FilenameFilter{
		@Override
		public boolean accept(File dir, String name) {
			if (name.endsWith("classpath") || name.endsWith("project")) {
				return true;
			}
			return false;//���������True ��ô��������ʾ
		}
	}
}


	

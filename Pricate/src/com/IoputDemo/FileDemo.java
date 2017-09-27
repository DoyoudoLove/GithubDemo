package com.IoputDemo;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Date;

import javax.swing.JFileChooser;

/**
 * 演示File类基本使用及操作
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月26日 上午10:42:03
 */
public class FileDemo {
	//private static final String fileName =  ".";
	
	public static void main(String[] args) throws IOException {
		//创建文件选择对话框 默认路径为根目录
		JFileChooser fileChooser = new JFileChooser(new File("."));
		//让用户可以选择文件夹
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		fileChooser.setFileFilter(new MyFileletter());
		//显示出选择文件的对话框(null表示无父窗体)
		fileChooser.showOpenDialog(null);
		//获取用户选择的文件
		File file = fileChooser.getSelectedFile();
		//获得用户选择的文件 建议使用时判断file是否为null，如果为null表示用户点了取消的按钮
		if (null == file) {
			System.out.println("用户未选择任何文件！系统强制退出");
			System.exit(0);;
		}
		System.out.println("文件/文件夹是否存在: " + file.exists());
		System.out.println("是否是一个文件: " + file.isFile());
		System.out.println("是否是一个文件夹: " + file.isDirectory());
		System.out.println("文件/文件夹名称: " + file.getName() );
		System.out.println("文件夹的绝对路径: " + file.getAbsolutePath());
		System.out.println("文件的路径: " + file.getPath());
		System.out.println("文件最后的修改时间: " + new Date(file.lastModified()).toLocaleString());
		System.out.println("是否隐藏: " + file.isHidden());
		System.out.println("是否可读: " + file.canRead());
		System.out.println("是否可写: " + file.canWrite());
		System.out.println("所占空间: " + file.length() / 1024 + "KB");
		
		//使用file类创建文件
//		if(!file.exists()) {//如果文件/文件夹 不存在
//			System.out.println("创建文件");
//			if (file.isFile()) { //如果是文件
//				file.createNewFile(); //创建文件
//				//System.out.println("创建成功");
//			} else
//				file.mkdirs();
//				System.out.println("创建成功");
//			
//		} else 
//			System.out.println("文件已经存在!");
//		
		
		//删除文件
//		if (file.exists()) {//如果文件存在
//			file.delete();	//立即书删除
//			//file.deleteOnExit();	//程序退出后删除
//			System.out.println("文件删除成功!");
//		}
		
		//列出文件 
		if (file.isDirectory()) {
			System.out.println(file.getAbsolutePath() + "下的所有文件:");
			String[] list = file.list(new DirFilter());
			for (int i = 0; i < list.length; i++) {
				System.out.println(list[i]);
			}
		}
	
	}
	/**
	 * 继承javax.swing.filechooser.FileFilter方法 实现对话框过滤
	 * @author SugarMan
	 * @version 1.0
	 * @time 2017年8月26日 下午1:15:22
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
			// 筛选以后缀名结尾的文件 如.*wav .*txt
			return ".*, *class";
		}
		
	}

	//文件筛选
	/**
	 * 自定义的文件名过滤器，必须实现FilenameFilter接口
	 * @author SugarMan
	 * @version 1.0
	 * @time 2017年8月26日 下午1:14:37
	 */
	static class DirFilter implements FilenameFilter{
		@Override
		public boolean accept(File dir, String name) {
			if (name.endsWith("classpath") || name.endsWith("project")) {
				return true;
			}
			return false;//结果都返回True 那么都可以显示
		}
	}
}


	

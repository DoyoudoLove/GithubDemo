package com.download;
/**
 * 下载器  --- 通过RandomAccessFIle
 * 	从Http协议下载的文件（文件流），将文件以缓存流的方式读取到内存
 * 	注意：这里Http Range的用法
 * 	
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月7日 下午6:25:11
 */

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
//import java.time.Instant;

public class Downloader_RandomAccessFIle {
	
	private static final String fileURL = 
			"https://dn-dji-videos.qbox.me/cloud/fbcd84a70f8011d32751135f7285a2e9/1080.mp4";
			
	private static final int MAX_BUFFER_SIZE = 102400;
	
	public static void main(String[] args) {
		
		//JD	K1.8以后的获取时间的新方法
//		 Instant time = Instant.now();
//		 System.out.println(time.getEpochSecond());
		fileDownload();
		//1.打开HTTP连接，获取下载内容长度
		//2.创建RandomAccessFile对象
		//3.将下载的内容缓存到字节数组
		//4.将带缓存的字节数组通过RandomAccessFile对象写入到文件中
		
	}
	private static void fileDownload() {
		//定义全局变量
		int fileSize;
		//已下载的字节数 --- 用来计算当前下载的百分比
		int downloaded = 0;
		HttpURLConnection connection = null;
		BufferedInputStream bInStream = null;
		try {
			//创建文件流 引入文件对象
			
			URL url = new URL(fileURL);
			
			//获取连接方式 读取二进制文件流 
			connection = (HttpURLConnection)url.openConnection();
			//设置连接属性 Range从服务器请求获取要下载的字节范围  0- 是文件不终止字节数
			connection.setRequestProperty("Range", "bytes=0-");
			//接入服务器
			connection.connect();
			//判断连接是否成功 （200 - 299）
			if (connection.getResponseCode() / 100 != 2) {
				
				System.err.println(connection.getResponseCode());
				System.err.println(connection.getResponseMessage());
				System.err.println("连接响应状态范围不在200以内");
				return;
			}
			//获得要下载的文件大小(字节数)
			fileSize = connection.getContentLength();
			//读取文件中的内容
			bInStream = new BufferedInputStream(connection.getInputStream(), MAX_BUFFER_SIZE );
			//获取下载文件名称
			String fileName = url.getFile();
			fileName = fileName.substring(fileName.lastIndexOf("/") + 1);
			//创建RandomAccessFile对象
			RandomAccessFile randomFile = new RandomAccessFile(fileName, "rw");
			//文件指针内容清空
			randomFile.setLength(0);
			//文件指针归零
			randomFile.seek(0);
			//保存下载内容 --- 当前下载的字节数小于文件总大小时继续下载 
			while (downloaded < fileSize) {
				//下载缓存字节数组
				byte[] buffer = null;
				//判断未下载的大小是否超过最大缓存
				if (fileSize - downloaded > MAX_BUFFER_SIZE) {
					buffer = new byte[MAX_BUFFER_SIZE];
				} else {
					buffer = new byte[fileSize - downloaded];
				}
				//读取缓存字节数组中的内容
				int read = bInStream.read(buffer);
				//下载完毕
				if (read == -1) {
					break;
				}
				//将缓存的内容写入到文件中  ---在此 需要文件指针获取文件所在位置
				randomFile.seek(downloaded);
				//写入文件
				randomFile.write(buffer, 0, read);
				//已下载的字节数
				downloaded += read;
				//提示当前进度 （百分比）
				System.out.println("当前文件下载进度：" + downloaded * 1.0 / fileSize * 100 + "%");
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			connection.disconnect();
			try {
				bInStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
		
		
	}
	
    
}

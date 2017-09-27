package com.IoputDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 对象的序列化和反序列化操作 
 * 前提 ： 必须实现序列化接口
 * 
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月7日 上午8:22:03
 */
public class ObjectStreamDemo {
	static final String filePath = "/Users/Super/Documents/Object.dat";
	public static void main(String[] args) {
		Player player1 = new Player("为你，从那时到现在", 67);
		try(
				FileOutputStream fOutputStream = new FileOutputStream(filePath);
				ObjectOutputStream objStream = new ObjectOutputStream(fOutputStream)
		) {
			//写入的文件为二进制计算机数据 ---序列化
			objStream.writeObject(player1);
			System.out.println("对象写入成功");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try(
				FileInputStream fInStream = new FileInputStream(filePath);
				ObjectInputStream objInStream = new ObjectInputStream(fInStream);
		) {
			//读取的时候将二进制强制转换为当前数据类型 ---反序列化
			Player player2 = (Player)objInStream.readObject();
			System.out.println("当前对象读取的内容是：" + player2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
	class Player implements Serializable {
	
		private static final long serialVersionUID = 7594008720618417847L;
		
		private String nickName;
		private int level;
		
		
		public Player() {
			
		}
		
		public Player(String nickName, int level) {
			
			this.nickName = nickName;
			this.level = level;
		}
		
		@Override
		public String toString() {
			return nickName + "\t" + level;
		}
	
		public String getNickName() {
			return nickName;
		}

		public void setNickName(String nickName) {
			this.nickName = nickName;
		}

		public int getLevel() {
			return level;
		}

		public void setLevel(int level) {
			this.level = level;
		}

	}



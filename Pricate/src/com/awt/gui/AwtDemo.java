package com.awt.gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 * Awt重量级的GUI控件
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月20日 下午5:40:31
 */
public class AwtDemo {

	public static void main(String[] args) {
	
//		BorderLayout();
//		flowLayout();
//		calculator();
//		绝对定位();
		事件处理();
		
		
	}
	public static void BorderLayout() {
		
		//Frame默认是BorderLayout，所以默认添加到Center区域
		Frame frame = new Frame("BorderLayout");
		
		Button but1 = new Button("A");
		Button but2 = new Button("B");
		Button but3 = new Button("C");
		Button but4 = new Button("D");
		Button but5 = new Button("E");
		
		frame.add(but1, BorderLayout.NORTH);
		frame.add(but2, BorderLayout.WEST);
		frame.add(but3, BorderLayout.EAST);
		frame.add(but4, BorderLayout.SOUTH);
		frame.add(but5, BorderLayout.CENTER);
		
		
		frame.setSize(700, 700);
		//是否在屏幕上显示
		frame.setVisible(true);
	}
	
	public static void flowLayout() {
		//麻将布局
		Frame frame = new Frame("flowLayout");
		//面板 panel默认是流布局
	
		Button but1 = new Button("登录");
		Button but2 = new Button("注册");
		Button but3 = new Button("退出");
		
		
		Panel pane2 = new Panel();
		pane2.setBackground(Color.blue);
		pane2.add(but1);
		pane2.add(but2);
		pane2.add(but3);
		
		frame.add(pane2, BorderLayout.CENTER);
		frame.setBounds(100, 100, 800, 500);
		frame.setVisible(true);
		
	}
	
	/**
	 * GridLayout分割线布局
	 * 实现计算器可视化窗口
	 */
	public static void calculator() {
		//创建frame对象
		Frame frame = new Frame("计算器");
		//添加panel面板
		Panel panel = new Panel();
		//创建文本框
		panel.add(new TextField(35));
		frame.add(panel, BorderLayout.NORTH );
		//再次创建面板添加数字按钮
		Panel panel2 = new Panel();
		/**
		 * 设置面板格式布局
		 * 行数 列数 指定横间距 纵间距
		 */
		panel2.setLayout(new GridLayout(4, 4, 2, 2));
		//定义数字数组，保存数字
		String[] names = {"0", "1", "2", "3", "4", "5",
						 "6", "7", "8", "9", "+", "-",  
						 "*", "/", "="};
		
		for (int i = 0; i < names.length; i++) {
			//添加按钮
			panel2.add(new Button(names[i]));
			
		}
		
		frame.add(panel2);
		//设置窗口为最佳大小 java.awt.window
		frame.pack();
		frame.setVisible(true);
		
		
		
	}
	
	
	public static void 绝对定位() {
		
		Frame frame = new Frame();
		//创建面板
		Panel panel = new Panel();
		
		Button but1 = new Button("第一个按钮");
		Button but2 = new Button("第二个按钮");
		//向面板添加组件
		panel.add(but1);
		panel.add(but2);
		//设置按钮 横纵坐标 高宽
		but1.setBounds(50, 50, 100, 22);
		but2.setBounds(200, 50, 100, 22);
		
		//设置绝对定位
 		panel.setLayout(null);
		frame.add(panel, BorderLayout.CENTER);
		//设置窗口
		frame.setBounds(100, 100, 800, 500);
		frame.setVisible(true);
	}
	
	
	public static void 事件处理() {
		
		Frame frame = new Frame("事件监听");
		
		/**
		 * WindowAdapter是一个抽象类，在实际使用时我们优先使用
		 * 因为 要实现其中的方法 直接重写即可
		 */
		frame.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				//通过事件获取事件源
				e.getSource();
				System.out.println(e.getSource().toString());
				frame.setVisible(false);
				
			}
		});
		/**
		 * WindowListener是个接口 使用其中的方法必须要实现其所有的方法
		 */
//		frame.addWindowListener(new WindowListener() {
//			
//			@Override
//			public void windowOpened(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowIconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowDeactivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowClosing(WindowEvent e) {
////				System.out.println("Closing........");
//				//System.exit(0);
//				//内部类想要访问外部类变量，那么外部类的这个变量一定要使用final修饰
//				frame.setVisible(false);
//			}
//			
//			@Override
//			public void windowClosed(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void windowActivated(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
		
		
		frame.setBounds(0, 0, 800, 600);
		frame.setVisible(true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package com.awt.gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Swing轻量级的控件
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月21日 下午8:46:33
 */
public class SwingDemo {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Swing轻量级的控件");
		JButton button = new JButton("登录");
		JLabel lable = new JLabel("用于放置提示类文本");
		frame.add(lable);
		frame.add(button, BorderLayout.NORTH);
		
		 
		frame.setBounds(0, 0, 800, 600); 
		frame.setVisible(true);
		
	}
	
	
	

}

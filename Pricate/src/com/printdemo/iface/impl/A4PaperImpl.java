package com.printdemo.iface.impl;

import com.printdemo.iface.IPaper;

/**
 * ʵ����
 * @author SugarMan
 * @version 1.0
 * @time 2017��8��22�� ����11:39:46
 */
public class A4PaperImpl implements IPaper {

	@Override
	public String getSize() {
		// 
		return "A4";
	}
	
}

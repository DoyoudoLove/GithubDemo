package com.printdemo.iface.impl;

import com.printdemo.iface.IPaper;

/**
 * 实现类
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月22日 上午11:39:46
 */
public class A4PaperImpl implements IPaper {

	@Override
	public String getSize() {
		// 
		return "A4";
	}
	
}

package com.printdemo.iface.impl;

import com.printdemo.iface.IPaper;

public class B5PaperImpl implements IPaper {

	@Override
	public String getSize() {
		// 
		return "B5";
	}

}

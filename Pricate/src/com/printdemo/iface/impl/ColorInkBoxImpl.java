package com.printdemo.iface.impl;

import com.printdemo.iface.IInkBox;

/**
 * 实现类
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月22日 上午11:38:28
 */
public class ColorInkBoxImpl implements IInkBox {

	@Override
	public String getColor() {
		// 
		return "红色";
	}

}

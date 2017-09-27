package com.printdemo.iface;

import com.printdemo.iface.impl.A4PaperImpl;
import com.printdemo.iface.impl.B5PaperImpl;
import com.printdemo.iface.impl.ColorInkBoxImpl;

/**
 * 测试类
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月22日 上午11:28:29
 */
public class PrintTest {

	public static void main(String[] args) {
		Printer pr = new Printer();
		//为打印机安装纸张和墨盒
		pr.setInkBox(new ColorInkBoxImpl());
		pr.setPaper(new B5PaperImpl());
		pr.print("测试内容");

	}

}

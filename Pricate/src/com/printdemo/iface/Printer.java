package com.printdemo.iface;
/**
 * 打印机类 使用标准的墨盒和纸张进行打印
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月22日 上午11:17:07
 */
public class Printer {
	//打印机中的墨盒
	private IInkBox inkBox = null;
	//打印机中的纸张
	private IPaper paper = null;
	
	/**
	 * 打印机的打印方法 使用墨盒和纸张
	 * @param content 传递给打印机上的字符串内容
	 */
	public void print(String content) {
		if (null == inkBox || null == paper ) {
			System.out.println("墨盒和纸张出现错误，请安装正确后重试!");
			return;
		}
		//打印过程
		String color = inkBox.getColor();
		String size  = paper.getSize();
		System.out.println("以下文字是" + color + "颜色");
		System.out.println("使用纸张: " + size);
		System.out.println("打印内容: " + content);
	}
	
	public IInkBox getInkBox() {
		return inkBox;
	}
	public void setInkBox(IInkBox inkBox) {
		this.inkBox = inkBox;
	}
	public IPaper getPaper() {
		return paper;
	}
	public void setPaper(IPaper paper) {
		this.paper = paper;
	}
	
	
}

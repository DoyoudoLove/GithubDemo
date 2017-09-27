package com.printdemo.iface;

import com.printdemo.iface.impl.A4PaperImpl;
import com.printdemo.iface.impl.B5PaperImpl;
import com.printdemo.iface.impl.ColorInkBoxImpl;

/**
 * ������
 * @author SugarMan
 * @version 1.0
 * @time 2017��8��22�� ����11:28:29
 */
public class PrintTest {

	public static void main(String[] args) {
		Printer pr = new Printer();
		//Ϊ��ӡ����װֽ�ź�ī��
		pr.setInkBox(new ColorInkBoxImpl());
		pr.setPaper(new B5PaperImpl());
		pr.print("��������");

	}

}

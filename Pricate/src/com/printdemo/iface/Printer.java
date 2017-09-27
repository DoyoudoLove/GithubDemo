package com.printdemo.iface;
/**
 * ��ӡ���� ʹ�ñ�׼��ī�к�ֽ�Ž��д�ӡ
 * @author SugarMan
 * @version 1.0
 * @time 2017��8��22�� ����11:17:07
 */
public class Printer {
	//��ӡ���е�ī��
	private IInkBox inkBox = null;
	//��ӡ���е�ֽ��
	private IPaper paper = null;
	
	/**
	 * ��ӡ���Ĵ�ӡ���� ʹ��ī�к�ֽ��
	 * @param content ���ݸ���ӡ���ϵ��ַ�������
	 */
	public void print(String content) {
		if (null == inkBox || null == paper ) {
			System.out.println("ī�к�ֽ�ų��ִ����밲װ��ȷ������!");
			return;
		}
		//��ӡ����
		String color = inkBox.getColor();
		String size  = paper.getSize();
		System.out.println("����������" + color + "��ɫ");
		System.out.println("ʹ��ֽ��: " + size);
		System.out.println("��ӡ����: " + content);
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

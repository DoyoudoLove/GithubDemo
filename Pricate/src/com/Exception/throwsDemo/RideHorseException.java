package com.Exception.throwsDemo;
/**
 * �Զ����쳣 --- ����ֵ����50�Զ�����
 * @author SugarMan
 * @version 1.0
 * @time 2017��8��24�� ����7:24:22
 */
public class RideHorseException extends Exception {
	
	private static int value;
	public RideHorseException() {
		super("����ֵ���ܵ���50");
	}
	public RideHorseException(int value) {
		super("��ǰ����ֵΪ" + value + ",����ֵ���ܵ���50������ʧ�ܣ�");
	}

	

	
}

package com.superdemo;
/**
 * �ӿ��������ıȽ�:
 * 
 * ���п��Զ����Ա�������ӿڲ�������ڳ�Ա����
 * �ӿ������еķ�������Ҫ��ȥʵ�֣�java 8ǰ��
 * �ӿڿ��Ա���̳�
 * ʹ��ƺ�ʵ����ȫ����
 * �ܹ�����Ȼ��ʹ�ö�̬
 * ���Ը����״������
 * ���Ը�����ʵ��
 * @author SugarMan
 * @version 1.0
 * @time 2017��8��22�� ����9:31:23
 */
public interface Eat {
	//�ӿ��г�Ա�����Ķ��� public static final
	String name = "�ӿ���Ķ�����";
	//default ʵ�ֽӿ��з���
	default void mouth(){
		System.out.println("�ӿ������еķ�������Ҫ��ȥʵ��");
	}
}

package com.Customer;
/**
 *  ����ͻ���Customer
 *  �������Է���
 * @author SugarMan
 * @version 1.0
 * @time 2017��8��21�� ����7:40:08
 */
public class Customer {
	int integral;
	String card;
	
	public void show() {
		System.out.println("����\t\t������");
		System.out.println(integral + "\t\t" + card);
	}
	//ʵ����
	public static void main(String[] args) {
		Customer cus = new Customer();
		cus.integral = 200;
		cus.card = "��Ա��";
		cus.show();
	}
}

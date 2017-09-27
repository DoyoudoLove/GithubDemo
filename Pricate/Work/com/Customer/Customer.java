package com.Customer;
/**
 *  定义客户类Customer
 *  定义属性方法
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月21日 下午7:40:08
 */
public class Customer {
	int integral;
	String card;
	
	public void show() {
		System.out.println("积分\t\t卡类型");
		System.out.println(integral + "\t\t" + card);
	}
	//实现类
	public static void main(String[] args) {
		Customer cus = new Customer();
		cus.integral = 200;
		cus.card = "会员卡";
		cus.show();
	}
}

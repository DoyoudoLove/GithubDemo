package com.FengZhuangDemo;

public class Person {
	
	
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0 || age > 130 ) {
			System.out.println("年龄输入有误!系统默认为10");
			age = 10;
		}
		
		this.age = age;
	} 
	
	
}

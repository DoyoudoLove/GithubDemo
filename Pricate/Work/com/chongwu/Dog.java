package com.chongwu;

/**
 * 使用封装属性 实现宠物领养宠物的功能
 * 
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月5日 上午8:44:20
 */
public class Dog {
	private String name;
	private int health;
	private int love;
	private String strain;
	
	
	public Dog(String name, int health, int love, String strain) {
		
		this.name = name;
		this.health = health;
		this.love = love;
		this.strain = strain;
	}

	public void speak() {
		System.out.println("宠物的自白");
		System.out.println("我的名字叫" + getName() + 
				"，我的健康值是" + health + 
				"，我和主人的亲密度为" + love +
				"，我的类型是" + strain);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	

}

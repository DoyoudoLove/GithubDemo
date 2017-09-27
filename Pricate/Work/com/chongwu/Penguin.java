package com.chongwu;

/**
 * 企鹅类
 * 
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月5日 上午8:55:20
 */
public class Penguin {
	private String name;
	private String sex;
	private int health;
	private int love;
	
	public Penguin(String name, String sex, int health, int love) {
		
		this.name = name;
		this.sex = sex;
		this.health = health;
		this.love = love;
	}
	public void speak() {
		System.out.println("宠物的自白");
		System.out.println("我的名字叫" + getName() + 
				"，我的健康值是" + health + 
				"，我和主人的亲密度为" + love +
				"，我的性别是" + sex);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
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

}

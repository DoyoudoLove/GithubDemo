package com.Exception.throwsDemo;

/**
 * 手动抛出异常
 * @author SugarMan
 * @version 1.0
 * @time 2017年8月24日 下午6:43:11
 */
public class ThrowDemo {
	public static void main(String[] args) {
		Hero h = new Hero("貂蝉");
		try {
			h.setExp(1000);//由于是必检性 所以要生成try catch
			h.setHealth(50);
			h.rideHouse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("当前英雄的经验值：" + h.getExp());

	}
}

class Hero {
	private String name;
	private long exp;
	private int health;
	
	public Hero(String name) {
		setName(name);
	}
	/**
	 * 英雄的骑马方法 - 当英雄的健康值低于50时，不允许骑马
	 * @throws RideHorseException
	 */
	public void rideHouse() throws RideHorseException {
		if (health >= 50) {
			System.out.println(name + "正在欢乐的骑马！");
		} else
			throw new RideHorseException(health);
	}
	
	
	
	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getExp() {
		return exp;
	}

	public void setExp(long exp) throws Exception {
		if (exp >= 0) {//经验值为负数时 强制抛出异常
			this.exp = exp;
		} else
			throw new LessThanZeroException((int)exp);
	}

}
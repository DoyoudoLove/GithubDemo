package com.Exception.throwsDemo;

/**
 * �ֶ��׳��쳣
 * @author SugarMan
 * @version 1.0
 * @time 2017��8��24�� ����6:43:11
 */
public class ThrowDemo {
	public static void main(String[] args) {
		Hero h = new Hero("����");
		try {
			h.setExp(1000);//�����Ǳؼ��� ����Ҫ����try catch
			h.setHealth(50);
			h.rideHouse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("��ǰӢ�۵ľ���ֵ��" + h.getExp());

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
	 * Ӣ�۵������� - ��Ӣ�۵Ľ���ֵ����50ʱ������������
	 * @throws RideHorseException
	 */
	public void rideHouse() throws RideHorseException {
		if (health >= 50) {
			System.out.println(name + "���ڻ��ֵ�����");
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
		if (exp >= 0) {//����ֵΪ����ʱ ǿ���׳��쳣
			this.exp = exp;
		} else
			throw new LessThanZeroException((int)exp);
	}

}
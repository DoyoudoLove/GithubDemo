package com.pkgame;
/**
 * 接口类 --- 实现了本接口，就相当于具备了攻击的能力
 * @author SugarMan
 *
 */
public interface Assailable {
	String getName();
	int getX();
	void setX(int x);
	int getY();
	void setY(int y);
	int getHp();
	void setHp(int Hp);
	
	/**
	 * 根据距离判断 是否能够攻击另一个对象
	 * @param assa
	 * @return
	 */
	boolean IsFightByDistance(Assailable assa);
	/**
	 * 传入攻击对象 并且两者攻击
	 * @param ass
	 */
	void fight(Assailable assa);
	
}

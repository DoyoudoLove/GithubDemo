package com.pkgame;
/**
 * 城堡类 -------非英雄类
 * @author SugarMan
 *
 */
public class Castle implements Assailable {
	private String name;
	private int x;
	private int y;
	private int Hp;
	private int maxHp;
	//攻击范围
	private int attackRange;
	
	public Castle(String name, int x, int y, int attackRange) {
		setAttackRange(attackRange);
		//调用接口
		setName(name);
		setX(x);
		setY(y);
		setHp(100);
		
		setMaxHp(100);
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getHp() {
		return Hp;
	}

	public void setHp(int hp) {
		Hp = hp;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public int getAttackRange() {
		return attackRange;
	}

	public void setAttackRange(int attackRange) {
		this.attackRange = attackRange;
	}

	/**
	 * 计算两个点之间的距离
	 * 在更加接近实际的应用中，我们可以把计算距离的方法定义在工具类中，方便使用
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return 返回攻击距离
	 */
	protected double getDistance(int x1, int y1, int x2, int y2) {
		return Math.abs(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
	}
	/**
	 * 城堡的攻击方法（故意使用其他名称，以区别于英雄类）
	 * @param assa 对方攻击对象
	 */
	public void attack(Assailable assa) {
		if (IsFightByDistance(assa) && Hp > 0 && assa.getHp() > 0) {
			fight(assa);
		} else {
			System.out.println("攻击失败!玩家未在攻击范围之内");
		}
		//由于城堡类不是英雄类所以它的攻击方法需要重新定义
		System.out.println("城堡攻击后英雄当前状态");
		System.out.println("昵称\tHP\tX坐标\tY坐标");
		System.out.println(name + "\t" + Hp + "\t" + x + "\t" + y);
		System.out.printf("%s\t%d\t%d\t%d\n", 
				assa.getName(), assa.getHp(), assa.getX(), assa.getY()
		);
		
	}
	
	@Override
	public boolean IsFightByDistance(Assailable assa) {
		// 1.计算与另一个可攻击对象之间的距离
		/** distance 距离 */
		double distance = getDistance(getX(), getY(), assa.getX(), assa.getY());
		//System.out.println(distance);
		// 2.如果攻击距离合法，就进行攻击
		return distance <= 300;
	}
	@Override
	public void fight(Assailable assa) {
		// 假设城堡的攻击力固定
		int attack = 15;
		assa.setHp(assa.getHp() - attack);
		System.out.println(getName() + "攻击了" + assa.getName() + "!");
		
	}
	//子类实现了接口中的方法 必须重写该方法

	
}

package com.pkgame;
/**
 * �Ǳ��� -------��Ӣ����
 * @author SugarMan
 *
 */
public class Castle implements Assailable {
	private String name;
	private int x;
	private int y;
	private int Hp;
	private int maxHp;
	//������Χ
	private int attackRange;
	
	public Castle(String name, int x, int y, int attackRange) {
		setAttackRange(attackRange);
		//���ýӿ�
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
	 * ����������֮��ľ���
	 * �ڸ��ӽӽ�ʵ�ʵ�Ӧ���У����ǿ��԰Ѽ������ķ��������ڹ������У�����ʹ��
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return ���ع�������
	 */
	protected double getDistance(int x1, int y1, int x2, int y2) {
		return Math.abs(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
	}
	/**
	 * �Ǳ��Ĺ�������������ʹ���������ƣ���������Ӣ���ࣩ
	 * @param assa �Է���������
	 */
	public void attack(Assailable assa) {
		if (IsFightByDistance(assa) && Hp > 0 && assa.getHp() > 0) {
			fight(assa);
		} else {
			System.out.println("����ʧ��!���δ�ڹ�����Χ֮��");
		}
		//���ڳǱ��಻��Ӣ�����������Ĺ���������Ҫ���¶���
		System.out.println("�Ǳ�������Ӣ�۵�ǰ״̬");
		System.out.println("�ǳ�\tHP\tX����\tY����");
		System.out.println(name + "\t" + Hp + "\t" + x + "\t" + y);
		System.out.printf("%s\t%d\t%d\t%d\n", 
				assa.getName(), assa.getHp(), assa.getX(), assa.getY()
		);
		
	}
	
	@Override
	public boolean IsFightByDistance(Assailable assa) {
		// 1.��������һ���ɹ�������֮��ľ���
		/** distance ���� */
		double distance = getDistance(getX(), getY(), assa.getX(), assa.getY());
		//System.out.println(distance);
		// 2.�����������Ϸ����ͽ��й���
		return distance <= 300;
	}
	@Override
	public void fight(Assailable assa) {
		// ����Ǳ��Ĺ������̶�
		int attack = 15;
		assa.setHp(assa.getHp() - attack);
		System.out.println(getName() + "������" + assa.getName() + "!");
		
	}
	//����ʵ���˽ӿ��еķ��� ������д�÷���

	
}

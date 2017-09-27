package com.pkgame;
/**
 * ʵ���˿ɹ����ӿ����Ӣ����
 * @author SugarMan
 *
 */
public abstract class Hero implements Assailable {
	private String name;
	private long id;
	private int level;
	private int maxHp;
	private int Hp;
	private int attack;
	private int x;
	private int y;
	
	public Hero() {
		setHp(100);
		setMaxHp(100);
	}
	
	public Hero(long id, String name) {
		this();
		setId(id);
		setName(name);
	}
	/**
	 * ����������֮��ľ���
	 * �ڸ��ӽӽ�ʵ�ʵ�Ӧ���У����ǿ��԰Ѽ������ķ��������ڹ������У�����ʹ��
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return
	 */
	protected double getDistance(int x1, int y1, int x2, int y2) {
		return Math.abs(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
	}
	/**
	 * Ӣ��֮���PK
	 * 1.�ж�����֮�����
	 * 2.������� �͹���
	 * @param assa
	 */
	public void pk(Assailable assa) {
		if (IsFightByDistance(assa) && Hp > 0 && assa.getHp() > 0) {
			fight(assa);
		} else {
			System.out.println("���ڹ������������ԭ�򣬹���ʧ��");
		}
		//3.�ڿ���̨��ӡ��ս��Ľ��������̨����ר�ã�
		System.out.println("��λӢ�۵ĵ�ǰ״̬");
		System.out.println("�ǳ�\tHP\tX����\tY����");
		System.out.println(name + "\t" + Hp + "\t" + x + "\t" + y);
		System.out.printf("%s\t%d\t%d\t%d\n", 
				assa.getName(), assa.getHp(), assa.getX(), assa.getY()
		);
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getMaxHp() {
		return maxHp;
	}
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	public int getHp() {
		return Hp;
	}
	public void setHp(int hp) {
		Hp = hp;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
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
	
}

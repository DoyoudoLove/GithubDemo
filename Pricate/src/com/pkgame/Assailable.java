package com.pkgame;
/**
 * �ӿ��� --- ʵ���˱��ӿڣ����൱�ھ߱��˹���������
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
	 * ���ݾ����ж� �Ƿ��ܹ�������һ������
	 * @param assa
	 * @return
	 */
	boolean IsFightByDistance(Assailable assa);
	/**
	 * ���빥������ �������߹���
	 * @param ass
	 */
	void fight(Assailable assa);
	
}

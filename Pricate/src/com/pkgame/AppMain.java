package com.pkgame;
/**
 * ģ����Ϸ�ĺ���ҵ���߼�����
 * @author SugarMan
 *
 */

public class AppMain {

	public static void main(String[] args) {
		Hero hero = new Warrior(1, "�ܲ�", 10, 10);
		Castle castle = new Castle("��ɯ�Ǳ�", 80, 80, 300);
		
		hero.pk(castle);
		castle.attack(hero);
	}

}

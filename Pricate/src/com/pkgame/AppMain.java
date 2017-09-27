package com.pkgame;
/**
 * 模拟游戏的核心业务逻辑代码
 * @author SugarMan
 *
 */

public class AppMain {

	public static void main(String[] args) {
		Hero hero = new Warrior(1, "曹操", 10, 10);
		Castle castle = new Castle("温莎城堡", 80, 80, 300);
		
		hero.pk(castle);
		castle.attack(hero);
	}

}

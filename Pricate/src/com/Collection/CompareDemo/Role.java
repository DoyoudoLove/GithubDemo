package com.Collection.CompareDemo;

/**
 * 角色类 ---属性
 * 
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月16日 下午12:05:33
 */
public class Role  {//implements Comparable<Role> {
	private String name;
	private String title;
	private int Output;
	private int attack;

	
	public Role(String name, String title, int output, int attack) {
		
		this.name = name;
		this.title = title;
		this.Output = output;
		this.attack = attack;
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Role)) {
			return false;
		}
		Role role = (Role)obj;
		return name.equals(role.getName());
	}
//	@Override
//	public int compareTo(Role role) {
//		//这里开发使用攻击力的排序方法 用户可以根据实际情况自定义
//		if (attack > role.getAttack()) return 1;
//		if (attack < role.getAttack()) return -1;
//		return 0;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getOutput() {
		return Output;
	}

	public void setOutput(int output) {
		Output = output;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}


}

package com.Collection.CompareDemo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * 角色 —————— 业务类
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月16日 下午12:08:53
 */
public class RoleBiz {

	List<Role> roleList = null;

	public RoleBiz() {
		roleList = new ArrayList<>();
	}
	/**
	 * 添加角色属性
	 * @param role
	 */
	public void add(Role role) {
		 if (role != null) {
			 
			 roleList.add(role);
		 }
	}
	/**
	 * 删除角色属性
	 * @param role
	 */
	public void del(Role role) {
		
		roleList.remove(role);
	}
	/**
	 * 将传入的对象在集合中进行修改
	 * @param role
	 */
	public void update(Role role) {
		//找到集合中下标元素
		int index = roleList.indexOf(role);
		//修改元素
		if (index != -1) {
			roleList.set(index, role);
		}
	}
	/**
	 * 排序 -- 比较器
	 */
	public void sort() {
		//2-1实体类 直接实现Collections.sort需要实现Comparable接口(不灵活)
//		Collections.sort(roleList);
		//2-2自定义一个比较器的接口
//		Collections.sort(roleList, new RoleComparator_Attack());
		//实现反序
		Collections.sort(roleList, Collections.reverseOrder(new RoleComparator_Attack()));
		//乱序
//		Collections.shuffle(roleList);
	}
	
	public void show() {
		System.out.println("角色\t称号\t气血\t攻击力");
		System.out.println("------------------------------");
		Iterator<Role> it = roleList.iterator();
		
		while (it.hasNext()) {
			Role role = it.next();
			System.out.println(role.getName() + "\t"
							+ role.getTitle() + "\t"
							+ role.getOutput() + "\t"
							+ role.getAttack());
		}
	}
	
	
}
/**
 * 根据攻击力比较进行排序
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月16日 下午1:30:55
 */
class RoleComparator_Attack implements Comparator<Role> {
	
	@Override
	public int compare(Role role1, Role role2) {
		if (role1.getAttack() > role2.getAttack()) return 1;
		if (role1.getAttack() < role2.getAttack()) return -1;
		return 0;
	}
	
	
	
	
}

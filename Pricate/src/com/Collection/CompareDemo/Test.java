package com.Collection.CompareDemo;

public class Test {

	public static void main(String[] args) {
		
		RoleBiz roleBiz = new RoleBiz();
		
		roleBiz.add(new Role("张飞", "关云长", 100, 80));
		roleBiz.add(new Role("姜维", "幼麟", 100, 60));
		roleBiz.add(new Role("诸葛亮", "卧龙", 100, 90));
		roleBiz.add(new Role("司马徽", "水镜先生", 100, 70));
		roleBiz.add(new Role("夏侯惇", "盲夏侯", 100, 75));
		roleBiz.add(new Role("典韦", "古之恶来", 100, 89));
		
		roleBiz.show();
		System.out.println("\n*************排序****************");
		
//		Role role = new Role("姜维", "幼麟", 100, 60);
//		roleBiz.del(role);
//		roleBiz.show();
		
//		Role role = new Role("典韦", "罪大恶极", 100, 89);
//		roleBiz.update(role);
//		roleBiz.show();
		
		roleBiz.sort();
		roleBiz.show();
	}

	
	
	
	
	
	
}

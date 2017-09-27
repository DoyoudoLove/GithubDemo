package com.verify.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class TestHashMap {
	
	public static void main(String []args){
		yongyu U1 = new yongyu();
		NewUp up1 = new NewUp(U1);
		U1.Go();
		
		Log L1 = new Log();
		L1.Up();
		
		System.out.println(up1.getMap());
		for (Entry<String, String> s1 : up1.getMap().entrySet()) {
			
			System.out.println(s1.getKey()+ "\t" + s1.getValue());
		}
		System.out.println(L1.getMname());
		if (true){
			String password = U1.getName();
			System.out.println(password);
			if (password.equals(L1.getMname())) 
				
				System.out.println("用户名和HashMap正确的");
			else 
				System.out.println("您的输入是有问题的");		
		}else{
			System.out.println("没有这个账户");
		}
	}
	
}

/**
 * 注册一个新的账户
 * @author SortfGrowingup
 *
 */
class  yongyu{
	private String name;
	private String passWord;
	
	public void Go(){
		Scanner s = new Scanner(System.in);
		System.out.print("Set UpName：");
			this.name =s.next();
		System.out.print("Set passWord :");
			this.passWord =s.next();
	}
	
	public String getName(){
		return name;
	}
	public String getpassWord() {
		return passWord;
	}
	
}

/**
 * 用户登陆
 * @author SortfGrowingup
 *
 */
class Log{
	private Scanner input = new Scanner(System.in);
	private String Mname;
	private String MpassWord;
	private void setMname(){
		this.Mname = input.next();
	}
	private void setMpassWord(){
		this.MpassWord = input.next();
	}
	public String getMname(){
		return Mname;
	}
	/**
	 * 
	 *登录方法
	 */
	public void Up (){
		
		System.out.print("Up");
		setMname();
		System.out.print("password");
		setMpassWord();
		input.close();
	}
}

class NewUp{
	private Map<String,String> map
		= new HashMap<>();
	
	public NewUp(yongyu obj){
			System.out.println("Welcome to DataUp!");
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	
	
	

}

/**
 * 教师类
 * 
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月15日 上午10:36:20
 */
public class Teacher {

	private String name;
	private int age;
	private String postion;

	public Teacher(String name, int age, String postion) {
		this.name = name;
		this.age = age;
		this.postion = postion;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPostion() {
		return postion;
	}

	public void setPostion(String postion) {
		this.postion = postion;
	}

}

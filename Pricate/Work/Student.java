/**
 * Scanner 键盘扫描器
 * 
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月15日 上午10:33:41
 */
public class Student {
	private String name;
	private String sex;
	private int age;
	
	public Student(String name, String sex, int age) {
		setName(name);
		setSex(sex);
		setAge(age);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

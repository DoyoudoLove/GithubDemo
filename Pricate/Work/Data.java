import java.util.Scanner;

public class Data {

	public static void main(String[] args) {
		int choice = 0;
		
		Scanner input = new Scanner(System.in);
	
		Student[] student = new Student[3];
		Teacher[] teacher = new Teacher[3];
		
//		System.out.println("请输入学生信息:");
		for (int i = 0; i < student.length; i++) {
//			teacher[i] = new Teacher(input.next(),input.nextInt(),input.next());
			student[0] = new Student("刘磊","男",12);
			student[1] = new Student("刘磊1","男",13);
			student[2] = new Student("刘磊2","男",14);
			
		}
		System.out.println();
		
//		System.out.println("请输入教师信息");
		for (int i = 0; i < teacher.length; i++) {
//			teacher[i] = new Teacher(input.next(),input.nextInt(),input.next());
			teacher[0] = new Teacher("刘磊",12,"语文");
			teacher[1] = new Teacher("刘磊3",14,"语文");
			teacher[2] = new Teacher("刘磊4",17,"语文");
		}
		System.out.println("-----------------------------------");
		System.out.println("\t欢迎使用教务查询系统\n");
		System.out.println("（1）学生信息查询");
		System.out.println("（2）教师信息查询");
		System.out.println("-----------------------------------");
		System.out.print("请选择1或是2（必须）：");
		
		choice = input.nextInt();
		
		switch (choice) {
		case 1:
			for (int i = 0; i < student.length; i++) {
				System.out.println("name\tsex\tage");
				System.out.println(student[i].getName() + "\t"
									+ student[i].getSex() + "\t" 
									+ student[i].getAge());
			}
			break;
		case 2:
			for (int i = 0; i < teacher.length; i++) {
				System.out.println("tname\tage\tpostion");
				System.out.println(teacher[i].getName() + "\t" 
									+ teacher[i].getAge() + "\t"
									+ teacher[i].getPostion());
			}
			break;
		default:
			break;
		}
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
}

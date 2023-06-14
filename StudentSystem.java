import java.util.ArrayList;
import java.util.Scanner;
public class StudentSystem{
	public static void startStudentSystem() {
		ArrayList<Student> list = new ArrayList<>();
		//1打印学生管理系统页面
	loop:while(true) {
		 System.out.println("~~~~~欢迎来到学生管理系统~~~~~");
			System.out.println("1.添加学生");
			System.out.println("2.删除学生");
			System.out.println("3.修改信息");
			System.out.println("4.查询信息");
			System.out.println("5.退出");
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入选项：");
			int choose = sc.nextInt();
			//2根据录入选项，选择调用功能添加、删除、修改、查询
			switch (choose) {
			case 1 -> addStudent(list);
			case 2 -> deleteStudent(list);
			case 3 -> updateStudent(list);
			case 4 -> queryStudent(list);
			case 5 -> {
				System.out.println("退出");
				//判断录入选项是否存在
				//break loop;
				System.exit(0);
			}
			default -> System.out.println("没有这个选项");

			}
		}    		
	}
	//判断id是否重复方法
		public static boolean contains(ArrayList<Student> list,String id) {
//			for(int i = 0; i < list.size(); i++) {
//				Student stu = list.get(i);
//				String sid = stu.getId();
//				if(sid.equals(id)) {
//					return true;
//				}	
//			}
//			return false;
			return getIndex(list,id) >= 0;

		}
	//获取id的索引方法
		public static int getIndex(ArrayList<Student> list,String id) {
			for(int i = 0; i < list.size(); i++) {
				Student stu = list.get(i);
				String sid = stu.getId();
				if(id.equals(sid)) {
					return i;
				}	
			}
			return -1;
		}
	//添加学生：判断id是否存在，若不存在创建对象赋学生信息
	public static void addStudent(ArrayList<Student> list) {
		//创建对象
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		//死循环录入id 不存在退出 存在继续循环
		while(true) {
			System.out.println("请输入学生id");
			String id = sc.next();
			boolean flam = contains(list,id);
			if(flam) {
				System.out.println("id存在请重新输入");
			}else {
				s.setId(id);
				break;
			}
			//录入信息给对象
		}
		System.out.println("请输入学生名字");
		String name = sc.next();
		s.setName(name);
		System.out.println("请输入学生年龄");
		int age = sc.nextInt();
		s.setAge(age);
		System.out.println("请输入学生家庭地址");
		String address = sc.next();
		s.setAddress(address);
		list.add(s);
		System.out.println("学生信息添加成功");
	}
	
	//删除学生，并判断是否存在
	public static void deleteStudent(ArrayList<Student> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要删除学生的id");
		String id = sc.next();
		if(getIndex(list,id) >= 0) {
			list.remove(getIndex(list,id));
			System.out.println(id + "删除成功");
		}else {
			System.out.println("id不存在请重新输入");
		}
	}
	//修改学生并判断是否存在
	public static void updateStudent(ArrayList<Student> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要修改学生的id");
		String id = sc.next();
		
		int index = getIndex(list,id);
		if(index >= 0) {
			Student stu = list.get(index);
			
			System.out.println("请输入要修改学生的姓名");
			String newAame = sc.next();
			stu.setName(newAame);
			
			System.out.println("请输入要修改学生的年龄");
			int newAge = sc.nextInt();
			stu.setAge(newAge);;
			
			System.out.println("请输入要修改学生的地址");
			String newAddress = sc.next();
			stu.setAddress(newAddress);
		}else {
			System.out.println("要修改的id" + id + "不存在");
		}
		
	}
	//查询学生 
	public static void queryStudent(ArrayList<Student> list) {
		System.out.println("学生信息：");
		//确定是否添加了学生信息
		if(list.size() == 0) {
			System.out.println("无学生信息，请添加后在查询");
			return;
		}
		//显示信息
		System.out.println("id\t姓名\t年龄\t家庭地址");
		for(int i = 0; i < list.size(); i++) {
			Student stu = list.get(i);
			System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge()
			+ "\t" + stu.getAddress());
		}
	}
}


import java.awt.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class App{
	public static void main(String[] args) {
		ArrayList<Users> list = new ArrayList<>();
		//主界面 
		System.out.println("欢迎来到学生管理系统");
		Scanner sc = new Scanner(System.in);
		//选项调用方法
		while(true) {
		System.out.println("请输入操作1登录 2注册 3忘记密码 4退出");
		String choose = sc.next();
		switch(choose) {
		case "1" -> login(list);
		case "2" -> register(list);
		case "3" -> forgetPassword(list);
		case "4" -> {
			System.out.println("谢谢使用 再见");
			System.exit(0);
		}
		default -> System.out.println("没有这个选项");
		}
		}
	}

	//登录
	public static void login(ArrayList<Users> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名");
		String username = sc.next();
		boolean flag = contains(list,username);
		if(!flag) {
			System.out.println("用户名未注册请先注册在登录");
			return;
		}
		
		System.out.println("请输入密码");
		String password = sc.next();
		
		while(true) {
			String rightCode = getCode();
			System.out.println("当前正确的验证码为:" + rightCode);
			System.out.println("请输入验证码");
			String code = sc.next();
			if(!(rightCode.equalsIgnoreCase(code)) ){
				System.out.println("验证码有误");
				continue;
			}else {
				System.out.println("验证码正确");
				break;

			}	
		}
		//将方法中的数据（如username、password）封装成一个对象直接传递
		Users useInfo = new Users(username,password,null,null);
		boolean result = checkUserInfo(list,useInfo);
				if(result) {
					System.out.println("登录成功 可以使用学生管理系统了");
					//创建对象调用StudentSystem中的startStudentSystem()启动学生管理系统
					StudentSystem ss = new StudentSystem();
					ss.startStudentSystem();
				}else {
					System.out.println("登录失败 用户名密码有误");
				}
		
	}
	//验证登录是否正确
	private static boolean checkUserInfo(ArrayList<Users> list, Users useInfo) {
		for(int i = 0; i < list.size(); i++) {
			Users u = list.get(i);
			if(u.getUsername().equals(useInfo.getUsername()) && u.getPassword().equals(useInfo.getPassword()))
			return true;
		}
		return false;
	}

	
	//验证码方法
	private static String getCode() {
		//创建集合添加48个字母
		ArrayList<Character> list = new ArrayList<>();
		for(int i = 0; i < 26; i++) {
			char a = (char) ('a' + i);
			char A = (char) ('A' + i);
			list.add(a);
			list.add(A);

			}
			//创建可变字符串 添加list随机索引
			StringBuilder sb = new StringBuilder();
			Random r = new Random();
			for(int i = 0; i < 4; i++) {
				int index = r.nextInt(list.size());
				char c = list.get(index);
				sb.append(c);
			}
			//添加数字到末尾
			int number = r.nextInt(10);
			sb.append(number);
			//修改字符串内容
			//把字符串变成字符数组
			char[] arr = sb.toString().toCharArray();
			//拿着最后的索引和随机索引进行交换
			int randomIndex = r.nextInt(arr.length);
			char temp = arr[randomIndex];
			arr[randomIndex] = arr[arr.length - 1];
			arr[arr.length - 1] = temp;
			//把字符数组改成字符串
			return new String(arr);
	}
	//注册
	public static void register(ArrayList<Users> list) {
		
		Scanner sc = new Scanner(System.in);
		//键盘录入用户名
		String username;
		while(true) {
			System.out.println("请输入用户名");
			username = sc.next();
			boolean flag1 = cheakUsername(username);
			if(!flag1) {
				System.out.println("用户名不满足条件请重新输入");
				continue;
			}	
			//判断用户名唯一                                                                           性
			boolean flag2 = contains(list,username);
			if(flag2) {
				System.out.println("用户名已存在请重新输入");
				continue;
			}else {
				System.out.println("用户名可用继续录入");
				break;
			}
		}
		//键盘录入密码
		String password;
		String againPassword;
		while(true) {
			System.out.println("请输入密码");
			password = sc.next();
			System.out.println("请再次输入密码");
			againPassword = sc.next();		
			if(!password.equals(againPassword)){
				System.out.println("两次输入密码不同 请再次录入");
				continue;
			}else {
				System.out.println("密码录入成功 请继续录入其他数据");
				break;
			}
		}
		
		//键盘录入身份证号码
		String penpeoID;
		while(true) {
			System.out.println("请输入身份证号码");
			penpeoID = sc.next();
			boolean flag3 = cheakPenpeoID(penpeoID);
			if(!flag3) {
				System.out.println("请重新输入身份证号码");
				continue;
			}else {
				System.out.println("满足要求请继续录入信息");
				break;
			}
		}
		//键盘录入手机号码
		String phoneNumber;
		while(true) {
			System.out.println("请输入手机号码");
			phoneNumber = sc.next();
			boolean flag4 = cheakPhoneNumber(phoneNumber);
			if(flag4) {
				System.out.println("满足要求");
				break;
			}else {
				System.out.println("请重新输入手机号码");
				continue;
			}
		}
		Users u = new Users(username,password,penpeoID,phoneNumber);
		list.add(u);
		//遍历集合
		printList(list);

	}
	private static void printList(ArrayList<Users> list) {
		for(int i = 0; i < list.size(); i++) {
			Users user = list.get(i);
			System.out.println(user.getUsername() + " " + user.getPassword() + " " + 
			user.getPenpeoID() + " " + user.getPhoneNumber());
		}
		
	}

	//检查用户名
	public static boolean cheakUsername(String username) {
		int len = username.length();
		//满足：1，长度在3~15之间
		if(len < 3 || len > 15) {
			return false;
		}
		for(int i = 0; i < username.length(); i++) {
			char c = username.charAt(i);
			//不满足大写小写数字的任意一个条件返回false
			if(!(('a'<= c && c <= 'z')||('A' <= c && c <= 'Z')||('0' <= c && c <= '9'))) {
				return false;
			}
		}
		int count = 0;
		for(int i = 0; i < username.length(); i++) {
			char c = username.charAt(i);
			//不能纯数字
			if(('a'<= c && c <= 'z')||('A' <= c && c <= 'Z')) {
				count++;
				break;
			}
		}
		return count > 0;
		
	}
	//手机号码检查方法
	private static boolean cheakPhoneNumber(String phoneNumber) {
		//1长度11位置
		if(phoneNumber.length() != 11){
			System.out.println("长度必须11位 不满足此要求");
			return false;
			
		}
//		2不能以0开头
		if(phoneNumber.charAt(0) == '0') {
			System.out.println("手机号不能以0开头 不满足此要求");
			return false;
		}
		//3必须是数字
		for(int i = 0; i < 11; i++) {
			char c1 = phoneNumber.charAt(i);
			if(!(c1 >= '0' && c1 <= '9')) {
				System.out.println("手机号必须是数字 不满足此要求");	
				return false;
			}
		}
		return true;
	}
	//身份证检查方法
	private static boolean cheakPenpeoID(String penpeoID) {
		//要求1.长度18位
			if(!(penpeoID.length() == 18) ){
				System.out.println("长度必须为18位 不满足此要求");
				return false;
				//2.不能以0开头
			}
			if(penpeoID.charAt(0) == '0'){
				System.out.println("首位必须是0 不满足此要求");
				return false;
				//3.前十七位必须是数字
			}
			for(int i = 0; i < 17; i++){
				char c = penpeoID.charAt(i);
				if(!(c >= '0' && c <= '9')) {
					System.out.println("前17位必须是纯数字 不满足此要求");
					return false;
				}
			}
			
			//4.最后一位可以是数字也可以是X或者x
			char cLast = penpeoID.charAt(17);
			if(!((cLast == 'x')||(cLast == 'X')||(cLast >= '0' && cLast <= '9'))) {
				System.out.println("最后一位必须是数字、X或x 不满足此要求");
				return false;
			}
			return true;
	}
	//判断用户名唯一方法
	private static boolean contains(ArrayList<Users> list, String username) {
		for(int i = 0; i < list.size(); i++) {
			Users user = list.get(i);
			String rightUsername = user.getUsername();
			if(rightUsername.equals(username)) {
				return true;
			}
		}

			return false;
		}

	//忘记密码
	public static void forgetPassword(ArrayList<Users> list) {
		//键盘录入用户名判断是否存在
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名");
		String username = sc.next();
		boolean flag1 = contains(list,username);
		if(!flag1){
			System.out.println("当前用户" + username + "不存在 请先注册");
			return;
		}
		//键盘录入身份证号码和手机号码
		System.out.println("请输入身份证号");
		String penpeoID = sc.next();
		
		System.out.println("请输入手机号");
		String phoneNumber = sc.next();
		//通过索引比较身份证号码和手机号码
		int index = findIndex(list,username);
		Users u = list.get(index);
		if(!(penpeoID.equalsIgnoreCase(u.getPenpeoID()) && phoneNumber.equalsIgnoreCase(u.getPhoneNumber())) ){
			System.out.println("身份证号或手机号码有误，不能修改密码");
			return;
		}
		
		//以上全部验证成功 修改密码即可
		String newPassword;
		while(true) {
			System.out.println("请输入新的密码");
			newPassword = sc.next();
			System.out.println("请再次输入密码");
			String againPassword = sc.next();
			if(!(newPassword.equals(againPassword))) {
				System.out.println("两次输入密码不同 请重新输入");
				continue;
			}else {
				System.out.println("两次输入密码输入相同");
				break;
			}
			
		}
		u.setPassword(newPassword);
		System.out.println("密码修改成功");
		
	}
	
	//找到用户名索引方法
	private static int findIndex(ArrayList<Users> list, String username) {
		for(int i = 0; i < list.size(); i++) {
			Users u = list.get(i);
			if(u.getUsername().equals(username)) {
				return i;
			}
		}
		return -1;
	}
}
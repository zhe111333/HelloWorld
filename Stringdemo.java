import java.util.Scanner;
public class Stringdemo{
	public static void main(String[] args) {
		//需求：已知账号密码，用户进行登录，最多登录三次，根据登录情况给出提示
		//1定义账号密码
		String rigntUsername = "zhangsan";
		String rigntPassword = "123456";
		//2循环三次，键盘录入账号密码
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			System.out.println("请输入账号");
			String username = sc.next();
			System.out.println("请输入密码");
			String password = sc.next();
			//3判断账号密码相等break退出，不等则嵌套判断，失败前两次提示 第三次锁定
			if(rigntUsername.equals(username) && rigntPassword.equals(password)) {
				System.out.println("用户登录成功");
				break;
			}else {
				if(i == 2) {
					System.out.println("用户登录失败账户被锁定请联系电话xxx-xxx-xxx");
				}else {
					System.out.println("用户登录失败还剩" + (2-i) + "次机会");
				}
			}
		}
	}
	}
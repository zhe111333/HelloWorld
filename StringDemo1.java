import java.util.Scanner;
public class StringDemo1{
	public static void main(String[] args) {
		//需求：输入一个字符串，根据输入的数字统计出又多少个大写字母 多少个小写字母 多少个数字
		//1键盘录入一个数字，并遍历每个字符
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串");
		String str = sc.next();
		//2定义计数器 根据条件计数器统计出现次数
		int bigcount = 0;
		int smallcount = 0;
		int numcount = 0;
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			//char的字符全部对应ascii表
			if(c >= 'a' && c <= 'z') {
				smallcount = smallcount + 1;
			}else if(c >= 'A' && c <= 'Z') {
				bigcount = bigcount + 1;
			}else if(c >= '0' && c <= '9'){
				numcount = numcount + 1;
			}
		}
		System.out.println("大写字母" + bigcount + "个");
		System.out.println("小写字母" + smallcount + "个");
		System.out.println("数字" + numcount + "个");

	}
	}
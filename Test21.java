import java.util.Scanner;
public class Test21{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入星期数");
		int week = sc.nextInt();
		switch(week) {
		case 1:
			System.out.println("游泳");
			break;
		case 2:
			System.out.println("跑步");
			break;
		case 3:
			System.out.println("跳绳");
			break;
		case 4:
			System.out.println("举重");
			break;
		case 5:
			System.out.println("篮球");
			break;
		case 6:
			System.out.println("跳舞");
			break;
		default:
			System.out.println("足球");
			break;
			
		}
	}
}
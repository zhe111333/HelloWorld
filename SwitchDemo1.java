import java.util.Scanner;
public class SwitchDemo1{
	//需求：运用case穿透完成  输入一个数字 若为1~5 输出工作日 若为6、7 输出休息日 输入其他则显示错误
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字");
		int num = sc.nextInt();
		switch (num) {
		case 1,2,3,4,5 -> System.out.println("工作日");
		case 6,7 -> System.out.println("休息日");
		default -> System.out.println("错误");
		}
	}
}
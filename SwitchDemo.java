import java.util.Scanner;
public class SwitchDemo{
	//需求：使用简化写法 输入1、2、3阿拉伯数字 后面输出中文对应数一、二、三输入其他数字显示错误
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字");
		int num = sc.nextInt();
		switch (num) {
		case 1 -> System.out.println("一");
		case 2 -> System.out.println("二");
		case 3 -> System.out.println("三");
		default -> System.out.println("错误");

		}
	}
}
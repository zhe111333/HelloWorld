//1~100内猜数字
import java.util.Random;
import java.util.Scanner;
public class LoopTest{
	public static void main (String[] args) {
		//生成1-100随机数
		Random r = new Random();
		int num1 = r.nextInt(100) + 1;
		Scanner sc = new Scanner(System.in);
		//无限循环 不知道范围只确定结果用while
		while(true) {
			//输入一个数num2和随机数num1比较，相等break退出 其他情况继续无限循环并给出提示
			System.out.println("请输入一个1~100内的整数");
			int num2 = sc.nextInt();
			if(num2 == num1) {
				System.out.println("猜对了为" + num1);
				break;
			}else if(num2 > num1) {
				System.out.println("猜大了");
			}else {
				System.out.println("猜小了");
			}
		}
	}
}
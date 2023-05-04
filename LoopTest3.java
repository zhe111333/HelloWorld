import java.util.Scanner;
public class LoopTest3 {
	public static void main (String[] args) {
		//输入一个整数，找出他的平方根 只取整数
		Scanner num = new Scanner(System.in);
		System.out.println("请输入数字");
		int num1 = num.nextInt();
		for (int i = 1; i < num1; i++) {
			if (i * i == num1) {
				System.out.println(i);
				break;
			}else if (i * i  > num1 ){
				System.out.println(i - 1);
				break;
			}

		}
	}
}
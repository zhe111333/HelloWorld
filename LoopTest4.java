import java.util.Scanner;
public class LoopTest4 {
	public static void main (String[] args) {
		//输入一个整数，判断是否是质数
		Scanner num = new Scanner(System.in);
		System.out.println("请输入数字");
		int num1 = num.nextInt();
		//定义boolean变量初始值为true  保证for循环完范围内全部整数都不满足条件的情况boolean不变还是true 
		//一旦有一个数满足则输出false ，避免循环过程中有一个数不满足就输出是质数其他数还没开始看
		boolean flag =true;
		//循环 num1整除任何2~num1-1范围内的数说明不是质数
		for (int i = 2; i < num1; i++) {
			if (num1 % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println(num1 + "是一个质数");
		}else {
			System.out.println(num1 + "不是一个质数");
		}
	}
}
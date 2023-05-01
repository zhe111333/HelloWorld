//需求：给一个数字如果是回文数返回ture 否则返回false 回文数指正着读和倒着读一样如 121 
import java.util.Scanner;
public class Test7{
	public static void main(String[] args) {
		//输入数字
		Scanner num = new Scanner(System.in);
		System.out.println("请输入数字");
		int start = num.nextInt();
		//判断是否是回文数 是则返回ture 不是则返回flase
		//定义一个变量作为start的原始变量，用于比较
		int data = start;
		int data2 = 0;
		while (start != 0) {
			int ge = start % 10;
			start = start / 10;
			data2 = data2 * 10 + ge;
		}
		System.out.println("倒叙为 " + data2);		
		System.out.println(data == data2);
	
}
}
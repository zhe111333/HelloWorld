import java.util.Scanner;
public class Test25{
	public static void main(String[] args) {
		//需求：6个评委打分，去掉最高分最低分，求最终得分
		//调用评委打分数组
		int fraction[] = getFract();
		for(int i = 0; i < fraction.length; i++) {
		}
		//调用最大值、最小值、6个分数和
		int max = getMax(fraction);
		int min = getMin(fraction);
		int sum = getSum(fraction);
		//求最终分数
		int mean = (sum - min - max) / 4;
		System.out.println(mean);
	}
	//2.求最大值
	public static int getMax(int[] fraction) {
		int max = fraction[0];
		for(int i = 0; i < fraction.length; i++) {
			if(max < fraction[i]) {
				max = fraction[i];
			}
		}
		return  max;
	}
	//3求最小值
	public static int getMin(int[] fraction) {
		int min = fraction[0];
		for(int i = 0; i < fraction.length; i++) {
			if(min > fraction[i]) {
				min = fraction[i];
			}
		}
		return  min;
	}
	//4求和
	public static int getSum(int[] fraction) {
		int sum = 0;
		for(int i = 0; i < fraction.length; i++) {
			sum = sum + fraction[i];
		}
		return sum;
	}
	//1定义数组 储存6个评委的分数
	public static int[] getFract() {
		int[] fracts = new int[6];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < fracts.length;) {
			System.out.println("请输入分数");
			int num = sc.nextInt();
			if(num <= 100 && num >= 0) {
			fracts[i] = num;
			i++;
			}else {
				System.out.println("请重新输入");
			}
		}
		return fracts;
	}
}
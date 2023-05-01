import java.util.Scanner;
public class Test5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数表示范围的开始");
		int start = sc.nextInt();
		System.out.println("请输入第一个数表示范围的结束");
		int end = sc.nextInt();		
		int num = 0;
		System.out.println(start + "~" + end + "中同时被3和5整除的数字为");
		//范围内能同时被3和5整除的数字
		for (int i = start; i <= end; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				num++;
				System.out.print(i + " ");
			}
		}
		System.out.println(" ");
		System.out.println(num);
	}
}
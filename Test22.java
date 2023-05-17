import java.util.Scanner;
public class Test22{
	//需求 物品价值1000元 属于vip等级 计算出最终需要支付的价格
	//vip1级打9折   2级8折  3级7折  输入其他不打折 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入vip等级");
		int vip = sc.nextInt();
		int price = 1000;
		if (vip == 1) {
			System.out.println("需要支付" + 0.9*price);
		}else if(vip == 2) {
			System.out.println("需要支付" + 0.8*price);
		}else if(vip == 3) {
			System.out.println("需要支付" + 0.7*price);
		}else {
			System.out.println("需要支付" + price);
		}
	}
}
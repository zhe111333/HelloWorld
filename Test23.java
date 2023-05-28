import java.util.Scanner;
public class Test23{
	public static void main(String[] args) {
		//需求 键盘录入机票原价 季节 舱位（头等舱或经济舱） 
		//根据规则 5-10月份为旺季头等舱9折经济舱8.5折 其他季节淡季头等舱7折经济舱6.5折
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入机票原价");
		int vote = sc.nextInt();
		System.out.println("请输入月份");
		int month = sc.nextInt();
		System.out.println("请输入舱位，0代表头等舱1代表经济舱");
		int pos = sc.nextInt();
		if(month >= 5 && month <= 10) {
			vote = getPrice(vote,pos,0.9,0.85);
		}else if((month <= 4 && month >= 1) || (month <= 12 && month >= 11)) {
			vote = getPrice(vote,pos,0.7,0.65);

		}else {
			System.out.println("输入不正确");
			vote = getPrice(vote,pos,0.7,0.65);
		}	
		System.out.println(vote);
	}
	//创建方法 传入参数原价机票 舱位 头等舱折扣 经济舱折扣
	public static int getPrice( int vote,  int pos,  double v0, double v1) {
		if(pos == 0) {
			vote = (int)(vote * v0);
		}else if(pos == 1) {
			vote = (int)(vote * v1);
		}else {
			System.out.println("输入不正确");
		}
		return vote;
	}
}
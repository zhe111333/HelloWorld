public class Test6{
	public static void main(String[] args) {
		//定义珠穆拉玛峰高度
		double seco = 8844430;
		//定义纸张厚度变量
		double paper = 0.1;
		//定义初始对折次数
		int count = 0;
		//使用while语句进行循环 判断对折次数 原因：不知道次数和范围 知道结果
		while (paper < seco) {
			paper = paper * 2;
			count++;
		}
		System.out.println(count);
	}
}
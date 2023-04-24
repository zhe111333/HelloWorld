public class Phone {
	//创建类属性 品牌、价格
	String brand;
	double price;
	//创建行为
	public void call() {
		System.out.println("手机在打电话");
	}
	//创建对象并给手机类赋值 调用手机call方法
	public static void main(String[] args) {
		Phone mi = new Phone();
		mi.brand = "xiaomi";
		System.out.println(mi.brand);
		mi.call();
		
		String s = "sadasdasd";
		int ss = s.length();
		System.out.println(ss);

		
	}
}
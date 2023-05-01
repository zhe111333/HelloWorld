public class Aaa{
	
	//空参
	public Aaa() {}
	//带参方法 传入直接计算 返回结果
	public int Aaa(int a, int b) {
		return a+b;
	}
	//创建对象，打印方法并传参
	public static void main(String[] args) {
		Aaa c = new Aaa();
		System.out.println(c.Aaa(5, 4));
	}
}
public class Bbb{
	int a;
	int b;
	 //空参
	public Bbb() {}
	//带参初始化成员变量
	public void Boo(int a, int b) {
		this.a = a;
		this.b = b;
	}
	//对外提供
	public int getBoo() {
		return a + b;
	}
	//创建对象
	public static void main(String[] args) {
		Bbb c = new Bbb();
		c.Boo(5, 4);
		System.out.println(c.getBoo());
	}
	}
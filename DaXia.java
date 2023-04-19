public class DaXia{
	String name;
	String waihao;
	int age;
	String bangpai;
	//两个构造方法
	public DaXia(String name, int age, String bangpai) {
		this.name = name;
		this.age = age;
		this.bangpai = bangpai;		
	}

		
	public DaXia(String name, int age, String bangpai, String waihao) {
		//调用其他构造方法
		this(name, age, bangpai);
		this.waihao = waihao;	
	}
	public static void main(String[] args) {
		DaXia dx1 = new DaXia("岳不群", 18, "华山派");
		DaXia dx2 = new DaXia("武松", 19, "梁山", "行者");	
		System.out.println(dx1.name);
		System.out.println(dx1.bangpai);
		System.out.println(dx2.name);
		System.out.println(dx2.waihao);
	}

	
}
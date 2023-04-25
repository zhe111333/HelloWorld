public class GirlFriend{
	//属性
	private String name;
	private int age;
	
	//对私有化成员变量 提供get、set方法
	//set方法：给成员变量赋值
	//get方法：对外提供成员变量的值
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		if (age >= 18 && age <= 50) {
			this.age = age;
		}else {
			System.out.println("输入错误");
		}
		
	}
	public int getAge() {
		return age;
	}
	
	//行为
	public void sleep() {
		System.out.println("在睡觉");
	}
	
	//创建对象
	public static void main(String[] args) {
		GirlFriend gf1 = new GirlFriend();
		gf1.setName("小诗诗");
		gf1.setAge(18);
		
		System.out.println(gf1.getName());
		System.out.println(gf1.getAge());

		gf1.sleep();	
		
	}
}
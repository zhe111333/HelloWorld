public class Car{
	//成员变量
	String clocr;
	int speed;
	int seat = 5;
	//成员方法
	public void run() {
		System.out.println("车能跑");
	}
	public static void main(String[] args) {
		Car c = new Car();
		c.clocr = "绿色";
		c.speed = 128;
		System.out.println(c.clocr);
		Car c2 = new Car();
		c2.clocr = "红色";
		c2.speed = 180;
		System.out.println(c2.clocr);
		System.out.println(c.seat);
		System.out.println(c2.seat);

			
	}
}
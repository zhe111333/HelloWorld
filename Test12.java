public class Test12{
	public static void main(String[] args) {
		System.out.println("a");
		method1();
		System.out.println("b");
	}
	public static void method1() {
		method2();
		System.out.println("c");

		}
	public static void method2() {
		System.out.println("d");
		System.out.println("e");
	}
}
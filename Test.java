public class Test{
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 25;
		int d = 25;
		int e = ++a;
		System.out.println("a+b=" + (a + b));
		System.out.println("a-b=" + (a - b));
		System.out.println("a*b=" + (a * b));
		System.out.println("b/a=" + (b / a));
		System.out.println("e=a++=" + (e));
		System.out.println("a--=" + (--a));
		System.out.println("d++=" + (d++));
	}
}
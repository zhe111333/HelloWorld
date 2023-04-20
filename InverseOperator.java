public class InverseOperator{
	public static void main(String[] args) {
		System.out.println(6 > 2);
		//逻辑取反！ 结果为ture 取反后则为false
		System.out.println(!(6 > 2));
		boolean b = (10 > 1) ^ (3 < 5);
		//逻辑异或 当第一个结果与第二个结果相同时 结果为假 不同时为真
		System.out.println("b=" + b);

	}
}

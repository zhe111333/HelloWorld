public class LogicOperator02{
	public static void main(String[] args) {
		int a = 4;
		int b = 9;
		int c = 4;
		int d = 9;
		if(a > 1 || ++b < 2) {
			System.out.println("ture1");	
		}
		//短路活的第一个条件F 直接推出不在执行第二个条件 b则不加1为9
		System.out.println("a=" + a + "b=" + b);	
		
		if(c > 1 | ++d < 2) {
			System.out.println("ture2");	

		}
		//逻辑或的第一个条件F 不直接推出继续执行第二个条件 b则加1为10

		System.out.println("c=" + c + "d=" + d);	

	}	
}

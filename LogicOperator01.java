public class LogicOperator01{
	public static void main(String[] args) {
		int a = 4;
		int b = 9;
		int c = 4;
		int d = 9;
		if(a > 5 && ++b < 50) {
			System.out.println("a=" + a + "b=" + b);	
		}
		//短路与的第一个条件F 直接推出不在执行第二个条件 b则不加1为9
		System.out.println("a=" + a + "b=" + b);	
		
		if(c > 5 & ++d < 50) {
			
		}
		//逻辑与的第一个条件F 不直接推出继续执行第二个条件 b则加1为10

		System.out.println("c=" + c + "d=" + d);	

	}	
}

public class Test16{
	public static void main(String[] args) {
		int sum1 = num(10,20);
		int sum2 = num(20,20);
		if (sum1 > sum2) {
		System.out.println(sum1);
		}else
		System.out.println(sum2);
	}
	public static int num(int num1,int num2) {
		int result = num1 * num2;
		return result;
	}		
}
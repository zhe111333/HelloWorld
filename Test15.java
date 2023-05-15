public class Test15{
	public static void main(String[] args) {
		int sum1 = turnover(10,20,30);
		int sum2 = turnover(20,20,30);
		int sum3 = turnover(20,20,30);
		int sum4 = turnover(20,20,30);
		int sum = sum1 + sum2 + sum3 + sum4;
		System.out.println(sum);
	}
	public static int turnover(int num1,int num2,int num3) {
		int result = num1 + num2 + num3;
		return result;
	}		
}
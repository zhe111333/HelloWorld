import java.util.Random;

public class ArrTest5{
	public static void main(String[] args) {
		
		//定义数组
		int[] arr = new int[10];
		//生成随机数传递给数组
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			int number = r.nextInt(100) + 1;
			arr[i] = number;
		}
		//遍历
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");		
		//所有数据的求和
		int summation = 0;
		int average = 0;
		for (int i = 0; i < arr.length; i++) {
			summation = summation + arr[i];
			
		}
		System.out.println("所有数据的和为 " + summation);
		//求所有数据的平均数
		average = summation / arr.length;
		System.out.println("所有数据平均数为 " + average);
		//统计有多少个数据比平均值小
		int data = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < average) {
				data++;
			}
		}
		System.out.println("比平均数小的数据个数为 " + data);
	}
}
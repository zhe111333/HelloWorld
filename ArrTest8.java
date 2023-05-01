import java.util.Random;

public class ArrTest8{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		//定义随机数num 将num与arr数组索引进行交换，num不在出现重复值
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			int num = r.nextInt(arr.length);
			int temp = arr[i];
			arr[i] = arr[num];
			arr[num] = temp;

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}
}

public class ArrTest7{
	public static void main(String[] args) {
		//将arr数组中的数据 前后交换，直至换到中间数
		int[] arr = {1,2,3,4,5};
		for(int i = 0, j = arr.length - 1; i < j; i++, j-- ) {
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
		}
		for (int i =0; i < arr.length; i ++) {
			System.out.print(arr[i] + " ");
		}

	}
}

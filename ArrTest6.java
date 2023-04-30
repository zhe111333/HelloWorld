public class ArrTest6{
	public static void main(String[] args) {
		//定义数组arr、arr2
		int[] arr = new int[5];
		int[] arr2 = new int[5];
		int y = arr.length -1;
		//给arr赋值 并将遍历的结果赋值给arr2的倒叙索引
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			arr2[y] = arr[i];
			System.out.print(arr[i]);			
			y--;
		}
		System.out.println("");
		//遍历arr2
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr2[i]);
		}

		}
		
}

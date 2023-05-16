import java.util.ArrayList;
public class Test20{
	public static void main(String[] args) {
		//需求：给出一个数组 传入开始、结束的数字作为索引 定义从开始到结束（包括开始不包括结束）为索引的数组到新数组 并返回
		int[] arr = {11,22,33,44,55,66,77,88};

		System.out.println(newArr(arr, 3, 6));
		
	
	}

	public static ArrayList<Integer> newArr(int[] arr, int from, int end) {
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		for (int i=0; i<arr.length; i++) {
			if(arr[i] >= arr[from] && arr[i] < arr[end]) {
				arr2.add(arr[i]);
			}
		}
		return arr2;

	}		
}
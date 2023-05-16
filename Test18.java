public class Test18{
	public static void main(String[] args) {
		int[] arr = {11,22,66,44,55};
		System.out.println(printArr(arr));
	
	}
	public static int printArr(int[] arr) {
		int num = arr[0];
		for (int i=0; i<arr.length; i++) {
			if(arr[i] > num) {
				num = arr[i];
			}
		}
		return num;

	}		
}
public class Test19{
	public static void main(String[] args) {
		int[] arr = {11,22,66,44,55};
		//调用参数不带数据类型
		boolean result= Determine(arr, 66);
		System.out.println(result);
	
	}
	//boolean方法与返回值参数数据类型一致，跟参数没关系，定义参数时必须前面带参数的数据类型）
	public static boolean Determine(int[] arr, int number) {
		for (int i=0; i<arr.length; i++) {
			if(arr[i] == number) {
				return true;
			}
		}
		return false;

	}		
}
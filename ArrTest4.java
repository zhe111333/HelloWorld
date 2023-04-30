public class ArrTest4{
	public static void main(String[] args) {
		//定义数组
		int[] arr = {33,5,22,44,55};
		//假设0索引数组为最大值
		int max = arr[0];
		//遍历数组元素与max比较 大于max则更新max值为大的
		for (int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}else {
				max =max;
			}
		}
		System.out.println(max);
	}
}
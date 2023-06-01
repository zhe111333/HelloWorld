public class StringDemo2{
	public static void main(String[] args) {
		//需求 使用方法拼接字符串 将数组int num[] = {1,2,3} 拼接后为[1,2,3]}
		//1定义数组，调用转换方法并打印
		int[] num = {1,2,3};
		String str = convert(num);
		System.out.println(str);
	}
		//2定义转换方法，判断数组不为空 长度不为空
	public static String convert(int[] arr){
		if(arr == null){
			return "";			
		}
		if(arr.length == 0) {
			return  "[]";
		}
		//3不为空时遍历数组拼接到字符串
		String result = "[";
		for(int i = 0; i < arr.length; i++) {
			if(i < (arr.length - 1)) {
				result = result + arr[i] + ", ";
			}else {
				result = result + arr[i] + "]";
			}
			}
			return result;
		}
}

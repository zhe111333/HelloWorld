public class StringDemo3{
	public static void main(String[] args) {
		//需求用方法实现反转字符串
		//1调用方法并打印
		String result= convert("abcd");
		System.out.println(result);
	}
	//2用方法实现反转，倒着遍历传入字符串索引
	public static String convert(String str) {
		String result = "";
		for(int i = (str.length() - 1); i >= 0; i--) {
			result = result + str.charAt(i);
		}
		return result;
	}
}
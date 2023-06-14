import java.util.ArrayList;
import java.util.Random;
public class Test28{
	public static void main(String[] args){
		
		//创建集合添加48个字母
		ArrayList<Character> list = new ArrayList<>();
		for(int i = 0; i < 26; i++) {
			char a = (char) ('a' + i);
			char A = (char) ('A' + i);
			list.add(a);
			list.add(A);

		}
		//创建可变字符串 添加list随机索引
		StringBuilder sb = new StringBuilder();
		Random r = new Random();
		for(int i = 0; i < 4; i++) {
			int index = r.nextInt(list.size());
			char c = list.get(index);
			sb.append(c);
		}
		//添加数字到末尾
		int number = r.nextInt(10);
		sb.append(number);
		//修改字符串内容
		//把字符串变成字符数组
		char[] arr = sb.toString().toCharArray();
		//拿着最后的索引和随机索引进行交换
		int randomIndex = r.nextInt(arr.length);
		char temp = arr[randomIndex];
		arr[randomIndex] = arr[arr.length - 1];
		arr[arr.length - 1] = temp;
		//把字符数组改成字符串
		System.out.println(arr);


	}
}
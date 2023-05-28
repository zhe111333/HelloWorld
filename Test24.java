import java.util.Random;
public class Test24{
	public static void main(String[] args) {
		//需求：开发5位随机验证码 要求前4位大小写随机字母最后一位0-9随机数字
		//1定义一个数组放放入52个大小写字母，随机取出四个拼接到字符串
		char[] chs = new char[52];
		for(int i = 0; i < chs.length; i++) {
			//判断0·25索引添加a-z
			if(i <= 25) {
				chs[i] = (char)(97 +i);
			//判断26-52索引添加A-Z
			}else {
				chs[i] = (char)(65 + i - 26);
			}

		}
		//定义字符串记录最终结果
		String result = "";
		//2随机打印索引 循环4次拼接到字符串结果
		Random r = new Random();
		for(int i = 1; i <= 4; i++) {
			//每次循环都重新循环索引
			int randomIndex = r.nextInt(chs.length);
			result = result + chs[randomIndex];
		}
		//3随机数0-9拼接字给字符串
		int randomNum = r.nextInt(10);
		result = result + randomNum;
		System.out.println(result);

	}
}
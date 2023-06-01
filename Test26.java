public class Test26{
	public static void main(String[] args) {
		//对4位密码进行加密 先每位加5 在对10求余 最后反转 得到新的数字
		//1.定义数组存入数字
		int arr[] = {1,9,8,3};
		//2.对数组加5
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] + 5;
			System.out.print(" " + arr[i]);
		}
		//3.求余
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] % 10;
			System.out.print(" " + arr[i]);
		}
		//4.反转
		for(int i = 0,j = arr.length - 1; i < j; i++,j--) {
			int temp = 0;
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
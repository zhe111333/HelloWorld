public class Test8{
	public static void main(String[] args) {
		int num1 = 44;
		int num2 = 33;
		int shang = 0;
		while(num2 > num1) {
			num2 = num2 - num1;
			shang++;
		}
		System.out.println("整数想除商为 " + shang);
		System.out.println("整数想除余为 " + num2);
	}

}

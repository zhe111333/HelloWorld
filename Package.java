public class Package{
	public static void main(String[] args) {
		//需求：判断101-200之间有多少质数并打印出来
		//循环需要求的数
		int num = 0;
		for(int i = 101; i <= 200; i++) {
			boolean price = true;
			//循环2~i-1 让i与所有数取模一旦等于零说明可以整除 则不是质数，否则是质数
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					price = false;
				}
			}
			if(price) {	
				num = num + 1;
				System.out.println(i + "是质数");
			}


		}
		System.out.println("共" + num);
	}
}
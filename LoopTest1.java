public class LoopTest1 {
	public static void main (String[] args) {
		//1-100之间的整数 遇到7或跟7的倍数则打印过
		//循环1~100
		for (int i = 1; i <= 100; i++) {
			//个位等于7
			if (i % 10 == 7) {
				System.out.println("过");
				//去掉个位等于7
			}else if (i / 10 == 7) {
				System.out.println("过");
				//7的倍数
			}else if (i % 7 == 0) {
				System.out.println("过");
				//剩余的数
			}else {
				System.out.println(i);
			}

		}
	}
}
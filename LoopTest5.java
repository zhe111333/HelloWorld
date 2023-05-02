import java.util.Random;
public class LoopTest5 {
	public static void main (String[] args) {
		//生成1-100随机数
		Random r = new Random();
		int num = r.nextInt(100) + 1;
		System.out.println(num);

	}
}
public class HeroTest{
	public static void main(String[] args) {
		Hero h1 = new Hero("乔峰", 100, '男');
		Hero h2 = new Hero("鸠摩智", 100, '男');
		h1.show();
		h2.show();
		while(true) {
			h1.attack(h2);
			if(h2.getBlood() == 0) {
				System.out.println(h1.getName() + "ko" + h2.getName());
				break;
			}
			h2.attack(h1);
			if(h1.getBlood() == 0) {
				System.out.println(h2.getName() + "ko" + h1.getName());
				break;
			}
		}
	}
}
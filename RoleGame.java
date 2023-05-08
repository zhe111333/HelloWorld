public class RoleGame{
	public static void main(String[] arge) {
		Role r1 = new Role("乔峰", 100);
		Role r2 = new Role("鸠摩智", 100);
		
		while(true) {
			r1.attack(r2);
			if(r2.blood == 0) {
				System.out.println(r1.getName() + "KO了" + r2.getName());
				break;
			}
			r2.attack(r1);
			if(r1.blood == 0) {
				System.out.println(r1.getName() + "KO了" + r2.getName());
				break;
			}
		}
	}
}
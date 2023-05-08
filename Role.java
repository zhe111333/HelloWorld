import java.util.Random;

public class Role{
	String name;
	int blood;
	public Role() {
		super();
	}
	
	public Role(String name, int blood) {
		this.name = name;
		this.blood = blood;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBlood() {
		return blood;
	}

	public void setBlood(int blood) {
		this.blood = blood;
	}

	//创建攻击方法
	public void attack(Role role) {
		Random r = new Random();
		int hurt = r.nextInt(20) + 1;
		int HP = role.getBlood() - hurt;
		HP = HP < 0 ? 0 : HP;
		role.blood = HP;
		System.out.println(this.getName() + "攻击了一下" + role.getName() + 
		"造成伤害" + hurt + role.getName() + "的剩余血量" + HP);
	}
}
import java.util.Random;
public class Hero{
	private String name;
	private int blood;
	private char gender;
	private String face;
	String[] boyfaces = {"风流倜傥","气宇轩昂","相貌英俊"};
	String[] girlfaces = {"风流倜傥","气宇轩昂","相貌英俊"};
	String[] attacks_desc = {
			"%s使用了一招【背心钉】，转到对方身后，一掌向%s背心的灵台穴拍去。",
			"%s使出了一招【游龙探爪】，飞起身形半空变掌为抓锁向%s"
	};
	String[] injureds_desc= {
			"结果给%s造成了一处瘀伤",
			"结果给%s一击命中，痛的弯下了腰",
			"结果【轰】的一声，%s口吐鲜血倒了下去"
	};
	public Hero() {
	}

	public Hero(String name, int blood, char gender) {
		this.name = name;
		this.blood = blood;
		this.gender = gender;
		setFace(gender);
	}
	
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getFace() {
		return face;
	}

	public void setFace(char gender) {
		//判断性别 选择不同的数组  利用数组长度范围随机选择索引，在赋值给this.face
		Random r = new Random();
		if(gender == '男') {
			int index = r.nextInt(boyfaces.length);
			this.face = boyfaces[index];
		}else if(gender == '女') {
			int index = r.nextInt(girlfaces.length);
			this.face = girlfaces[index];
		}else {
			this.face = "面目狰狞";
		}
		this.face = face;
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
	//创建方法 参数为对象hero
	public void attack(Hero hero) {
		Random r = new Random();
		int index = r.nextInt(attacks_desc.length);
		String gongfu = attacks_desc[index];
		System.out.printf(gongfu,this.getName(),hero.getName());
		System.out.println();
		//随机数0~20
		int hurt = r.nextInt(20) + 1;
		//剩余血量
		int residue = hero.getBlood() - hurt;
		int residue1 = residue < 0 ? 0 :residue;
		hero.setBlood(residue1);
		if (residue1 < 80) {
			System.out.printf(injureds_desc[0], hero.getName());
		}else if (residue1 < 50) {
			System.out.printf(injureds_desc[1], hero.getName());

		}else if (residue1 == 0) {
			System.out.printf(injureds_desc[2], hero.getName());

		}
		System.out.println();
	}
	public void show() {
		System.out.println("姓名为" + getName());
		System.out.println("血量为" + getBlood());
		System.out.println("性别为" + getGender());
		System.out.println("长相为" + getFace());

	}
	
	
}
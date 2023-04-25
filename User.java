public class User{
	private String username;
	String password;
	String emial;
	String gender;
	int age;
	
	public User() {}

	public User(String username, String password, String emial, String gender, int age) {
		super();
		this.username = username;
		this.password = password;
		this.emial = emial;
		this.gender = gender;
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmial() {
		return emial;
	}

	public void setEmial(String emial) {
		this.emial = emial;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	public static void main(String[] args) {
		User u1 = new User("xiaoming", "123123123", "123@qq.com", "nan", 18);
		System.out.println(u1.getUsername());
		System.out.println(u1.getPassword());
		System.out.println(u1.getEmial());
		System.out.println(u1.getGender());
		System.out.println(u1.getAge() );
	}
}
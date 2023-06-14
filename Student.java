public class Student{
		private String id;
		private String name;
		private int age;
		private String address;
		
		
		//默认构造方法
		public Student() {
			
		}
		//带参构造方法给成员变量赋值


		public Student(String id, String name, int age, String address) {
			this.id = id;
			this.name = name;
			this.age = age;
			this.address = address;
		}


		public String getId() {
			return id;
		}


		public void setId(String id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}
		
	
}
		
		
		

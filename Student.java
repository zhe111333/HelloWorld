public class Student{
		private String name;
		private int age;
		//默认构造方法
		public Student() {
			
		}
		//带参构造方法给成员变量赋值
		public Student(String name, int age) {
			this.age = age;				
			this.name = name;		
		}
		//对外提供成员变量的值
		public String getname() {
			return name;
		}
		public int getage() {
			return age;
		}
		
}
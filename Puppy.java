public classs Puppy{
	int puppyAge;
	public Puppy(Steing name) {
		System.out.println("小狗的名字是"+name);
	}
	
	public void setAge(int age) {
		puppyAge =age;
	}
     
	public int getAge() {
		System.out.println("小狗年龄"+ puppyAge);
		return puppyAge;
	}
	
	public static void main (String [] args) {
		puppy mypuppy = new puppy("tommy");
		myPuppy.setAge(2);
		myPuppy.getAge();
		System.out.println("变量值" + myPuppy.puppyAge);
	}
}
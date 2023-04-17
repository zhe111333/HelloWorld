public class Store2 {
	String prodictType;
	
	public Store2(String product) {
		prodictType = product;
	}
	
	public static void main(String[] args) {
		Store2 lemonadeStand = new Store2("lemonade");
		System.out.println(lemonadeStand.prodictType);
	}
}
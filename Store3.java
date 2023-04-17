public class Store3{
	String productType;
	int invertoryCount;
	double invertoryPrice;
	public Store3(String product, int count, double price) {
		productType = product;
		invertoryCount = count;
		invertoryPrice = price;
	}
	public static void main(String[] args) {
		Store3 cookiwShop = new Store3("cookies", 12, 3.75);
		

	}
}
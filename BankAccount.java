public class BankAccount{
	public static void main(String[] args) {
		double balance = 1000.75;
		double amountToWithdrm = 250;
		double updatedBalance = balance - amountToWithdrm;
		double amountFochFriend = updatedBalance/3;
		boolean canPurchaseTicket = amountFochFriend >= 250;
		System.out.println(canPurchaseTicket);
		System.out.println("I gave each friend" + " " + amountFochFriend + "...");
		
	}
}
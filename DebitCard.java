package base;

public class DebitCard {

	public static void main(String[] args) {

		//create a new account 
		BankAccount cc = new BankAccount();
		
		//view the balance
		System.out.println(cc.balance());
		
		//transfer an amount of money
		cc.transferTo(6230.36); // USD
		
		//check if the transfer was fulfilled
		System.out.println(cc);
		
		//withdraw an amount of money
		cc.withdrawFrom(500);
		
		//check the balance
		System.out.println(cc);
		
		//what happens if you try to withdraw a negative amount
		try{
			cc.withdrawFrom(-5000);
		}
		catch (IllegalArgumentException e){
			System.out.println("WARNING! ACCESS DENIED. You cannot withdraw a negative amount.");
		}
		
		//what happens if you try to withdraw more than you have
		try{
			cc.withdrawFrom(1000000);
		}
		catch (IllegalArgumentException e){
			System.out.println("WARNING! ACCESS DENIED. Your balance is lower than the amount you want to widthraw.");
		}
		
		//what happens if you try to transfer a negative amount to the account
		try{
			cc.transferTo(-100);
		}
		catch (IllegalArgumentException e){
			System.out.println("WARNING! ACCESS DENIED. You can only transfer an amount bigger than zero.");
		}
		
	}

}

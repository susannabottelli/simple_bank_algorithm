package base;

public class BankAccount {
	
	// account balance
	private double balance;
	
	//default constructor
	public BankAccount(){}
	
	//constructor that accepts a certain amount of transferred money when the bank account is created
	public BankAccount(double money){
		this.balance = money;
	}
	
	//method to return the account balance
	public double balance(){
		return this.balance;
	}
	
	//method to transfer money to the bank account
	public void transferTo(double deposit){
		if(deposit>0){
			this.balance += deposit;
		}
		//the account should not accept void or negative transfers
		else{
			throw new IllegalArgumentException("Your new deposit cannot be negative or zero");
		}
	}
	
	//method to withdraw money from the bank account
	public void withdrawFrom(double withdrawal){
		
		//you can withdraw if the balance is not void or negative, and it is higher than the amount to withdraw
		if(withdrawal<this.balance & withdrawal>0){
			this.balance -= withdrawal;
		}
		//you are not allowed to withdraw if you don't have enough money
		else if(!(withdrawal<this.balance)){
			throw new IllegalArgumentException("WARNING! ACCESS DENIED. Your balance is lower than the amount you want to withdraw.");
		}
		//you are not allowed to withdraw a void or negative amount
		else if(withdrawal<=0){
			throw new IllegalArgumentException("WARNING! You can only withdraw an amount bigger than zero.");
		}
	}
	
	@Override
	// view the new balance
	public String toString(){
		return "Your current balance is: "+this.balance;
	}



}

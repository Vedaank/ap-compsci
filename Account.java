// Mike Bollhorst
// Sept 6, 2012
// Account class to allow users to maintain bank accounts
public class Account 
{
	private double balance;
	private double rate;
	
	// constructor has two parameters, the opening balance and the interest rate
	// pre: balance >= 0, 0.0 <= rate <= 1.00
	public Account(double balance, double rate)
	{
		this.balance = balance;
		this.rate = rate;
	}
	
	// pre: amount > 0
	// post: balance increased by amount
	public void deposit(double amount)
	{
		this.balance += amount;
	}
	
	// pre: amount < 0
	// post: balance decreased by amount
	public void withdraw(double amount)
	{
		balance -= amount;
	}
	
	// pre: none
	// post: one year's interest added to the account balance
	public void postInterest()
	{
		double interest = balance * rate;
		deposit(interest);
	}
	
	// pre: none
	// post: returns the current balance
	public double getBalance()
	{
		return balance;
	}
}
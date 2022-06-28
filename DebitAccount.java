public class DebitAccount extends Account
{
	
	public DebitAccount()
	{
		super();
	}
	public DebitAccount(String name ,String Id,String nominee,double balance)
	{
		super(name,Id,nominee,balance);
	}
	
	protected boolean deposit(double amount)
	{
		if(super.balance + amount <=100000 && amount <= 20000)
		{
			super.balance=super.balance+amount;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	protected boolean withdraw(double amount)
	{
		if(super.balance >= amount && amount <= 20000)
		{
			super.balance=super.balance-amount;
			return true;
			
		}
		else
		{
			return false;
		}
		
	}
	public void printAccount()
	{
		System.out.println("Name is: "+super.name);
		System.out.println("ID is: "+super.Id);
		System.out.println("Nominee is: "+super.nominee);
		System.out.println("Balance is: "+super.balance);
		
		
		
		
	}
	
}
	
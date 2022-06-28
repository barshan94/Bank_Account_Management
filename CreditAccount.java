public class CreditAccount extends Account
{
	public CreditAccount()
	{
		super();
	}
	public CreditAccount(String name ,String Id,String nominee,double balance)
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
		if (amount > 20000){
			System.out.print ("Cannot Withdraw More than 20000 BDT");
			return false;
		}
		else{
			if (super.balance - amount <= -100000){
				super.balance -= amount; 
				return true;
			}
			else{
				System.out.println("Insufficient Balance");
				return false;
			}
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
public class Account 
{
	protected String name;
	protected String Id;
	protected String nominee;
	protected double balance;
	
	public Account()
	{
		this.name=" ";
		this.Id=" ";
		this.nominee=" ";
		this.balance=0;
	}
	public Account(String name ,String Id,String nominee,double balance)
	{
		this.name=name;
		this.Id=Id;
		this.nominee=nominee;
		this.balance=balance;
	}
	protected boolean deposit(double amount)
	{
		this.balance=this.balance+amount;
		return true;
	}
	protected boolean withdraw(double amount)
	{
		if(amount<=this.balance)
		{
			this.balance=this.balance-amount;
			return true;
			
		}
		else
		{
			return false;
		}
		
	}
	public void printAccount()
	{
		System.out.println("Name is: "+this.name);
		System.out.println("ID is: "+this.Id);
		System.out.println("Nominee is: "+this.nominee);
		System.out.println("Balance is: "+this.balance);
		
		
		
		
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setID(String Id)
	{
		this.Id=Id;
	}
	public String getID()
	{
		return this.Id;
	}
	public void setNominee(String nominee)
	{
		this.nominee=nominee;
	}
	public String getNominee()
	{
		return this.nominee;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public double getBalance()
	{
		return this.balance;
	}
	
	
	
	
}

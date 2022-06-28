import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Bank
{

	public static void main(String[] args)
	{
		Account t[]=new Account[4];
		
		t[0]=new Account("Eshmum","19-5860-1","Bata",50000);
		t[1]=new DebitAccount("Hamid","19-9546-2","Apex",6000.000);
		t[2]=new CreditAccount("Rahim","13-5628-2","Richman",80000.000);
		t[3]=new SavingsAccount("Mohesh","18-6749-3","Samsung",15000.000);
		
		t[0]. printAccount();
		t[1]. printAccount();
		t[2]. printAccount();
		t[3]. printAccount();
		
		try
		{
			FileWriter myfile=new FileWriter("Bank.txt");
			
			for(int i=0;i<t.length;i++)
			{
				myfile.write("Account Name: "+t[i].getName()+"\n");
				myfile.write("Account ID: "+t[i].getID()+"\n");
				myfile.write("Account Nominee: "+t[i].getNominee()+"\n");
				myfile.write("Account Balance: "+t[i].getBalance()+"\n");
				myfile.write("Account Deposite: "+t[i].deposit(8000)+"\n");
				myfile.write("Account WithDraw: "+t[i].withdraw(20000)+"\n");
			}
			myfile.close();
			System.out.println("Succesfully Done");
		}
		catch(IOException e)
		{
			System.out.println("Succesfully Done");
			e.printStackTrace();
		}
		try{
            
            File myfile = new File("Bank.txt");
            Scanner myReader = new Scanner(myfile);
            
            while(myReader.hasNextLine())
		    {
                
            
                System.out.println(myReader.nextLine());
            }
            
        }
        catch(IOException e)
        {
            System.out.println("File does not found");
            e.printStackTrace();
            
        }       
		
	}
	
}
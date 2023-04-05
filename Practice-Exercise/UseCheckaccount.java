 /* //Create an interface called "BankAccount" with methods called "deposit" and "withdraw". Create a class called "CheckingAccount" that implements the BankAccount interface and 
implements the "deposit" and "withdraw" methods. Create an object of the CheckingAccount
 class and call both the "deposit" and "withdraw" methods.// */
 
 
 
 interface BankAccount		//interface
{
	public void Deposit();  		//abstract method
	public void Withdraw();
}

class CheckingAccount  implements  BankAccount  	//class to implement abstract methods
{
	double deposit;								//variable declaration
	double withdrw;
	public void  Deposit()
	{
		this.deposit=3000.0;						//initialisation
		System.out.println("the Deposit amount is : " + deposit);
		}
		public void  Withdraw()
		{
			this.withdrw=500.0;
			System.out.println("the amount withdrawed :"+ withdrw);
		}
}
			
		class UseCheckaccount
		{
			public static void main(String args[])	//main method
			{
			
			CheckingAccount d2=new  CheckingAccount();		//creating object
			d2.Deposit ();									//invoking/calling methods
			d2. Withdraw();
			
			}
		}
		
		
		
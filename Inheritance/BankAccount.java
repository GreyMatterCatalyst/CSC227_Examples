public class BankAccount
{
    private double balance;
    private String customer;

    public BankAccount( double initBalance, String customer )
	{
	    this.balance = initBalance;
	    this.customer = customer;
	}

    public double getBalance( )
	{
	    return this.balance;
	}

    public String getCustomer( )
	{
	    return this.customer;
	}

    public void deposit( double amount )
	{
	    this.balance += amount;
	}

    public boolean withdraw( double amount )
	{
	    if ( ( this.balance - amount ) < 0 )
		return false;

	    this.balance -= amount;
	    return true;
	}

    public String toString( )
	{
	    return "[BankAccount] Customer: " + getCustomer( ) + " Balance: " + getBalance( );
	}

}
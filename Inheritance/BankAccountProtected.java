public class BankAccountProtected extends BankAccount
{
    private final static double MAX_CREDIT_LINE = 1000.0;
    private double creditLine;

    public BankAccountProtected( double initBalance, String customer )
	{
	    super( initBalance, customer );
	    creditLine = 0.0;
	}

    public double getCreditLine( )
	{
	    return creditLine;
	}

    public void deposit( double amount )
	{
	    if ( creditLine > 0 )
	    {
		creditLine -= amount;
		if ( creditLine < 0 )
		{
		    super.deposit( -( creditLine ) );
		    creditLine = 0.0;
		}
	    }
	    else
		super.deposit( amount );
	}

    public boolean withdraw( double amount )
	{
	    if ( amount > getBalance( ) )
	    {
		if ( creditLine + ( amount - getBalance( ) ) > MAX_CREDIT_LINE )
		    return false;

		double oldBalance = getBalance( );
		super.withdraw( oldBalance );
		amount -= oldBalance;
		creditLine += amount;
		return true;
	    }
	    else
	    {
		return super.withdraw( amount );
	    }
	}

    public String toString( )
	{
	    String output = super.toString( );
	    output += " Credit: " + getCreditLine( );
	    return output;
	}
}
public class BankAccountTest
{
    public static void main( String[] args )
	{
	    BankAccount normalAccount = new BankAccount( 200.0, "Bob" );
	    boolean withdrawResult = normalAccount.withdraw( 100.0 );
	    withdrawResult = normalAccount.withdraw( 160.0 );
	    System.out.println( normalAccount.toString( ) );

	    BankAccountProtected protectedAccount = new BankAccountProtected( 200.0, "Sue" );
	    withdrawResult = protectedAccount.withdraw( 100.0 );
	    withdrawResult = protectedAccount.withdraw( 160.0 );
	    System.out.println( protectedAccount.toString( ) );
	}
}
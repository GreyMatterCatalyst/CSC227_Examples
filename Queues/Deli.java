import java.util.LinkedList;

public class Deli {
    private LinkedList<Customer> customerQueue;

    public Deli( ) {
	customerQueue = new LinkedList<Customer>( );
    }

    public void addCustomerToServiceLine( Customer customer ) {
	// ensure the customer doesn't already exist
	if ( !customerQueue.contains( customer ) )
	    customerQueue.add( customer );
    }

    public void serveNextCustomer( ) { 
	// if no customers to serve: print out: "no customers in line"
	if ( customerQueue.isEmpty( ) )
	    System.out.println( "no customers in line" );
	else {
	    // determine next customer to server
	    // remove customer from line
	    // print out "Serving: <customer name> order: <customer order>" 
	    Customer nextCustomer = customerQueue.remove( );
	    System.out.println( "Serving: " + nextCustomer.toString( ) );
	}
    }

    public static void main( String[] args ) {
	Deli deli = new Deli( );
	Customer bob = new Customer( "Bob", "Balogne" );
	Customer joe = new Customer( "Joe", "Turkey" );
	Customer sue = new Customer( "Sue", "Ham" );
	deli.addCustomerToServiceLine( sue );
	deli.addCustomerToServiceLine( bob );
	deli.addCustomerToServiceLine( joe );

	deli.serveNextCustomer( );
	deli.serveNextCustomer( );
	deli.serveNextCustomer( );
	deli.serveNextCustomer( );
    }    
}
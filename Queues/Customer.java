public class Customer {
    private String sandwichOrder;
    private String name;

    public Customer( String name, String sandwichOrder ) {
	this.name = name;
	this.sandwichOrder = sandwichOrder;
    }
    
    public String getName( ) {
	return name;
    }

    public String getSandwichOrder( ) {
	return sandwichOrder;
    }

    public String toString( ) {
	return "Customer name: " + getName( ) + 
	    " order: " + getSandwichOrder( );
    }

    public boolean equals( Object other ) {
	if ( other instanceof Customer ) {
	    Customer otherCustomer = (Customer)other;
	    return this.name.equals( otherCustomer.getName( ) );
	}

	return false;
    }
}
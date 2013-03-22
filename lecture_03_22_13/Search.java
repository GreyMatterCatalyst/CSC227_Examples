public class Search {

    public static int search( int[] list, int value ) {
	for( int i = 0; i < list.length; i++ ) {
	    if ( value == list[i] )
		return i;
	}

	return -1;
    }

    public static void main( String[] args ) {
	int listSize = 100000;
	int[] list = new int[listSize];
	for( int i = 0; i < list.length ; i++ )
	    list[i] = i;
	
	int index = search( list, 2000 );
	if ( index >= 0 )
	    System.out.println( "index: " + index + " value: " + list[index] );
	else
	    System.out.println( "Not found" );
    }

    
}
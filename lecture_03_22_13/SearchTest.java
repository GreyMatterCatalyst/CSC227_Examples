public class SearchTest {
    public static void main( String[] args ) {
	final int LIST_SIZE = 10000000; 
	int[] list = new int[LIST_SIZE];
	for( int i = 0; i < LIST_SIZE; i++ )
	    list[i] = i;

	long startTime, endTime;

	startTime = System.currentTimeMillis( );
	int index = Search.search( list, 9999999 );
	endTime = System.currentTimeMillis( );
	System.out.printf( "Linear Search Time: %d milliseconds\n",  endTime - startTime );

	startTime = System.currentTimeMillis( );
	index = BinarySearch.search( list, 9999999 );
	endTime = System.currentTimeMillis( );
	System.out.printf( "Binary Search Time: %d milliseconds\n",  endTime - startTime );
    }
}
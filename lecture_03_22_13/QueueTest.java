public class QueueTest {
    public static void main( String[] args ) {
	final int NUM_ELEMENTS = 1000000;
	Queue<Integer> regularQueue = new Queue<Integer>( );
	ImprovedQueue<Integer> improvedQueue = new ImprovedQueue<Integer>( );
	
	for( int i = 0; i < NUM_ELEMENTS; i++ ) {
	    regularQueue.enqueue( new Integer( i ) );
	    improvedQueue.enqueue( new Integer( i ) );
	}

	long startTime, stopTime;

	startTime = System.currentTimeMillis( );
	regularQueue.enqueue( new Integer( NUM_ELEMENTS ) );
	stopTime = System.currentTimeMillis( );
	System.out.printf( "Regular Queue Insert Time: %d milliseconds\n", stopTime - startTime );

	startTime = System.currentTimeMillis( );
	improvedQueue.enqueue( new Integer( NUM_ELEMENTS ) );
	stopTime = System.currentTimeMillis( );
	System.out.printf( "Improved Queue Insert Time: %d milliseconds\n", stopTime - startTime );
    }
}
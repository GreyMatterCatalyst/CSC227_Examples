public class BinarySearch {

    public static int search( int[] list, int value ) {
	int startIndex, endIndex, midPointIndex;
	startIndex = 0;
	endIndex = list.length - 1;
	while( startIndex <= endIndex ) {
	    midPointIndex = startIndex + ( endIndex - startIndex ) / 2;
	    
	    if ( list[midPointIndex] == value )
		return midPointIndex;
	    else if ( list[midPointIndex] > value )
		endIndex = midPointIndex - 1;
	    else
		startIndex = midPointIndex + 1;
	}

	return -1;
    }

    public static void main( String[] args ) {
	int listSize = 10000;
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
import java.util.Scanner;

public class FindAndReplace
{
    public static void main( String[] args )
	{
	    String findWord = args[0];
	    String replaceWord = args[1];
	    Scanner reader = new Scanner( System.in );
	    StringBuffer buffer = new StringBuffer( );
	    while( reader.hasNext( ) )
		buffer.append( reader.nextLine( ) );

	    String[] wordArray = buffer.toString( ).split( "\\s+" );

	    for( int i = 0; i < wordArray.length; i++ )
	    {
		if ( wordArray[i].equals( findWord ) )
		     wordArray[i] = replaceWord;
	    }

	    buffer = new StringBuffer( );
	    for( String currentWord : wordArray )
	    {
		buffer.append( currentWord );
		buffer.append( " " );
	    }
	    System.out.println( buffer.toString( ) );
	}
}
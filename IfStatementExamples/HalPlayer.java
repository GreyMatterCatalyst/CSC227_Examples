import java.util.Scanner;

public class HalPlayer
{
    public static void main( String[] args )
	
	{
	    String menuString = "\nHal 9000 Sound Clip Player:\n";
	    menuString += "Select An Option:\n";
	    menuString += "[1] I'm Sorry Dave\n";
	    menuString += "[2] Enjoyable Game\n";
	    menuString += "[3] Daisy\n";
	    menuString += "[4] Feel Much Better Now\n";
	    menuString += "[Q] Quit\n\n";
	    menuString += "> ";

	    Scanner inputReader = new Scanner( System.in );
	    boolean isQuit = false;

	    while( !isQuit )
	    {
		System.out.print( menuString );
		String input = inputReader.next( );
		input = input.toUpperCase( );
		char commandChar = input.charAt( 0 );

		switch( commandChar )
		{
		case '1':
		    System.out.println( "Hal9000 Says: I'm Sorry Dave, I can't do that" );
		    break;
		case '2':
		    System.out.println( "Hal9000 Says: What an enjoyable game we're having" );
		    break;
		case 'Q':
		    System.out.println( "Hal9000 Says: Goodbye Dave" );
		    isQuit = true;
		    break;
		default:
		    System.out.println( "What??" );
		    break;
		}

		/*
		if ( input.equals( "1" ) )
		{
		    System.out.println( "Hal9000 Says: I'm Sorry Dave, I can't do that" );
		}
		else if ( input.equals( "2" ) )
		{
		    System.out.println( "Hal9000 Says: What an enjoyable game we're having" );
		}
		else if ( input.equals( "Q" ) )
		{
		    System.out.println( "Hal9000 Says: Goodbye Dave" );
		    isQuit = true;
		}
		else
		{
		    System.out.println( "What??" );
		}
		*/
	    }
	    
	}    
}

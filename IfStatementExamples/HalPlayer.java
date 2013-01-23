import java.util.Scanner;
import java.io.*;
import java.applet.*;
import java.net.*;
import java.io.File;  
import javax.sound.sampled.AudioFormat;  
import javax.sound.sampled.AudioInputStream;  
import javax.sound.sampled.AudioSystem;  
import javax.sound.sampled.DataLine;  
import javax.sound.sampled.SourceDataLine;

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

		// TODO setup branching logic to parse the inputted command and print the corresponding message
		// 
	    }
	    
	}    
}

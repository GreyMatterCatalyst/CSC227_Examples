public class Clear
{
   private short [][] things;

    public short[][] getThings( )
	{
	    short[][] copy = new short[things.length][things[0].length];
	    for( int i = 0; i < things.length; i++ )
	    {
		for( int j = 0; j < things[i].length; j++ )
		    copy[i][j] = things[i][j];
	    }

	    return copy;
	}
   
   // Assume there is a valid constructor, and that a getThings()
   // method is available
   // Complete the equals method
   public boolean equals( Clear other )
   {
       short[][] otherThings = other.getThings( );
       if ( this.things.length != otherThings.length )
	   return false;

       else if ( this.things[0].length != otherThings[0].length )
	   return false;

       for( int i = 0; i < things.length; i++ )
       {
	   for( int j = 0; j < things[i].length; j++ )
	   {
	       if ( things[i][j] != otherThings[i][j] )
		   return false;
	   }
       }

       return true;
   }
}
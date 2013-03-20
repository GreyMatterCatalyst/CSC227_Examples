import java.util.PriorityQueue;

public class EmergencyRoom {

    private PriorityQueue<Patient> triageQueue;

    public EmergencyRoom( ) {
	triageQueue = new PriorityQueue<Patient>( );
    }

    /**
     * Inserts the specified patient into this ER's queue,
     * prioritizing patient's based upon their condition.
     */
    public void triagePatient( Patient patient ) {
	triageQueue.add( patient );
    }

    /**
     * Removes the next patient from the priority queue.
     */
    public Patient treatNextPatient( ) {
	return triageQueue.remove( );
    }

    public String toString( ) {
	return triageQueue.toString( );
    }

    public static void main( String[] args ) {
	EmergencyRoom er = new EmergencyRoom( );
	er.triagePatient( new Patient( "Joe", Patient.Condition.STABLE ) );
	System.out.println( er.toString( ) );
	er.triagePatient( new Patient( "Sue", Patient.Condition.CRITICAL ) );
	System.out.println( er.toString( ) );
	er.triagePatient( new Patient( "Bob", Patient.Condition.SERIOUS ) );
	
	Patient nextPatient = er.treatNextPatient( );
	System.out.println( "Next patient: " + nextPatient );
	System.out.println( er.toString( ) );
    }
}
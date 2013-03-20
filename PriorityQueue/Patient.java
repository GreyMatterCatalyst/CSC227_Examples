
public class Patient implements Comparable<Patient>{

    public enum Condition {
	CRITICAL, SERIOUS, STABLE
	};

    private Condition condition;
    private String name;

    public Patient( String name, Condition condition ) {
	this.condition = condition;
	this.name = name;
    }

    public String getName( ) {
	return name;
    }

    public Condition getCondition( ) {
	return condition;
    }

    public void setCondition( Condition condition ) {
	condition = condition;
    }

    public String toString( ) {
	return "[Patient, name: " + name + " condition: " + condition + "]";
    }

    public int compareTo( Patient other ) {
	return condition.compareTo( other.getCondition( ) );
    }
}
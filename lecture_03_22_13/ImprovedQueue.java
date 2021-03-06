public class ImprovedQueue<E> { 

    private Node<E> head;
    private Node<E> tail;

    public ImprovedQueue( ) {
	head = new Node<E>( null, null );
	tail = head;
    }

    public void enqueue( E data ) {
	tail.setData( data );
	Node<E> newTailNode = new Node<E>( null, null );
	tail.setNext( newTailNode );
	tail = newTailNode;
    }

    public boolean isEmpty( ) {
	return head.getNext( ) == null;
    }

    public E dequeue( ) {
	if ( !isEmpty( ) ) {
	    Node<E> nextNode = head;
	    head = head.getNext( );
	    return nextNode.getData( );
	}
	else
	    return null;
    }

    public String toString( ) {
	StringBuffer buffer = new StringBuffer( "Queue: [ ");
	Node<E> currentNode = head;
	while( currentNode.getNext( ) != null ) {
	    buffer.append( currentNode.toString( ) );
	    currentNode = currentNode.getNext( );
	    if ( currentNode.getNext( ) != null )
		buffer.append( ", " );
	}
	buffer.append( " ]" );
	return buffer.toString( );
    }

    private class Node<E> {
	private Node<E> next;
	private E data;

	public Node( E data, Node<E> next ) {
	    this.data = data;
	    this.next = next;
	}

	public E getData( ) {
	    return data;
	}

	public void setData( E data ) {
	    this.data = data;
	}

	public Node<E> getNext( ) {
	    return next;
	}

	public void setNext( Node<E> next ) {
	    this.next = next;
	}

	public String toString( ) {
	    return "Node: " + data.toString( );
	}
    }

    public static void main( String[] args ) {
	ImprovedQueue<String> queue = new ImprovedQueue<String>( );
	queue.enqueue( "Bob" );
	queue.enqueue( "Sue" );
	queue.enqueue( "Joe" );
	System.out.println( queue.toString( ) );

	String dequeueValue = queue.dequeue( );
	System.out.println( "dequeue: " + dequeueValue );
	System.out.println( queue.toString( ) );

	dequeueValue = queue.dequeue( );
	System.out.println( "dequeue: " + dequeueValue );
	System.out.println( queue.toString( ) );

	dequeueValue = queue.dequeue( );
	System.out.println( "dequeue: " + dequeueValue );
	System.out.println( queue.toString( ) );

	dequeueValue = queue.dequeue( );
	System.out.println( "dequeue: " + dequeueValue );
	System.out.println( queue.toString( ) );

	queue.enqueue( "Matt" );
	System.out.println( queue.toString( ) );
    }
}
/*
Shantanu Jha
APCS2 pd9
HW28--All Hands on Deque!
2016-04-06
*/


/*****************************************************
 * interface Queue
 * Includes only methods listed in AP subset of Java
 * (Local version, to override built-in Java implementation.)
 ******************************************************/

/*
public interface Queue<Quasar> {

    //~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
    //means of removing an element from collection:
    //Dequeues and returns the first element of the queue.

    public Quasar dequeueEnd();
    public Quasar dequeueFront();
    //means of adding an element to collection:
    //Enqueue an element onto the back of this queue.

    public void enqueueEnd( Quasar x );
    public void enqueueFront( Quasar x );
    //Returns true if this queue is empty, otherwise returns false.
    public boolean isEmpty();

    //Returns the first element of the queue without dequeuing it.
    public Quasar peekFront();
    public Quasar peekEnd();


}//end interface Queue                                                                                           
*/
public class Deque<T> implements Queue<T>{
    private DLLNode<T> _front, _end;
    private int _size;
    
    public Deque() { 
	_front = null;
    _end = null;
	_size = 0;
    }


    public void enqueueEnd( T enQVal ) 
    {
	if ( isEmpty() ) {
	    _end = new DLLNode<T>( enQVal, null, null );
        _front = _end;
	}
	else {
	    _end.setNext( new DLLNode<T>( enQVal, _end, null ));
        _end = _end.getNext();
	}
	_size++;
    }

    public void enqueueFront( T enQVal ) 
    {
	if ( isEmpty() ) {
	    _front = new DLLNode<T>( enQVal, null, null );
        _end = _front;
	}
	else {
	    _front.setPrev( new DLLNode<T>( enQVal, null, _front ));
        _front = _front.getPrev();
	}
	_size++;
    }

    public T dequeueFront() 
    {
        if(_size == 0) return null;
	T foo = _front.getValue();
	_front = _front.getNext();
    if(_size > 0) _size--;
	//check for emptiness
	if ( _front == null )
	    _end = null;
	return foo;
    }

    public T dequeueEnd() 
    { 
        if(_size == 0) return null;
	T foo = _end.getValue();
	_end = _end.getPrev();
    _end.setNext(null);///why did I use this?
	//check for emptiness
	if (_size > 0) _size--;
    if ( _end == null )
	    _front = null;
	return foo;
    }

    //return next item to be dequeued
    public T peekFront() 
    {
	return _front.getValue();
    }

    public T peekEnd(){
        return _end.getValue();
    }

    /******************************************
     * void sample() -- a means of "shuffling" the queue
     * Algo:
     ******************************************/

    public boolean isEmpty() { return _front == null; }


    public String toString() 
    { 
	String foo = "";
	DLLNode<T> tmp = _front;
	while ( tmp != null ) {
	    foo += tmp.getValue() + " ";
	    tmp = tmp.getNext();
	}
	return foo;
    }





public static void main(String [] args){
    Queue<String> PirateQueue = new Deque<String>();

	System.out.println("\nnow enqueuing to front..."); 
	PirateQueue.enqueueFront("Dread");
	System.out.println( "Current Deque:" + PirateQueue ); //for testing toString()...
	PirateQueue.enqueueFront("Pirate");
	System.out.println( "Current Deque:" + PirateQueue ); //for testing toString()...
	PirateQueue.enqueueFront("Robert");
	System.out.println( "Current Deque:" + PirateQueue ); //for testing toString()...
	System.out.println("\nnow enqueuing to end..."); 
	PirateQueue.enqueueEnd("Blackbeard");
	System.out.println( "Current Deque:" + PirateQueue ); //for testing toString()...
	PirateQueue.enqueueEnd("Peter");
	System.out.println( "Current Deque:" + PirateQueue ); //for testing toString()...
	PirateQueue.enqueueEnd("Stuyvesant");
	System.out.println( "Current Deque:" + PirateQueue ); //for testing toString()...

	System.out.println("\nnow testing toString()..."); 
	System.out.println( "Current Deque:" + PirateQueue ); //for testing toString()...

	System.out.println("\nnow dequeuing from the end..."); 
	System.out.println( PirateQueue.dequeueEnd() );
	System.out.println( "Current Deque:" + PirateQueue ); //for testing toString()...
	System.out.println( PirateQueue.dequeueEnd() );
	System.out.println( "Current Deque:" + PirateQueue ); //for testing toString()...
	System.out.println( PirateQueue.dequeueEnd() );
	System.out.println( "Current Deque:" + PirateQueue ); //for testing toString()...
	System.out.println("\nnow dequeuing from the front..."); 
	System.out.println( PirateQueue.dequeueFront() );
	System.out.println( "Current Deque:" + PirateQueue ); //for testing toString()...
	System.out.println( PirateQueue.dequeueFront() );
	System.out.println( "Current Deque:" + PirateQueue ); //for testing toString()...
	System.out.println( PirateQueue.dequeueFront() );
	System.out.println( "Current Deque:" + PirateQueue ); //for testing toString()...

	
    System.out.println("\nnow dequeuing fr empty queue..."); 
	System.out.println( PirateQueue.dequeueFront() );

}
}

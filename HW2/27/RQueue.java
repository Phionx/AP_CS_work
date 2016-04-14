/*
 * Shantanu Jha
 * APCS2 pd9
 * HW27 -- Now Let’s Consider You Lot at Fake Terry’s
 * 2016-04-05
 */

/*****************************************************
 * class RQueue
 * A linked-list-based, randomized queue
 * (a collection with FIIDKO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 *  linked list points opposite direction for O(1) en/dequeuing
 *            N <- N <- ... <- N <- N
 *      _end -^                     ^- _front
 *
 ******************************************************/

public class RQueue<T> implements Queue<T> 
{
    private LLNode<T> _front, _end;
    private int _size;


    public RQueue() { 
	_front = null;
    _end = null;
	_size = 0;
    }


    public void enqueue( T enQVal ) 
    {
	if ( isEmpty() ) {
	    _end = new LLNode<T>( enQVal, null );
        _front = _end;
	}
	else {
	    _end.setNext( new LLNode<T>( enQVal, null ) );
	    _end = _end.getNext();
	}
	_size++;
    }


    public T dequeue() 
    {
    if(_size == 0) return null;
	T retVal = _front.getValue();
	_front = _front.getNext();
	if ( _front == null ) 
	    _end = null;      

	_size--;

	if ( _size > 1 )  sample();

	return retVal;
    }


    //return next item to be dequeued
    public T peekFront() 
    {
	return _front.getValue();
    }


    /******************************************
     * void sample() -- a means of "shuffling" the queue
     * Algo:
     ******************************************/
    public void sample () 
    {
	int cycles = (int)( _size * Math.random() );
	for( int i = 0; i < cycles; i++ )
	    enqueue( dequeue() );
    }


    public boolean isEmpty() { return _front == null; }


    public String toString() 
    { 
	String foo = "";
	LLNode<T> tmp = _front;
	while ( tmp != null ) {
	    foo += tmp.getValue() + " ";
	    tmp = tmp.getNext();
	}
	return foo;
    }



    public static void main( String[] args ) {

	Queue<String> PirateQueue = new RQueue<String>();

	System.out.println("\nnow enqueuing..."); 
	PirateQueue.enqueue("Dread");
	PirateQueue.enqueue("Pirate");
	PirateQueue.enqueue("Robert");
	PirateQueue.enqueue("Blackbeard");
	PirateQueue.enqueue("Peter");
	PirateQueue.enqueue("Stuyvesant");

	System.out.println("\nnow testing toString()..."); 
	System.out.println( PirateQueue ); //for testing toString()...

	System.out.println("\nnow dequeuing..."); 
	System.out.println( PirateQueue.dequeue() );
	System.out.println( PirateQueue.dequeue() );
	System.out.println( PirateQueue.dequeue() );
	System.out.println( PirateQueue.dequeue() );
	System.out.println( PirateQueue.dequeue() );
	System.out.println( PirateQueue.dequeue() );

	System.out.println("\nnow dequeuing fr empty queue..."); 
	System.out.println( PirateQueue.dequeue() );

    }//end main

}//end class RQueue

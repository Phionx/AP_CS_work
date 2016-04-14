/*
Shantanu Jha
APCS2 pd9
HW25--Brits Do Not Wait In Line
2016-04-04
*/



/*****************************************************
 * class LLQueue
 * uses a linked list to implement a QUEUE
 * (a collection with FIFO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 ******************************************************/

import java.util.NoSuchElementException;
//import java.util.RuntimException;

public class LLQueue<T> implements Queue<T> {

    private LLNode<T> _front, _end;

    // default constructor creates an empty queue
    public LLQueue()
    { 
        _front = null;
        _end = null;
    }

    // means of adding a thing to the collection
    public void enqueue( T enQVal ) 
    {
        if(isEmpty()){
            _front = new LLNode<T>(enQVal, null);
            _end = _front;
        }
        else {
            LLNode<T> newEnd = new LLNode<T>(enQVal, null);
            _end.setNext(newEnd);
            _end = newEnd;
        }
    }//O(?)


    // means of removing a thing from the collection
    // remove and return thing at front of queue
    // assume _queue ! empty
    public T dequeue() 
    {
        if(!(isEmpty())){
            return _front.setNext(_front.getNext()).getValue();
        }
        return null;
    }//O(?)


    // means of peeking at thing next in line for removal
    public T peekFront() 
    {
        return _front.getNext().getValue();
    }//O(?)


    public boolean isEmpty() 
    {
        return _front == null && _end == null;
    }//O(?)


    // print each node, separated by spaces
    public String toString() 
    { 
        
    }//O(?)



    public static void main( String[] args ) {

	/*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
	Queue<String> LLQueuelJ = new LLQueue<String>();

	System.out.println("\nnow enqueuing thrice..."); 
	LLQueuelJ.enqueue("James");
	LLQueuelJ.enqueue("Todd");
	LLQueuelJ.enqueue("Smith");

	System.out.println("\nnow testing toString()..."); 
	System.out.println( LLQueuelJ ); //for testing toString()...

	System.out.println("\nnow dequeuing thrice..."); 
	System.out.println( LLQueuelJ.dequeue() );
	System.out.println( LLQueuelJ.dequeue() );
	System.out.println( LLQueuelJ.dequeue() );

	System.out.println("\nDequeuing from empty queue should yield error..."); 
	System.out.println( LLQueuelJ.dequeue() );
	  ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

    }//end main

}//end class LLQueue

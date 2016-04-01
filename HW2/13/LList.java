/*
Shantanu Jha
APCS1 pd5
HW13--LoList LoLit
2016-03-15
*/

public class LList implements List { 

    private LLNode _head;
    private int _size;

    public LList( ) {
	_head = null; 
	_size = 0;
    }


    public boolean add( String newVal ) { 
	LLNode tmp = new LLNode( newVal, _head );
	_head = tmp;
	_size++;
	return true;
    } 


    public String get( int index ) { 

	if ( index < 0 || index >= size() )
	    throw new IndexOutOfBoundsException();

	String retVal;
	LLNode tmp = _head; //create alias to head

	for( int i=0; i < index; i++ )
	    tmp = tmp.getNext();

	retVal = tmp.getCargo();
	return retVal;
    } 


    public String set( int index, String newVal ) { 

	if ( index < 0 || index >= size() )
	    throw new IndexOutOfBoundsException();

	LLNode tmp = _head; //create alias to head

	for( int i=0; i < index; i++ )
	    tmp = tmp.getNext();

	String oldVal = tmp.getCargo();
	
	tmp.setCargo( newVal );
	
	return oldVal;
    } 


    public int size() { return _size; } 



    public void add( int index, String newVal ) {

	if ( index < 0 || index >= size() )
	    throw new IndexOutOfBoundsException();

	LLNode newNode = new LLNode( newVal, null );

	if ( index == 0 ) 
	    add( newVal );
	else {
	    LLNode tmp = _head; //create alias to head

	    for( int i=0; i < index-1; i++ )
		tmp = tmp.getNext();

	    newNode.setNext( tmp.getNext() );
	    tmp.setNext( newNode );

	    _size++;
	}
    }


    public String remove( int index ) {

	if ( index < 0 || index >= size() )
	    throw new IndexOutOfBoundsException();

	String retVal;
	LLNode tmp = _head; //create alias to head

	if ( index == 0 ) {
	    retVal = _head.getCargo();

	    _head = _head.getNext();	    
	}
	else {
	    for( int i=0; i < index-1; i++ )
		tmp = tmp.getNext();

	    retVal = tmp.getNext().getCargo();

	    tmp.setNext( tmp.getNext().getNext() );
	}

	_size--;

	return retVal;
    }


    public String toString() { 
	String retStr = "HEAD->";
	LLNode tmp = _head; //init tr
	while( tmp != null ) {
	    retStr += tmp.getCargo() + "->";
	    tmp = tmp.getNext();
	}
	retStr += "NULL";
	return retStr;
    }


    //main method for testing
    public static void main( String[] args ) {
}
}

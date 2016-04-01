/*
Shantanu Jha
APCS2 pd9
HW14--On the DLL
2016-03-16
*/


public class LList implements List { 

    
    private DLLNode _head, _tail; 
    private int _size;

    public LList( ) {
	_head = _tail = null; 
	_size = 0;
    }



    public boolean add( String newVal ) { 
	addLast( newVal );
	return true; 
    } 


    public void add( int index, String newVal ) {

	if ( index < 0 || index > size() )
	    throw new IndexOutOfBoundsException();

	else if ( index == size() ) 
	    addLast( newVal );

	DLLNode newNode = new DLLNode( newVal, null, null );

	if ( index == 0 ) 
	    addFirst( newVal );
	else {
	    DLLNode tmp1 = _head; 

	    for( int i=0; i < index-1; i++ )
		tmp1 = tmp1.getNext();

	    DLLNode tmp2 = tmp1.getNext(); 

	    newNode.setNext( tmp2 );
	    newNode.setPrev( tmp1 );
	    tmp1.setNext( newNode );
	    tmp2.setPrev( newNode );

	    _size++;

	}
    }


    public String remove( int index ) {

	if ( index < 0 || index >= size() )
	    throw new IndexOutOfBoundsException();

	if ( index == 0 )
	    return removeFirst();
	else if ( index == size()-1 )
	    return removeLast();
	else {
	    DLLNode tmp1 = _head; 

	    for( int i=0; i < index-1; i++ ) {
		tmp1 = tmp1.getNext();
		System.out.println( "tmp1: " + tmp1.getCargo() );
	    }
	    String retVal = tmp1.getNext().getCargo();

	    tmp1.setNext( tmp1.getNext().getNext() );
	    System.out.println( "tmp1.getNext: " + tmp1.getNext().getCargo() );
	    tmp1.getNext().setPrev( tmp1 );

	    _size--;

	    return retVal;
	}
    }


    public String get( int index ) { 

	if ( index < 0 || index >= size() )
	    throw new IndexOutOfBoundsException();

	String retVal;
	DLLNode tmp = _head;

	for( int i=0; i < index; i++ )
	    tmp = tmp.getNext();

	retVal = tmp.getCargo();
	return retVal;
    } 


    public String set( int index, String newVal ) { 

	if ( index < 0 || index >= size() )
	    throw new IndexOutOfBoundsException();

	DLLNode tmp = _head; 

	for( int i=0; i < index; i++ )
	    tmp = tmp.getNext();

	String oldVal = tmp.getCargo();
	
	tmp.setCargo( newVal );
	
	return oldVal;
    } 


    public int size() { return _size; } 



    public void addFirst( String newFirstVal ) { 
	_head = new DLLNode( newFirstVal, null, _head );

	if ( _size == 0 ) 
	    _tail = _head;
	else 
	    _head.getNext().setPrev( _head );
	_size++;
    }

    public void addLast( String newLastVal ) { 
	_tail = new DLLNode( newLastVal, _tail, null );

	if ( _size == 0 ) 
	    _head = _tail;
	else 
	    _tail.getPrev().setNext( _tail );
	_size++;
    }

    public String getFirst() { return _head.getCargo(); }

    public String getLast() { return _tail.getCargo(); }

    public String removeFirst() { 
	String retVal = getFirst();
	if ( size() == 1 ) {
	    _head = _tail = null;
	}
	else {
	    _head = _head.getNext();
	    _head.setPrev( null );
	}
	_size--;
	return retVal;
    }

    public String removeLast() { 
	String retVal = getLast();
	if ( size() == 1 ) {
	    _head = _tail = null;
	}
	else {
	    _tail = _tail.getPrev();
	    _tail.setNext( null );
	}
	_size--;
	return retVal;
    }


    public String toString() { 
	String retStr = "HEAD->";
	DLLNode tmp = _head; 
	while( tmp != null ) {
	    retStr += tmp.getCargo() + "->";
	    tmp = tmp.getNext();
	}
	retStr += "NULL";
	return retStr;
    }


    public static void main( String[] args ) {
}
}

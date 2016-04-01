/*
Shantanu Jha
APCS1 pd5
HW12--Truckin
2016-03-14
*/

public class LList implements List { //your List interface must be in same dir

    private LLNode _head;
    private int _size;

    public LList( ) {
	_head = null; //at birth, a list has no elements
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


    public static void main( String[] args ) {

    }

}//end class LList

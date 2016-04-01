/*
Shantanu Jha
APCS1 pd5
HW12a--We Got a Big Ol
2016-03-14
*/


public class LLNode {

    private String _cargo;    //cargo may only be of type String
    private LLNode _nextNode; //pointer to next LLNode


    public LLNode( String value, LLNode next ) {
	_cargo = value;
	_nextNode = next;
    }


    public String getCargo() { return _cargo; }

    public LLNode getNext() { return _nextNode; }


    public String setCargo( String newCargo ) {
	String foo = getCargo();
	_cargo = newCargo;
	return foo;
    }

    public LLNode setNext( LLNode newNext ) {
	LLNode foo = getNext();
	_nextNode = newNext;
	return foo;
    }


    public String toString() { return _cargo.toString(); }


    public static void main( String[] args ) {


	LLNode first = new LLNode( "cat", null );

	first.setNext( new LLNode( "dog", null ) );

	first.getNext().setNext( new LLNode( "cow", null ) );


	LLNode temp = first; //create ptr to first so JGC doesn't take it
	while( temp != null ) {
	    System.out.println( temp );
	    temp = temp.getNext();
	}

    }//end main

}//end class LLNode

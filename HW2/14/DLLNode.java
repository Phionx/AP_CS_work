/*
Shantanu Jha
APCS2 pd9
HW14--On the DLL
2016-03-16
*/


public class DLLNode {

    private String _cargo;  
    private DLLNode _nextNode, _prevNode; 


    public DLLNode( String value, DLLNode prev, DLLNode next ) {
	_cargo = value;
	_nextNode = next;
	_prevNode = prev;
    }


    public String getCargo() { return _cargo; }

    public DLLNode getNext() { return _nextNode; }

    public DLLNode getPrev() { return _prevNode; }


    public String setCargo( String newCargo ) {
	String foo = getCargo();
	_cargo = newCargo;
	return foo;
    }

    public DLLNode setNext( DLLNode newNext ) {
	DLLNode foo = getNext();
	_nextNode = newNext;
	return foo;
    }

    public DLLNode setPrev( DLLNode newPrev ) {
	DLLNode foo = getPrev();
	_prevNode = newPrev;
	return foo;
    }


    public String toString() { return _cargo.toString(); }


    public static void main( String[] args ) {

}
}

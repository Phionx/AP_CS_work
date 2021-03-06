/*
Shantanu Jha
APCS1 pd5
HW47--Halving the Halves
2015-12-11
*/

/*============================================
  class OrderedArrayList
  Wrapper class for ArrayList.
  Imposes the restriction that stored items 
  must remain sorted in ascending order
  ============================================*/

//ArrayList's implementation is in the java.util package
import java.util.ArrayList;


public class OrderedArrayList {

    // instance of class ArrayList, holding objects of type Comparable 
    // (ie, instances of a class that implements interface Comparable)
    private ArrayList<Comparable> _data;


    // default constructor initializes instance variable _data
    public OrderedArrayList() {
	_data = new ArrayList<Comparable>();
    }


    public String toString() { 
	return _data.toString(); 
    }


    public Comparable remove( int index ) { 
	return _data.remove(index); 
    }


    public int size() { 
	return _data.size();
    }

    
    public Comparable get( int index ) { 
	return _data.get(index); 
    }


    // addLinear takes as input any comparable object 
    // (i.e., any object of a class implementing interface Comparable)
    // inserts newVal at the appropriate index
    // maintains ascending order of elements
    // uses a linear search to find appropriate index
    public void addLinear( Comparable newVal ) 
    { 
	for( int p = 0; p < _data.size(); p++ ) {
	    if ( newVal.compareTo( _data.get(p) ) < 0 ) { //newVal < oal[p]
		_data.add( p, newVal );
		return; //Q:why not break?
	    }
	}
	_data.add( newVal ); //newVal > every item in oal, so add to end
    }


    // addBinary takes as input any comparable object 
    // (i.e., any object of a class implementing interface Comparable)
    // inserts newVal at the appropriate index
    // maintains ascending order of elements
    // uses a binary search to find appropriate index
    public void addBinary( Comparable newVal ) { 
	//initialize upperbound, lowerbound and median
	if (_data.size() == 0) {
		_data.add(newVal);
		return;
	}
	int lo = 0;
	int med = _data.size()/2;
	int hi = _data.size();
    	while(hi!=med && lo !=med){
		if(_data.get(med).compareTo(newVal) == 0){
			_data.add(med, newVal);
			return;
		} else if (_data.get(med).compareTo(newVal) > 0){
			hi = med;
			med = (med-lo)/2 + lo;
		} else {
			lo = med;
			med = (hi - med)/2 + med;
		}
	}
	if(_data.get(med).compareTo(newVal) < 0) med++;
	_data.add(med, newVal);
    }

			
			
			


    // main method solely for testing purposes
    public static void main( String[] args ) 
    {
	OrderedArrayList Franz = new OrderedArrayList();

	System.out.println("\nValues to add via addLinear() calls:");

	// testing linear search
	for( int i = 0; i < 15; i++ ) {
	    System.out.println("Franz" + Franz);
	    int valToAdd = (int)( 50 * Math.random() );
	    System.out.println( valToAdd );
	    Franz.addBinary( valToAdd );
	}

	System.out.println("\nafter population via addLinear() calls:");
	System.out.println( Franz );
	System.out.println();

	/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }

}//end class OrderedArrayList
 

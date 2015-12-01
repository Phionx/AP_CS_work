/*
Shantanu Jha
APCS1 pd5
HW39--Array of Steel
2015-12-01
*/

/*****************************
 * SKELETON for
 * class SuperArray --  A wrapper class for an array. 
 * Maintains functionality:
 *  access value at index
 *  overwrite value at index
 * Adds functionality to std Java array:
 *  resizability
 *  ability to print meaningfully
 *****************************/

public class SuperArray {

		//~~~~~INSTANCE VARS~~~~~
		//underlying container, or "core" of this data structure:
    private int[] _data;

		//position of last meaningful value
    private int _lastPos;

		//size of this instance of SuperArray
		private int _size;

		
		//~~~~~METHODS~~~~~
    //default constructor  initializes 10-item array
    public SuperArray() {
	data = new int[10];
	 }

		
    //output array in [a,b,c] format, eg
    // {1,2,3}.toString() -> "[1,2,3]"
    public String toString() { 
	for(int i: data
	}

		
    //double capacity of this SuperArray
    private void expand() { }

		
    //accessor -- return value at specified index
    public int get( int index ) { }

		
    //mutator -- set value at index to newVal, 
    //           return old value at index
    public int set( int index, int newVal ) { }


		//main method for testing
		public static void main( String[] args ) {
				//*****INSERT ADEQUATE TEST CALLS HERE*****
		}//end main
		
}//end class

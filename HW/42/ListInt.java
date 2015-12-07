/*
Leith Conybeare, Shantanu Jha
APCS1 pd5
HW42--Array of Titanium
2015-12-06
*/

public interface ListInt {

    void add( int newVal );
    //no return
    //adds newVal to beginning of array
    //right justified
    
    void addAtIndex( int newVal, int index );
    //adds newVal at index, shifting errythang to the right
    //fails for index >= size
    
    void remove( int index );
    //removes value at index, shifting everything in front to the left
    
    int size();
    //returns the number of meaningful values in the array
    //one more than _lastPos
    
}

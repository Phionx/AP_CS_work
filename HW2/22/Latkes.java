 /*
Shantanu Jha
APCS2 pd9
HW22--Standardization
2016-03-31
*/


public class Latkes<T> implements Stack<T> {

    private T [] _stack;
    public int _stackSize;

    //constructor
    public Latkes( int size ) 
    { 
        _stackSize = 0;
        _stack = (T[]) new Object[size];
    }
    public Latkes(){
        this(20);
    }

    //means of insertion
    public void push( T s ) 
    {
        if(isFull()){
            T [] temp = (T[])new Object [_stackSize*2];
            for(int i = 0; i < _stackSize; i++){
                temp[i] = _stack[i];
            }
            _stack = temp;
        }
        if(_stackSize < _stack.length){
            _stack[_stackSize] = s;
            _stackSize++;
        }

    }

    //means of removal
    public T pop( ) 
    { 
        if(_stackSize > 0){
            T temp = _stack[_stackSize-1];
            _stack[_stackSize-1] = null;
            _stackSize--;
            return temp;
        }
        else {
            _stackSize = 0;
            _stack[0] = null;
            return null;
        }

    }

    //chk for emptiness
    public boolean isEmpty() 
    { 
        return _stackSize == 0;
    }

    //chk for fullness
    public boolean isFull() 
    {
        return _stackSize == _stack.length;
    }

    public T peek(){
        if(_stackSize != 0) return _stack[_stackSize-1];
        return (T)"";
    }

    //main method for testing
    public static void main( String[] args ) {
	Latkes tastyStack = new Latkes(10);

	tastyStack.push("aoo");
	tastyStack.push("boo");
	tastyStack.push("coo");
	tastyStack.push("doo");
	tastyStack.push("eoo");
	tastyStack.push("foo");
	tastyStack.push("goo");
	tastyStack.push("hoo");
	tastyStack.push("ioo");
	tastyStack.push("joo");
	tastyStack.push("coocoo");
	tastyStack.push("cachoo");

	//cachoo
	System.out.println( tastyStack.pop() );
	//coocoo
	System.out.println( tastyStack.pop() );
	//joo
	System.out.println( tastyStack.pop() );
	//ioo
	System.out.println( tastyStack.pop() );
	//hoo
	System.out.println( tastyStack.pop() );
	//goo
	System.out.println( tastyStack.pop() );
	//foo
	System.out.println( tastyStack.pop() );
	//eoo
	System.out.println( tastyStack.pop() );
	//doo
	System.out.println( tastyStack.pop() );
	//coo
	System.out.println( tastyStack.pop() );
	//boo
	System.out.println( tastyStack.pop() );
	//aoo
	System.out.println( tastyStack.pop() );

	//stack empty by now; SOP(null)
	System.out.println( tastyStack.pop() );

    }//end main()

}//end class Latkes

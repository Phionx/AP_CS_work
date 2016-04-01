/*
 * Shantanu Jha
 * APCS2 pd9
 * HW20 -- Stacks on Stacks on Stacks on Stacks…
 * 2016-03-29
 */

/*****************************************************
 * skeleton for class Latkes
 * Implements a stack of Strings using an array as underlying container.
 *****************************************************/

public class Latkes {

    private String [] _stack;
    public int _stackSize;

    //constructor
    public Latkes( int size ) 
    { 
        _stackSize = 0;
        _stack = new String [size];
    }

    //means of insertion
    public void push( String s ) 
    {
        if(isFull()){
            String [] temp = new String [_stackSize*2];
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
    public String pop( ) 
    { 
        if(_stackSize > 0){
            String temp = _stack[_stackSize-1];
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

    public String peek(){
        if(_stackSize != 0) return _stack[_stackSize-1];
        return "";
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
